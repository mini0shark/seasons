package ex7;

public class TVTest {
	public static void main(String[] args) {
		TV tv = new TV(7,20,false);
		tv.power();
		for(int i= 0; i<27; i++)
			tv.volumeUp();

		tv.printState();
		for(int i= 0; i<35; i++)
			tv.channelUp();

		tv.printState();
		for(int i= 0; i<7; i++)
			tv.volumeDown();
		tv.power();
		tv.printState();
	}
}
