package study_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Study_3 {

	public static void main(String[] args) throws IOException {
		// n일 동안의 매출기록과 연속된 k일 동안의 매출액의 종류를 구간별로 구하는 프로그램.
		// 만약 n=7이고 매출 기록이 20 12 20 10 23 17 10이고 k=4이면 
		// [20 12 20 10] 매출 종류=3, [12 20 10 23] 매출 종류=4...과 같은 식으로 출력. 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> answer = new ArrayList<>();
		// 먼저 k-1만큼의 매출액의 수를 세준다.(만약 k가 4라면 3일까지의 매출액을 세준다.)
		for(int i=0; i<k-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		int lt=0;
		for(int i=k-1; i<n; i++) {
			// 매출액의 수를 센 후 매출액의 종류 값을 List에 저장한다.
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			answer.add(map.size());
			// 연속된 k일 동안의 매출액의 종류를 구하기 위해 k일 중 맨 첫번째 매출액을 빼준다.
			map.put(arr[lt], map.get(arr[lt])-1);
			// 그리고 빼준 매출액의 수가 0이라면 중복된 값이 아니므로 remove시켜준다.
			if(map.get(arr[lt])==0) map.remove(arr[lt]);
			lt++;
		}
		for(int x : answer) {
			System.out.print(x+" ");
		}
	}

}
