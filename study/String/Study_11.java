package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study_11 {

	public static void main(String[] args) throws IOException {
		// 문자열을 입력받아 문자가 연속으로 반복되는 경우 문자 오른쪽에 반복 횟수를 표기하는 프로그램.
		// 반복횟수가 1인 경우는 문자가 입력.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		
		String answer = "";
		// 반복 횟수를 저장하기 위한 변수 
		int count = 1;
		for(int i=0; i<str.length()-1; i++) {
			// 뒤 문자와 비교하여 같으면 반복 횟수 증가.
			if(str.charAt(i)==str.charAt(i+1)) {
				count++;
			}
			// 뒤 문자와 다르고, 반복 횟수가 1이면 문자만 출력
			// 반복 횟수가 1이 아니라면 반복 횟수까지 출력 
			else {
				answer += str.charAt(i);
				if(count!=1) {
					answer += count;
				}
				count=1;
			}
		}
		
		// 이렇게 따로 구현할 수 있고, 아니면 str = str+" ";와 같이 해서 하는 방법도 있다.
		// 맨 마지막 문자는 따로 출력하기 위해 작성한 코드.
		if(str.charAt(str.length()-1)==str.charAt(str.length()-2)) {
			answer += str.charAt(str.length()-1)+String.valueOf(count);
		}
		else answer += str.charAt(str.length()-1);
		
		System.out.println(answer);
	}

}
