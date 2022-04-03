package _string;

import java.util.Scanner;

public class B_1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		str = str.toUpperCase();
		
		int[] arr = new int[26];
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i)-'A']++;
		}
		
		int max = 0;
		char c = '?';
		for(int i=0; i<26; i++) {
			if(arr[i]>max) {
				max=arr[i];
				c=(char)(i+65);
			}
			else if(arr[i]==max) c='?';
		}
		System.out.println(c);
	}

}
