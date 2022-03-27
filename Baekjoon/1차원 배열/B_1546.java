package _array;

import java.util.Scanner;

public class B_1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		double[] d = new double[val];
		
		double max = 0;
		double sum = 0;
		for(int i=0; i<val; i++) {
			d[i]=scan.nextDouble();
			if(d[i]>max) max=d[i];
		}
		scan.close();
		for(int i=0; i<val; i++) {
			d[i] = d[i]/max*100;
			sum+=d[i];
		}
		System.out.println(sum/val);
	}

}
