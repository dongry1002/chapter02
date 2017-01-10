package chapter02;

public class ArrayUtilTest {

	public static void main(String[] args) {
		
		int[] a={10,20,30,40};
	
		double[] d= ArrayUtil.intToDouble(a);
		
		for(double v:d){
		System.out.println(v);
		}
		
		double[] d1= {3.14,20.8,30.4};
		int[] a1 = ArrayUtil.doubletoInt(d1);
		
		for(double a2 : a1){
			System.out.println(a2);
		}
	
	
	
	int[] a2={1,2,3,4,5};
	int[] a3={6,7,8,9,10};
	int[] a4=ArrayUtil.concat(a2, a3);
	
	for(int v1:a4){
		System.out.print(v1);
	}
}
}

