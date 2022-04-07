package study_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Study_6 {

	public static void main(String[] args) throws IOException {
		// 0과 1로 구성된 길이가 n인 수열에서 최대 k번을 0->1로 바꿀 수 있다.
		// 최대 k번의 변경으로 통해 1로만 구성된 최대 연속 부분 수열의 길이를 찾는 프로그램. 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		br.close();

		int count=0;
		int lt=0; 
		int max=Integer.MIN_VALUE;
		for(int rt=0; rt<n; rt++) {
			// rt인덱스의 값이 0이면 카운트를 증가한다.
			if(arr[rt]==0) count++;
			
			// 카운트가 k보다 크다면 lt 인덱스의 값을 0이 나올때까지 증가시키고, 카운트 값도 빼준다.
			while(count>k) {
				if(arr[lt]==0) count--;
				lt++;
			}
			// 길이를 구하기 위한 코드 
			max = Math.max(max, rt-lt+1);
		}
		
		System.out.println(max);
	}

}
