package _string;

import java.util.Scanner;

public class B_2941 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		
		int count=0;
		for(int i=0; i<str.length(); i++) {
			count++;
			if(str.charAt(i)=='=' && (i-1>=0)) {
				if(str.charAt(i-1)=='c' || str.charAt(i-1)=='s') {
					count-=1;
				}
				else if(str.charAt(i-1)=='z') {
					count-=1;
					if((i-2>=0) && str.charAt(i-2)=='d') count-=1;
				}
			}
			else if(str.charAt(i)=='-' && (i-1>=0)) {
				if(str.charAt(i-1)=='c' || str.charAt(i-1)=='d') {
					count-=1;
				}
			}
			else if(str.charAt(i)=='j' && (i-1>=0)) {
				if(str.charAt(i-1)=='l' || str.charAt(i-1)=='n') {
					count-=1;
				}
			}
		}
		System.out.println(count);
	}

}
