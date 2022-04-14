package study_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Study_5 {

	public static void main(String[] args) throws IOException {
		// 쇠막대기와 레이저의 배치를 나타내는 괄호 표현이 주어졌을 때, 잘려진 쇠막대기 조각의 총 개수를 출력.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		
		Stack<Character> stack = new Stack<>();
		int answer = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='(') stack.push('(');
			else {
				// 입력된 괄호가 ')'이고 바로 전에 입력된 괄호가 '('라면 레이저 표현이므로 
				// 막대기를 스택 size만큼 더해준다.
				if(i-1>=0 && str.charAt(i-1)=='(') {
					stack.pop();
					answer+=stack.size();
				}
				// 입력된 괄호가 ')'이고 바로 전에 입력된 괄호가 ')'라면 막대기 길이를 나타내는 표현이므로 
				// 쇠막대기 조각 개수에 +1를 해준다.
				else if(i-1>=0 && str.charAt(i-1)==')') {
					stack.pop();
					answer+=1;
				}
			}
		}
		System.out.println(answer);
	}

}
