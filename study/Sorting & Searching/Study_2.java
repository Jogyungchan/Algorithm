package study_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Study_2 {

	public static void main(String[] args) throws IOException {
		//n개의 숫자가 입력되면 오름차순으로 정렬하는 프로그램 (버블 정렬)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) arr[i]=Integer.parseInt(st.nextToken());
		br.close();
		
		// 버블 정렬 실행할 때마다 가장 큰 값의 수가 맨 뒷부분에 저장되므로
		// 실행할 횟수를 n-1로 하면 모든 수가 정렬이 되므로 for문을 n-1회 돌린다.
		for(int i=0; i<n-1; i++) {
			// 한번 정렬할때마다 큰 값을 가진 수가 저장되므로 그 다음 실행할때는
			// 그 전까지만 실행시켜도 되므로 n-i-1회 돌린다.
			for(int j=0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}

}
