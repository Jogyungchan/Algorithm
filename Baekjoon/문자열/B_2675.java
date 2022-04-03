package _string;

import java.util.Scanner;

public class B_2675 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<val; i++) {
			String answer="";
			int a = scan.nextInt();
			String str = scan.next();
			for(int j=0; j<str.length(); j++) {
				for(int k=0; k<a; k++) {
					answer+=str.charAt(j);
				}
			}
			sb.append(answer).append("\n");
		}
		scan.close();
		System.out.println(sb);
	}

}
