package study_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Study_5 {

	public static void main(String[] args) throws IOException {
		// n장의 카드 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하여 k번째 큰수를 출력하는 프로그램.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		// n장의 카드 값을 입력.
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		br.close();
		
		// TreeSet을 Collections.reverseOrder()를 이용해 내림차순으로 정렬되도록 한다.
		TreeSet<Integer> t = new TreeSet<>(Collections.reverseOrder());
		// 3장을 뽑아 합한 값을 TreeSet에 넣어준다.
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int m=j+1; m<n; m++) {
					t.add(arr[i]+arr[j]+arr[m]);
				}
			}
		}
		
		int answer=-1;
		int count=0;
		for(int x : t) {
			count++;
			// count를 증가시키면서 count값이 k값과 같으면 그 값을 출력하도록 answer값 변경.
			if(count==k) {
				answer=x;
				break;
			}
		}
		System.out.println(answer);
	}

}
