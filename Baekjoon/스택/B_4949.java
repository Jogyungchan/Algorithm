package _stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_4949 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		String answer = "yes";
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = br.readLine();
			if(str.equals(".")) break;
			for(char x : str.toCharArray()) {
				if(x=='(') stack.push(x);
				else if(x=='[') stack.push(x);
				else if(x==')') {
					if(stack.isEmpty() || stack.peek()!='(') {
						answer="no";
						break;
					}
					stack.pop();
				}
				else if(x==']') {
					if(stack.isEmpty() || stack.peek()!='[') {
						answer="no";
						break;
					}
					stack.pop();
				}
			}
			if(!stack.isEmpty()) answer="no";
			sb.append(answer).append("\n");
			answer="yes";
			stack.clear();
		}
		br.close();
		System.out.println(sb);
	}

}