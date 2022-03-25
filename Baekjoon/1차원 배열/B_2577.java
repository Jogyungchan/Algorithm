package _array;

import java.util.Scanner;

public class B_2577 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt()*scan.nextInt()*scan.nextInt();
		scan.close();
		
		int[] arr = new int[10];
		while(val!=0) {
			int a = val%10;
			arr[a]++;
			val/=10;
		}
		for(int x : arr) {
			System.out.println(x);
		}
	}

}
