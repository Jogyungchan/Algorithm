package _function;

public class B_15596 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5}; 
		System.out.println(sum(a));
	}

	private static long sum(int[] a) {
		long sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		
		return sum;
	}

}
