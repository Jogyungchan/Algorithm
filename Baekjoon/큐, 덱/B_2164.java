package _queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B_2164 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> Q = new LinkedList<>();
		for(int i=1; i<=N; i++) {
			Q.offer(i);
		}
		int cnt=1;
		while(Q.size()!=1) {
			if(cnt%2==1) {
				Q.poll();
			}
			else {
				Q.offer(Q.poll());
			}
			cnt++;
		}
		br.close();
		System.out.println(Q.peek());
	}

}
