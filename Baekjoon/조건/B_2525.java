package gyungchan.study;

import java.util.Scanner;

public class B_2525 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		
		a += c/60;
		b += c%60;
		if(b>59) {
			a+=1;
			b-=60;
		}
		if(a>23) {
			a-=24;
		}
		System.out.println(a+" "+b);
	}

}
