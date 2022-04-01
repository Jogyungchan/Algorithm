package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study_12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		// '#' 문자는 1로 변경, '*' 문자는 0으로 변경 
		String str = br.readLine().replace("#", "1").replace("*", "0");
		br.close();
		
		String answer = "";
		for(int i=0; i<a; i++) {
			// 알파벳 하나당 문자 7개로 구성되기 때문에 7개씩 나눠준다.
			String tmp = str.substring(0,7);
			// 문자는 2진수로 되어있기 때문에 10진수로 바꿔준 후 저장.
			answer += (char)Integer.parseInt(tmp, 2);
			str = str.substring(7);
		}
		System.out.println(answer);
	}

}
