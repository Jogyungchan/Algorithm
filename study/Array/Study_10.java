package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Study_22 {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};

	public static void main(String[] args) throws IOException {
		// N*N 격자판에서 상하좌우 숫자보다 크다면 그 숫자는 봉우리 지역이다.
		// 봉우리 지역이 몇개인지 알아내는 프로그램.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		// 테두리쪽 숫자는 0으로 초기화 시켜주기 위해 n+2로 설정 
		int[][] arr = new int[n+2][n+2];
		StringTokenizer st;
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=1; j<=n; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		br.close();
		
		int num=0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				boolean flag = true;
				//if(arr[i][j]>arr[i-1][j] && arr[i][j]>arr[i][j-1]
				//		&& arr[i][j]>arr[i][j+1] && arr[i][j]>arr[i+1][j]) num++;
				for(int k=0; k<4; k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					// 상하좌우 숫자보다 작은지 비교해서 만약 작다면 봉우리 지역이 아니므로 break 
					if(arr[i][j]<=arr[nx][ny]) {
						flag = false;
						break;
					}
				}
				// 봉우리 지역이라면 카운트 해준다.
				if(flag) num++;
			}
		}
		System.out.println(num);
	}

}
