
public class TV {
 int channel;
 int volume;
 boolean power;
 
 TV(int channel,int volume,boolean power){
	 this.channel=channel;
	 this.volume=volume;
	 this.power=power;
 }
 
 public int channelUP() {
	 return channel++;
 }
 
 public int channelDown() {
	 return channel--;
 }
 
 public int volumeUp() {
	 return volume++;
 }
 
 public int volumeDown() {
	 return volume--;
 }
 
 public boolean powerOn() {
	 return true;
 }
 
 public boolean powerOff() {
	return false;
 }
 
 public int setChannel() {
	 return channel;
 }
 
 public void getChannel(int channel) {
	 this.channel=channel;
 }
 
 public void isPower(boolean power) {
	 this.power=power;
 }
 
 public void getVolume(int volume) {
	 this.volume=volume;
 }
 
 
 
 
 
}
