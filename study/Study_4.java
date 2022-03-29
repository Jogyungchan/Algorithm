package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study_4 {

	public static void main(String[] args) throws IOException {
		// 1줄에 몇개의 단어를 입력할지 자연수를 입력. 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int val = Integer.parseInt(br.readLine());
		String[] str = new String[val];
		
		// 그 수만큼 단어를 입력
		for(int i=0; i<val; i++) {
			str[i] = br.readLine();
		}
		br.close();
		
		// 입력받은 단어를 하나씩 뒤집어서 출력
		for(int i=0; i<val; i++) {
			str[i] = new StringBuilder(str[i]).reverse().toString();
			System.out.println(str[i]);
		}
	}

}
