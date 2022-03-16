package _for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2741 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int val = Integer.parseInt(br.readLine());
		br.close();
		
		for(int i=1; i<=val; i++) {
			System.out.println(i);
		}
	}

}
