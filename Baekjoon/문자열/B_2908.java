package _string;

import java.util.Scanner;

public class B_2908 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(new StringBuilder().append(scan.nextInt()).reverse().toString());
		int b = Integer.parseInt(new StringBuilder().append(scan.nextInt()).reverse().toString());
		scan.close();
		
		if(a>b) System.out.println(a);
		else System.out.println(b);
	}

}
