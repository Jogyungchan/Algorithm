package study_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Study_1 {

	public static void main(String[] args) throws IOException {
		//n개의 숫자가 입력되면 오름차순으로 정렬하는 프로그램 (선택 정렬)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		br.close();
		
		for(int i=0; i<n-1; i++) {
			// 해당 인덱스 값을 idx 변수에 저장 
			int idx=i;
			for(int j=i+1; j<n; j++) {
				// idx 인덱스 값보다 작은 인덱스 값이 있으면 
				// 오름차순으로 정렬하기 위해 더 작은 인덱스 값을 idx에 저장한다.
				if(arr[idx]>arr[j]) idx=j;
			}
			// idx 인덱스 값과 현재 인덱스 값을 치환하기 위해 
			// tmp 변수를 이용하여 값 바꿔준다.
			int tmp = arr[idx];
			arr[idx] = arr[i];
			arr[i] = tmp;
		}
		
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}

}
