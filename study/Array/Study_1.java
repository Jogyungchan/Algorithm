package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Study_13 {

	public static void main(String[] args) throws IOException {
		// 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 자연수 n 입력.
		int val = Integer.parseInt(br.readLine());
		// n개의 정수를 공백을 기준으로 나누어준다.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		// 공백을 기준으로 나누어준 정수를 정수 배열에 값을 저장.
		int[] arr = new int[val];
		for(int i=0; i<val; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		// 첫번째 수는 무조건 출력.
		System.out.print(arr[0]+" ");
		// 반복문을 이용하여 앞의 수보다 크면 출력.
		for(int i=1; i<val; i++) {
			if(arr[i]>arr[i-1]) System.out.print(arr[i]+" ");
		}
	}

}
