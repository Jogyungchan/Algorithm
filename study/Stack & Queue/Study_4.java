package study_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Study_4 {

	public static void main(String[] args) throws IOException {
		// 후위식 연산식이 주어지면 연산한 결과를 출력하는 프로그램.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		
		Stack<Integer> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			// 연삭식에 숫자이면 stack에 push 해준다.
			if(Character.isDigit(x)) {
				stack.push(x-48);
			}
			// 연산자가 들어오면 해당 연산에 맞게 계산하고 다시 결과를 stack에 push한다.
			else {
				int b = stack.pop();
				int a = stack.pop();
				switch(x) {
				case '+':
					stack.push(a+b);
					break;
				case '-':
					stack.push(a-b);
					break;
				case '*':
					stack.push(a*b);
					break;
				case '/':
					stack.push(a/b);
					break;
				}
			}
		}
		// stack에 남아있는 값이 연산 결과이므로 결과값 출력. 
		System.out.println(stack.get(0));
	}

}
