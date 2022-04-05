package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study_9 {

	public static void main(String[] args) throws IOException {
		// 문자열에서 숫자만 추출하여 순서대로 자연수를 만드는 프로그램.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		
		// 숫자만 더해주기 위해 스트링 변수 
		String s = "";
		// 반복문을 통해 문자열에서 숫자만 추출하여 스트링 변수에 더해준다. 
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) s+=x;
		}
		// 처음 시작이 0인 경우를 없애기 위해
		System.out.println(Integer.parseInt(s));
	}

}
