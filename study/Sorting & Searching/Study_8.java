package study_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Study_8 {

	public static void main(String[] args) throws IOException {
		// 임의의 n개의 숫자가 입력으로 주어질 때 n개의 수를 오름차순으로 정렬한 후
		// n개의 수 중 하나인 m이 주어지면 이분검색으로 m이 몇번째에 있는지 구하는 프로그램.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) arr[i]=Integer.parseInt(st.nextToken());
		br.close();
		
		// 입력받은 n개의 수를 정렬한다.
		Arrays.sort(arr);
		// 이분검색으로 m의 위치를 찾기 위해 처음과 끝 인덱스를 각 lt,rt 변수에 저장한다. 
		int lt=0;
		int rt=n-1;
		while(lt<=rt) {
			// 중간값을 찾기위한 mid 변수 저장  
			int mid=(lt+rt)/2;
			// 중간값이 m값과 같다면 위치를 출력 후 반복문 종료 
			if(arr[mid]==m) {
				System.out.println(mid+1);
				break;
			}
			// 만약 중간값이 m보다 크다면 중간값보다 더 큰수는 더 볼 필요가 없기 때문에
			// rt값을 mid보다 하나 작게 만든 후 다시 반복문을 실행한다.
			else if(arr[mid]>m) {
				rt=mid-1;
			}
			// 반대로 중간값이 m보다 작다면 lt 값을 mid값보다 하나 크게 만들고 반복문 실행.
			else lt=mid+1;
		}
	}

}
