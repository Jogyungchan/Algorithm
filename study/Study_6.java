package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study_6 {

	public static void main(String[] args) throws IOException {
		// 중복 문자를 제거하고 출력하는 프로그램 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			// 해당 문자에 indexOf 함수를 이용해 중복 문자를 찾고 중복 문자가 아니면 출력.
			if(str.indexOf(str.charAt(i))==i) {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb);
	}

}
