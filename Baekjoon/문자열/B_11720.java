package _string;

import java.util.Scanner;

public class B_11720 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int val = scan.nextInt();
		String str = scan.next();
		scan.close();

		int sum=0;
		for(int i=0; i<val; i++) {
			sum += str.charAt(i)-48;
		}
		System.out.println(sum);
	}

}
