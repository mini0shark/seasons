package tv;

public class TVfactory {
	public TV getTV(String tvName) {
		TV tv = null;
		if("s".equals(tvName))
			tv = new STV();
		else if("l".equals(tvName))
			tv = new LTV();
		return tv;
	}
}
