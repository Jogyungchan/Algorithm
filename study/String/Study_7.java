package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study_7 {

	public static void main(String[] args) throws IOException {
		// 앞에서 읽을 때나 뒤에서 읽을 때 같은 문자열을 회문 문자열이라고 한다.
		// 대소문자 구분 않고 회문 문자열이면 "YES" 출력, 아니면 "NO"를 출력.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		
		// 대소문자 구분을 않기 위해 문자열을 소문자로 바꾸어준다.
		str = str.toLowerCase();
		// 처음과 끝 문자가 같은지 비교, 같다면 처음+1 문자와 끝 -1 비교
		// 다음과 같은 방법으로 계속 진행되고 회문 문자열이면 "YES" 출력 아니면 "NO" 출력.
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}

}
