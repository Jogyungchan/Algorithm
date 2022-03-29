package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study_2 {

	public static void main(String[] args) throws IOException {
		// 문자열을 입력받아 대문자는 소문자로 출력, 소문자는 대문자로 출력 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		StringBuilder sb = new StringBuilder();
		
		// 소문자, 대문자를 아스키코드를 이용하여 구분하고
		// 소문자이면 해당 아스키코드 값만큼 빼주고 대문자이면 반대로 더해준다. 
		for(char x : str.toCharArray()) {
			if(97<=x && x<=122) x -= 32;
			else x += 32;
			sb.append(x);
		}
		System.out.println(sb);
	}

}
