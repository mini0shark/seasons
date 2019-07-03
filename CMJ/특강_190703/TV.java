package CMJ.Ư��_190703;

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
		System.out.println("ä���� �ø��ϴ�.");
	}
	
	public void channelDown() {
		this.channel--;
		System.out.println("ä���� �����ϴ�.");
	}
	
	public void volumeUp() {
		if(this.volume > 20) {
			System.out.println("���� �ִ�ġ");
			this.volume = 20;
		} else {
			this.volume++;
			System.out.println("����: " + volume);
		}
	}
	
	public void volumeDown() {
		if(this.volume < 0) {
			System.out.println("���� �ּ�ġ");
			this.volume = 0;
		} else {
			this.volume--;
			System.out.println("����: " + volume);
		}
	}
	
	public void powerOn() {
		System.out.println("TV�� �����ϴ�.");
		this.power = true;
	}
	
	public void powerOff() {
		System.out.println("TV�� �����ϴ�.");
		this.power = false;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.println(channel + "�� ä���Դϴ�.");
	}
	
	public int getChannel() {
		System.out.print("ä��: ");
		return this.channel;
	}
	
	public boolean isPower() {
		System.out.print("���� : ");
		return this.power;
	}
	
	public int getVolume() {
		System.out.print("����: ");
		return this.volume;
	}
}