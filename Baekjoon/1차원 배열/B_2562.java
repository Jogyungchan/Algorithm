package _array;

import java.util.Scanner;

public class B_2562 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[9];
		int max=0;
		int count=0;
		for(int i=0; i<9; i++) {
			arr[i]=scan.nextInt();
			if(arr[i]>max) {
				max=arr[i];
				count=i+1;
			}
		}
		scan.close();
		System.out.println(max);
		System.out.println(count);
	}

}
