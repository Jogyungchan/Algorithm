package study_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Study_2 {

	public static void main(String[] args) throws IOException {
		// 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			// 문자가 ')'일때 '('문자까지 계속 pop 시켜준다.
			if(x==')') {
				while(stack.pop()!='(');
			}
			// 문자가 ')'가 아니라면 계속 stack에 넣어준다.
			else {
				stack.push(x);
			}
		}
		// stack에 남은 문자 출력 
		for(int i=0; i<stack.size(); i++) {
			System.out.print(stack.get(i));
		}
	}

}
