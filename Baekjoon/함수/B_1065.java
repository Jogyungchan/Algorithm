package _function;

import java.util.Scanner;

public class B_1065 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		scan.close();
		
		System.out.println(n(val));
	}

	private static int n(int val) {
		int count=0;
		if(1<=val && val<=99) {
			return val;
		}
		else if(100<=val && val<=1000) {
			if(val==1000) val=999;
			
			count=99;
			for(int i=100; i<=val; i++) {
				int a=i/100;
				int b=(i-(a*100))/10;
				int c=i%10;
				if(2*b==a+c) {
					count++;
				}
			}
		}
		return count;
	}
}
