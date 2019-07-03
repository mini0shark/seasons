package ex4;

public class ArrayUtils {
	static double [] intToDouble(int[] source) {
		double result[] = new double[source.length];
		for(int i=0; i<source.length ; i++) {
			result[i]= (double)source[i]; 
		}
		return result;
	}
	static int [] doubleToInt(double[] source) {
		int result[] = new int[source.length];
		for(int i=0; i<source.length ; i++) {
			result[i]= (int)source[i]; 
		}
		return result;
		
	}

	static int [] concat(int[] s1, int[] s2) {
		int[] result= new int[s1.length+s2.length];
		System.arraycopy(s1, 0, result, 0, s1.length);
		System.arraycopy(s2, 0, result, s1.length, s2.length);
		return result;
	}
}
