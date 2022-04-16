package study_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Study_7 {

	public static void main(String[] args) throws IOException {
		// 수업 과목중 필수과목을 정하고 필수과목은 정해진 순서대로 들어야 되고 듣는다면 "YES" 아니라면 "NO" 출력.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String n = br.readLine();
		br.close();
		
		Queue<Character> Q = new LinkedList<>();
		// 필수 과목을 먼저 Queue에 저장해둔다.
		for(char x : str.toCharArray()) {
			Q.offer(x);
		}
		
		String answer = "YES";
		for(char x : n.toCharArray()) {
			// 듣는 수업 과목을 필수과목인지 확인한 후 필수 과목이라면 
			// Queue에 맨 처음에 들어야할 과목인지 확인하고 맞다면 Queue에서 제거해준다.
			// 아니라면 순서가 다른것이기 때문에 NO로 출력하도록 하고 break 시켜준다.
			if(Q.contains(x)) {
				if(Q.peek()==x) Q.poll();
				else {
					answer = "NO";
					break;
				}
			}
		}
		// 필수 과목은 모두 다 필수로 들어야하기 때문에 Queue가 비어있지 않다면 그때도 NO를 출력하도록 한다.
		if(!Q.isEmpty()) answer = "NO";
		System.out.println(answer);
	}

}
