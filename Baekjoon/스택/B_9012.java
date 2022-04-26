package _stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n];
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			String answer = "YES";
			str[i]=br.readLine();
			for(char x : str[i].toCharArray()) {
				if(x=='(') stack.push(x);
				else {
					if(stack.isEmpty()) {
						answer = "NO";
						break;
					}
					stack.pop();
				}
			}
			if(!stack.isEmpty()) answer="NO";
			stack.clear();
			sb.append(answer).append("\n");
		}
		br.close();
		System.out.println(sb);
	}

}

