package _stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_10828 {

	public static void main(String[] args) throws IOException {
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			if(str.equals("pop")) {
				if(!stack.isEmpty()) sb.append(stack.pop()).append("\n");
				else sb.append(-1).append("\n");
			}
			else if(str.equals("size")) {
				sb.append(stack.size()).append("\n");
			}
			else if(str.equals("empty")) {
				if(!stack.isEmpty()) sb.append(0).append("\n");
				else sb.append(1).append("\n");
			}
			else if(str.equals("top")) {
				if(!stack.isEmpty()) sb.append(stack.peek()).append("\n");
				else sb.append(-1).append("\n");
			}
			else {
				String[] st = str.split(" ");
				int x = Integer.parseInt(st[1]);
				stack.push(x);
			}
		}
		br.close();
			
		System.out.println(sb);

	}

}
