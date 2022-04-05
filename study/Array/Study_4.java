package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study_16 {

	public static void main(String[] args) throws IOException {
		// 앞 2개의 수를 합하여 다음 수가 되는 수열을 만든다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int val = Integer.parseInt(br.readLine());
		br.close();
		
		// 1번째, 2번째 수는 1로 고정.
		int[] arr = new int[val];
		arr[0]=1;
		arr[1]=1;
		// 3번째 수부터는 앞에 2개의 수를 더해준다.
		for(int i=2; i<val; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		//arr 배열 출력.
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}

}
