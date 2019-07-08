package CMJ.특강_190703;

import org.omg.Messaging.SyncScopeHelper;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public void channelUp() {
		this.channel++;
		System.out.println("채널을 올립니다.");
	}
	
	public void channelDown() {
		this.channel--;
		System.out.println("채널을 내립니다.");
	}
	
	public void volumeUp() {
		if(this.volume > 20) {
			System.out.println("볼륨 최대치");
			this.volume = 20;
		} else {
			this.volume++;
			System.out.println("볼륨: " + volume);
		}
	}
	
	public void volumeDown() {
		if(this.volume < 0) {
			System.out.println("볼륨 최소치");
			this.volume = 0;
		} else {
			this.volume--;
			System.out.println("볼륨: " + volume);
		}
	}
	
	public void powerOn() {
		System.out.println("TV가 켜집니다.");
		this.power = true;
	}
	
	public void powerOff() {
		System.out.println("TV가 꺼집니다.");
		this.power = false;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.println(channel + "번 채널입니다.");
	}
	
	public int getChannel() {
		System.out.print("채널: ");
		return this.channel;
	}
	
	public boolean isPower() {
		System.out.print("전원 : ");
		return this.power;
	}
	
	public int getVolume() {
		System.out.print("볼륨: ");
		return this.volume;
	}
}