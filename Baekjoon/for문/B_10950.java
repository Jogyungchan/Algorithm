package _for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10950 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int val = Integer.parseInt(br.readLine());
		int[] arr = new int[val];
		
		for(int i=0; i<arr.length; i++) {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			
			arr[i]=a+b;
		}
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
