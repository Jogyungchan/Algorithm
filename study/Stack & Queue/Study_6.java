package study_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Study_6 {

	public static void main(String[] args) throws IOException {
		// n명의 왕자가 있고, k번째 수를 말하는 왕자는 제외되는 프로그램.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");	
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> Q = new LinkedList<>();
		for(int i=1; i<=n; i++) {
			Q.offer(i);
		}
		int count=1;
		// 왕자가 한명 남을때까지 반복 
		while(Q.size()!=1) {
			// k번째 수를 말하지 않은 왕자는 다시 뒤 순서로 넘어감.
			if(count!=k) {
				Q.offer(Q.poll());
				count++;
			}
			// k번째 수를 말한 왕자는 제외되고 다시 반복하기 위해 count를 1로 설정.
			else {
				Q.poll();
				count=1;
			}
		}
		// 마지막 한명 남은 왕자를 출력.
		System.out.println(Q.peek());
	}

}
