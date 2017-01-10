package chapter02;

public class ArrayUtil {
	public static double[] intToDouble(int []source){
		double[] result = new double[source.length];
		for(int i=0;i<source.length;i++){
			//암시적캐스팅
			result[i]=source[i];
		}
		
		return result;
	}
	
	public static int[] doubletoInt(double[] source){
		int[] result = new int[source.length];
		for(int i=0;i<source.length;i++){
			
			result[i]=(int) source[i];
		}
		
		return result;
	}
	public static  int[] concat(int[] a, int[] b){
		if(a==null||b==null){
		return null;
	}
		int[] result = new int[a.length+b.length];
		int index=0;
		for(int i=0;i<a.length;i++){
			result[index++]=a[i];
		  //result[index]=a[i];
		  //index++;
			
		}

		for(int i=0;i<b.length;i++,index++){
			result[index]=b[i];
		}
		
		return result;
	}
}
