package _array;

import java.util.Scanner;

public class B_8958 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		String[] str = new String[val];
		for(int i=0; i<val; i++) {
			str[i] = scan.next();
		}
		scan.close();
		
		for(int i=0; i<val; i++) {
			int count = 0;
			int sum = 0;
			for(int j=0; j<str[i].length(); j++) {
				if(str[i].charAt(j)=='O') {
					count++;
					sum+=count;
				}else count=0;
			}
			System.out.println(sum);
		}
	}

}
