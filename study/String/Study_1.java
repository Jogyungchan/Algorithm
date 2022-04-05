package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 한 개의 문자열 입력받아 특정 문자와 비교하여 같은 문자 수만큼 출력 
		String str = br.readLine();
		char c = (char) br.read();
		br.close();
		
		//대소문자 구분이 없도록 하기 위해 문자열과 문자를 소문자로 바꿔준다.
		str = str.toLowerCase();
		c = Character.toLowerCase(c);
		
		int count = 0;
		// 반복문을 통해 문자열과 문자를 비교하면서 같으면 카운트를 1씩 증가. 
		for(char x : str.toCharArray()) {
			if(c==x) count++;
		}
		System.out.println(count);
	}

}
