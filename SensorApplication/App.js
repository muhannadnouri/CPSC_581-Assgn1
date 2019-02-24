import React from 'react';
import { StyleSheet, View, ViewPagerAndroid , Image, BackHandler } from 'react-native';
import { Accelerometer, Audio } from 'expo';

export default class App extends React.Component {
  
  constructor(props) {

    super(props);
    
    this.state = {
      unlockKey: 7,
      unlockSensitivity: 5,
      action: false,
      unlocked: false,
      position: 0,
    };

    // Loading in Sound
    this.keySound = new Audio.Sound();
    this.cardSound = new Audio.Sound();
    this.zeldaSound = new Audio.Sound();
    this.errorSound = new Audio.Sound();
    try{
      this.keySound.loadAsync(require('./assets/KeyUnlock.mp3'));
      this.cardSound.loadAsync(require('./assets/CardUnlock.mp3'));
      this.zeldaSound.loadAsync(require('./assets/ZeldaChest.mp3'));
      this.errorSound.loadAsync(require('./assets/Error.mp3'));
    }
    catch(e){
      //Do nothing
    }
  }  
  
  componentDidMount() {
    // Adding Accelerometer
    this._subscription = Accelerometer.addListener(accelerometerData => {
      let {x, y, z} = accelerometerData;
      x = Math.round(x * 100);
      y = Math.round(y * 100);
      z = Math.round(z * 100);
      // If we satisfy first condition
      if (x > (100 - this.state.unlockSensitivity)){
        this.setState({action:true});
        if (this.state.position == 5){
          this.cardSound.playAsync();
        }
        else {
          this.keySound.playAsync();
        }
      }
      // If we satisfy second condition
      if (z < (-100 + this.state.unlockSensitivity) && this.state.action){
        this.setState({unlocked:true});
        
        // Correct Key Zelda
        if (this.state.position == 7){
          this.zeldaSound.playAsync();
          setTimeout(() => {
            BackHandler.exitApp();
          }, 5000)
        }
        else {
          this.errorSound.replayAsync();
        }
      }

      // If we move to right, reset state
      if (x < 0){
        this.setState({action:false});
        this.keySound.stopAsync();
        this.keySound.setPositionAsync(0);
        this.cardSound.stopAsync();
        this.cardSound.setPositionAsync(0);
      }
    });
  }

  componentWillUnmount() {
    // Remove Accelerometer
    this._subscription && this._subscription.remove();
    this._subscription = null;
  }
  
  handlePageSelected = ({nativeEvent}) => {
    // Reset Sound
    this.keySound.stopAsync();
    this.keySound.setPositionAsync(0);
    this.cardSound.stopAsync();
    this.cardSound.setPositionAsync(0); 
    this.zeldaSound.stopAsync();
    this.zeldaSound.setPositionAsync(0); 
    this.errorSound.stopAsync();
    this.errorSound.setPositionAsync(0); 
    // Reset states and update page position
    this.setState({action:false, unlocked:false});
    let {position} = nativeEvent;
    this.setState({position});
  }

  render() {
    let bgColor = styles.locked;
    if (this.state.unlocked){
      bgColor = this.state.position == this.state.unlockKey ? styles.unlocked : styles.error;
    }
    return (
      <ViewPagerAndroid 
        style={[styles.viewPager, bgColor]} 
        initialPage={0} 
        onPageSelected={this.handlePageSelected}>
        <View style={styles.container} key="0">
          <Image source={require('./assets/House.png')} style={styles.key}/>
        </View>
        <View style={styles.container} key="1">
          <Image source={require('./assets/HarryPotter.png')} style={styles.key}/>
        </View>
        <View style={styles.container} key="2">
          <Image source={require('./assets/KingdomHearts.png')} style={styles.key}/>
        </View>
        <View style={styles.container} key="3">
          <Image source={require('./assets/LotR.png')} style={styles.key}/>
        </View>
        <View style={styles.container} key="4">
          <Image source={require('./assets/Pirates.png')} style={styles.key}/>
        </View>
        <View style={styles.container} key="5">
          <Image source={require('./assets/Pokemon.png')} style={styles.key}/>
        </View>
        <View style={styles.container} key="6">
          <Image source={require('./assets/Spongebob.png')} style={styles.key}/>
        </View>
        <View style={styles.container} key="7">
          <Image source={require('./assets/Zelda.png')} style={styles.key}/>
        </View>
      </ViewPagerAndroid>
    );
  }
}

const styles = StyleSheet.create({
  viewPager: {
    flex: 1,
  },
  key: {
    width: '100%',
    resizeMode: 'contain',
  },
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  locked: {
    backgroundColor: 'darkgray',
  },
  unlocked: {
    backgroundColor: 'green',
  },
  error: {
    backgroundColor:'red'
  },
});
