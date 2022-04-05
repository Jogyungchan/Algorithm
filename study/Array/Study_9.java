package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Study_21 {

	public static void main(String[] args) throws IOException {
		// N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가장 큰 합을 출력. 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		br.close();
		
		int max = Integer.MIN_VALUE;
		// 각 열의 합, 각 행의 합을 저장하기 위한 변수. 
		// 값을 저장 후 가장 큰 값을 최대 값으로 저장.
		for(int i=0; i<n; i++) {
			int r_sum = 0;
			int c_sum = 0;
			for(int j=0; j<n; j++) {
				r_sum+=arr[i][j];
				c_sum+=arr[j][i];
			}
			max = Math.max(max, (Math.max(r_sum, c_sum)));
		}
		
		// 왼쪽 대각선과 오른쪽 대각선 합을 저장하기 위한 변수. 
		// 값을 저장 후 가장 큰 값을 최대 값으로 저장.
		int ld_sum = 0;
		int rd_sum = 0;
		for(int i=0; i<n; i++) {
			ld_sum+=arr[i][i];
			rd_sum+=arr[i][n-i-1];
		}
		max = Math.max(max, Math.max(ld_sum, rd_sum));
		System.out.println(max);
	}

}
