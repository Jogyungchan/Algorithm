package gyungchan.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_16139 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[][] sum = new int[s.length()][26];
		sum[0][s.charAt(0)-'a']++;
		for(int i=1; i<s.length(); i++) {
			int tmp = s.charAt(i)-'a';
			for(int j=0; j<26; j++) {
				sum[i][j] = sum[i-1][j];
			}
			sum[i][tmp]++;
		}
		int q = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<q; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char find = st.nextToken().charAt(0);
			int c = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			if(c==0) {
				sb.append(sum[e][find-'a']).append('\n');
			}
			else {
				sb.append(sum[e][find-'a']-sum[c-1][find-'a']).append('\n');
			}
		}
		System.out.println(sb);

	}

}
