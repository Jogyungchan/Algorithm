package _array;

import java.util.Scanner;

public class B_4344 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int val = scan.nextInt();
		int[] arr;
		
		for(int i=0; i<val; i++) {
			int a = scan.nextInt();
			double sum=0;
			double count=0;	
			arr = new int[a];
			
			for(int j=0; j<a; j++) {
				arr[j] = scan.nextInt();
				sum+=arr[j];
			}
			
			for(int j=0; j<a; j++) {
				if((sum/a) < arr[j]) {
					count++;
				}
			}
			System.out.printf("%.3f", count/a*100);	
		}
		scan.close();
	}

}
