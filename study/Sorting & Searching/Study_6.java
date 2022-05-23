package study_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Study_6 {

	public static void main(String[] args) throws IOException {
		// 키가 작은 순서로 1번부터 n번까지 부여하고 두명의 친구가 순서를 바꿔섰을때
		// 그 두명의 학생이 서있는 위치를 나타내는 프로그램.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) arr[i]=Integer.parseInt(st.nextToken());
		br.close();
		
		// tmp 배열을 만들어 정렬한 후 arr 배열의 값과 다른 2개의 값이 있다면 
		// 그 두 값이 위치를 나타내므로 tmp 배열을 만들어 이용한다.
		int[] tmp = arr.clone();
		// tmp 배열을 순서대로 정렬시켜준다.
		Arrays.sort(tmp);
		for(int i=0; i<n; i++) {
			if(arr[i]!=tmp[i]) {
				System.out.print((i+1)+" ");
			}
		}
	}

}
