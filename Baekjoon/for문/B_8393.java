package _for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_8393 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int val = Integer.parseInt(br.readLine());
		br.close();
		int sum=0;
		
		for(int i=1; i<=val; i++) {
			sum+=i;
		}
		
		System.out.println(sum);
	}

}
