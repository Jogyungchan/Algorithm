package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Study_14 {

	public static void main(String[] args) throws IOException {
		// 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞 선생님이 볼 수 있는 학생의 수를 구하는 프로그램.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 학생의 수 입력 
		int val = Integer.parseInt(br.readLine());
		// 학생의 수만큼 키를 입력하고 공백을 기준으로 나누어준다.
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
		br.close();
		
		//공백을 기준으로 나누어진 키 변수를 정수 배열에 값을 저장.
		int[] arr = new int[val];
		for(int i=0; i<val; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		// 뒷 사람이 앞사람보다 키가 크다면 맨 앞 선생님이 볼 수 있기 때문에 
		// 크면 count를 증가해주고 큰 키 값을 저장하여 뒷 사람의 키와 비교한다.
		int max = arr[0];
		int count = 1;
		for(int i=1; i<val; i++) {
			if(arr[i]>max) {
				max=arr[i];
				count++;
			}
		}
		System.out.println(count);
	}

}
