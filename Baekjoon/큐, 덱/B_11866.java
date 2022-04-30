package _queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_11866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		br.close();
		
		Queue<Integer> Q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=n; i++) {
			Q.offer(i);
		}
		
		sb.append("<");
		int cnt=1;
		while(Q.size()!=1) {
			if(cnt!=k) {
				Q.offer(Q.poll());
				cnt++;
			}
			else {
				sb.append(Q.poll()).append(", ");
				cnt=1;
			}
		}
		sb.append(Q.peek()).append(">");
		System.out.println(sb);
	}

}
