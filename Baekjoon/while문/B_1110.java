package _while;

import java.util.Scanner;

public class B_1110 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int val = scan.nextInt();
		scan.close();
		int a=val;
		int count=0;
		while(true) {
			a= ((a%10)*10)+(((a%10)+(a/10))%10);
			count++;
			if(val==a) break;
		}
		System.out.println(count);
	}

}
