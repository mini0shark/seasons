package day06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class Ball{
	private int ballNaumber;
	public Ball(int ballNaumber){
		this.ballNaumber = ballNaumber;
	}
	public String toString() {
		return ballNaumber+"";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ballNaumber;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ball other = (Ball) obj;
		if (ballNaumber != other.ballNaumber)
			return false;
		return true;
	}
	
}
public class CollectionTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("kang");
		list.add("kim");
		list.add("lee");
		list.add("kang");
		System.out.println(list);
		
		Set<String> name = new HashSet<>();
		name.add("kang");
		name.add("kim");
		name.add("lee");
		name.add("kang");
		System.out.println(name);
		
		Set<Ball> ballSet = new HashSet<>();
		ballSet.add(new Ball(1));
		ballSet.add(new Ball(2));
		ballSet.add(new Ball(1));
		ballSet.add(new Ball(2));
		System.out.println(ballSet);
		
		Iterator<Ball> iter = ballSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
