package _string;

import java.util.Scanner;

public class B_10809 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		int[] arr = new int[26];
		for(int i=0; i<26; i++) {
			arr[i]=-1;
		}
		for(int i=0; i<str.length(); i++) {
			if(arr[str.charAt(i)-'a']==-1) arr[str.charAt(i)-'a']=i;
		}
		
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}

}
