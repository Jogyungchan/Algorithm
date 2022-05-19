package study_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Study_3 {

	public static void main(String[] args) throws IOException {
		//n개의 숫자가 입력되면 오름차순으로 정렬하는 프로그램 (삽입 정렬)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) arr[i]=Integer.parseInt(st.nextToken());
		br.close();

		// 인덱스 1부터 시작하여 그 전 값과 비교 
		for(int i=1; i<n; i++) {
			// arr[i]의 값이 변경되기 전에 tmp변수에 해당 값을 저장해둔다.
			int tmp = arr[i];
			int j;
			// i의 인덱스보다 작은 인덱스의 값들을 비교하면서 
			// 더 크다면 값을 바꿔준다.
			for(j=i-1; j>=0; j--) {
				if(tmp<arr[j]) arr[j+1]=arr[j];
				else break;
			}
			// 바뀐 마지막 부분에 맨 처음 arr[i]의 값을 넣어준다.
			arr[j+1]=tmp;
		}
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}

}
