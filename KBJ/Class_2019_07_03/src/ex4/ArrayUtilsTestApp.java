package ex4;

public class ArrayUtilsTestApp {
	public static void main(String[] args) {
		int[] intResult;
		double[] doubleResult;
		int intSource[] = {1,2,3,4,5,6};
		double doubleSource[] = {11.2,12.3,13.14,4.15,15.6,16.7};
		int[] conResult;
		intResult = ArrayUtils.doubleToInt(doubleSource);
		doubleResult = ArrayUtils.intToDouble(intSource);
		
		System.out.println("int To double  : ");
		for(int i =0; i<intResult.length; i++) {
			System.out.println((i+1)+"번째 : "+intResult[i]);
		}

		System.out.println("double To int  : ");
		for(int i =0; i<doubleResult.length; i++) {
			System.out.println((i+1)+"번째 : "+doubleResult[i]);
		}
		conResult = ArrayUtils.concat(intResult, intSource);
		System.out.println("double To int  : ");
		for(int i =0; i< conResult.length; i++) {
			System.out.println((i+1)+"번째 : "+conResult[i]);
		}
	}
}
