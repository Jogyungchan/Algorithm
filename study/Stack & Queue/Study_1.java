package study_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Study_1 {

	public static void main(String[] args) throws IOException {
		// 괄호 입력이 올바르면 "YES" 아니면 "NO"를 출력하는 프로그램.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		
		Stack<Character> stack = new Stack<>();
		String answer = "YES";
		for(char x : str.toCharArray()) {
			if(x=='(') {
				stack.push(x);
			}
			else {
				// ')'괄호가 들어왔는데 '('괄호가 들어있지 않다면 잘못된 입력이므로 "NO"로 값을 바꾸고 반복문 중단.
				if(stack.isEmpty()) {
					answer="NO";
					break;
				}
				// ')'괄호가 들어왔다면 '('괄호를 pop해준다.
				stack.pop();
			}
		}
		// 반복문을 다 돌았는데 stack에 '('괄호가 남아있다면 이 입력또한 잘못된 것이기 때문에 "NO"로 값을 바꾼다.
		if(!stack.isEmpty()) answer="NO";
		System.out.println(answer);
	}

}
