package ex7;

public class TV {
	int channel;
	int volume;
	boolean power;
	public TV(int channel, int volume, boolean power) {
		super();
		printState();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	public void channelUp(){
		channel++;
	}
	public void channelDown(){
		channel--;
	}
	public void volumeUp() {
		volume++;
	}
	public void volumeDown() {
		volume--;
	}
	public void power() {
		power=!power;
	}
	public void setChannel(int channel) {
		this.channel = channel;
		printState();
	}
	public int getChannel() {
		return channel;
	}
	public boolean isPower() {
		printState();
		return power;
	}
	public int getVolume() {
		printState();
		return volume;
	}
	public void printState() {
		System.out.printf("현재 채널은 %d, 볼륨은 %d 이고 전원이 ",channel,volume);
		System.out.println(power?"켜져있습니다.":"꺼져있습니다.");
	}
}
