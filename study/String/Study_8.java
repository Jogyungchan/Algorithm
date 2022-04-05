package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study_8 {

	public static void main(String[] args) throws IOException {
		// 앞에서 읽을 때나 뒤에서 읽을 때 같은 문자열을 팰린드롬이라고 한다.
		// 대소문자를 구분 않고, 특수문자를 제외한 문자열이 팰린드롬이면 "YES" 출력, 아니면 "NO"를 출력. 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		
		// 대소문자 구분를 하지 않고 특수 문자를 제외하기 위해 문자열을 바꿔준다.
		str = str.toLowerCase().replaceAll("[^a-z]", "");
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
