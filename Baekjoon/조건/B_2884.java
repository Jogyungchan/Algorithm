package gyungchan.study;

import java.util.Scanner;

public class B_2884 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		scan.close();
		
		if(m<45) {
			h--;
			m=60-(45-m);
			if(h<0) {
				h=23;
			}
			System.out.println(h+" "+m);
		}
		else {
			System.out.println(h+" "+(m-45));
		}
	}

}
