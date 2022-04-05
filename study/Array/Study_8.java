package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Study_20 {

	public static void main(String[] args) throws IOException {
		// N명의 학생의 점수가 입력되면 학생의 등수를 입력 순서대로 출력하는 프로그램.
		// 만약 같은 점수가 입력될 경우 높은 등수로 동일 처리.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int val = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();
		int[] arr = new int[val];
		for(int i=0; i<val; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<val; i++) {
			int rank=1;
			// 반복문을 이용하여 자신의 점수가 다른 사람들 점수보다 낮을 경우
			// rank를 하나씩 증가시켜 자신의 등수를 입력시킨다.
			for(int j=0; j<val; j++) {
				// 같은 점수가 입력되면 높은 등수로 동일 처리하기 위해 '<' 처리한다.
				// 만약 낮은 등수로 동일 처리하기 위해서는 '<='과 같이 해준다.
				if(arr[i]<arr[j]) rank++;
			}
			sb.append(rank).append(" ");
		}
		System.out.println(sb);
	}

}
