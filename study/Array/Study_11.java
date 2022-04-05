package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Study_23 {

	public static void main(String[] args) throws IOException {
		// n명의 학생이 1~5학년까지 지내오면서 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장으로 정하는 프로그램.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][5];
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<5; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		br.close();
		
		int max=Integer.MIN_VALUE;
		int num=0;
		for(int i=0; i<n; i++) {
			int count=0;
			for(int j=0; j<n; j++) {
				for(int k=0; k<5; k++) {
					// 나와 친구 반이 같은 경우 카운트를 증가시키고, 한번 같은 반이였던 친구를 
					// 다른 학년 때 같은 반이라고 증가시키면 안되기 때문에 break.
					if(arr[i][k]==arr[j][k]) {
						count++;
						break;
					}
				}
			}
			if(count>max) {
				max=count;
				num=i+1;
			}
		}
		System.out.println(num);
	}

}
