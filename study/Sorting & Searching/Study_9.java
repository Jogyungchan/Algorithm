package study_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Study_9 {

	public static void main(String[] args) throws IOException {
		// n개의 곡이 있고 m개의 DVD가 있을 때, 
		// n개의 곡을 m개의 DVD에 저장할 수 있는 최소 용량 크기를 구하는 프로그
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i]=Integer.parseInt(st.nextToken());
		br.close();
		
		int answer=0;
		// 결정 알고리즘을 사용하기 위해 n개의 곡 중 가장 큰 용량을 가진 값을 lt값으로 저장한다.
		int lt = Arrays.stream(arr).max().getAsInt();
		// n개의 곡 용량을 전체 더한 값을 rt값으로 사용한다.
		int rt = Arrays.stream(arr).sum();
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			// 중간값의 용량을 이용하여 count 함수를 이용하였을 때 
			// m개 DVD의 양보다 더 작거나 같으면 일단 answer변수에 mid값을 저장해두고,
			// 이보다 최소 값이 있는지 확인을 해보기 위해 rt값을 mid-1로 한다.
			if(count(arr, mid)<=m) {
				answer=mid;
				rt=mid-1;
			}
			// m개 DVD의 양보다 크다면 최소 용량을 늘려야하기 때문에 lt값을 mid+1로 한다.
			else {
				lt=mid+1;
			}
		}
		System.out.println(answer);
	}

	// 특정 값의 용량을 이용하여 몇개의 곡을 DVD에 담을수 있는지 계산해주는 함수.
	private static int count(int[] arr, int capacity) {
		int cnt=1;
		int sum=0;
		for(int x : arr) {
			if(sum+x > capacity) {
				sum=x;
				cnt++;
			}
			else sum+=x;
		}
		
		return cnt;
	}

}
