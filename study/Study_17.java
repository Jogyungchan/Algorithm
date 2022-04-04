package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study_17 {

	public static void main(String[] args) throws IOException {
		// 자연수 n이 입력되면 1~n까지의 소수의 개수를 출력.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int val = Integer.parseInt(br.readLine());
		br.close();
		
		// n까지의 수 중 소수를 구하기 위한 배열 선언.
		int[] arr = new int[val+1];
		int count=0;
		for(int i=2; i<val+1; i++) {
			// 약수를 가지지 않는 수를 체크.
			if(arr[i]==0) count++;
			
			// i의 배수는 이미 약수를 가지는 것이므로 소수에서 제외.
			for(int j=i; j<val+1; j=j+i) {
				arr[j]=1;
			}
		}
		System.out.println(count);
	}

}
