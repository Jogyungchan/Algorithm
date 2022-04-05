package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study_5 {

	public static void main(String[] args) throws IOException {
		// 영어 알파벳과 특수문자로 구성된 문자열에서 영어 알파벳만 뒤집고, 특수문자는 그대로 유지하는 프로그램.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		
		// 문자열을 문자로 변형시켜서 문자를 확인한다.
		char[] arr = str.toCharArray();
		
		int lt = 0;
		int rt = str.length()-1;
		while(lt<rt) {
			// 왼쪽으로부터 문자가 특수문자이면 그대로 통과하도록 코드 구현
			if(!Character.isAlphabetic(arr[lt])) {
				lt++;
			}
			// 오른쪽으로부터 문자가 특수문자이면 그대로 통과하도록 코드 구현 
			else if(!Character.isAlphabetic(arr[rt])) {
				rt--;
			}
			// 만약 알파벳인 두 문자가 만났을 때 변경.
			else {
				char tmp = arr[lt];
				arr[lt] = arr[rt];
				arr[rt] = tmp;
				lt++;
				rt--;
			}
		}
		System.out.println(arr);
	}

}
