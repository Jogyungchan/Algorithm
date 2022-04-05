package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Study_19 {

	public static void main(String[] args) throws IOException {
		// 점수계산: 문제를 맞추면 1점, 틀리면 0점. 또한 연속으로 맞는 문제에 대해서는 1점씩 가산점이 주어진다.
		// 예 : 1,2,3번 문제를 연속으로 맞추었을 경우 1+2+3으로 증가한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int val = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		int[] arr = new int[val];
		int sum=0;
		int count=0;
		for(int i=0; i<val; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			// 연속으로 맞추었을 경우 1씩 증가시키기 위한 코드.
			if(arr[i]==1) count++;
			// 틀렸을 경우 0점으로 초기화.
			else count=0;
			
			sum+=count;
		}
		System.out.println(sum);
	}

}
