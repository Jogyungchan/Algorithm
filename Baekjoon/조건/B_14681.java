package gyungchan.study;

import java.util.Scanner;

public class B_14681 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		
		if(x>0) {
			if(y>0) System.out.println(1);
			else System.out.println(4);
		}
		else {
			if(y>0) System.out.println(2);
			else System.out.println(3);
		}

	}

}
