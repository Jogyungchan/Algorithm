package study_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Study_4 {

	public static void main(String[] args) throws IOException {
		// LRU(Least Recently Used)알고리즘을 이용하여 캐시 메모리 작업 프로그램 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 캐시 메모리의 크기를 입력받는다.
		int s = Integer.parseInt(st.nextToken());
		// 작업 개수를 입력받는다.
		int n = Integer.parseInt(st.nextToken());
		int[] cache = new int[s];
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		br.close();
		
		// 작업할 숫자를 하나씩 향상된 for문을 이용하여 가져온다.
		for(int x : arr) {
			int pos=-1;
			// 가져온 작업이 이미 캐시에 있는 상태인지 확인하여준다.
			for(int i=0; i<s; i++) {
				// 그리고 가져온 작업이 이미 캐시에 있는 상태이면 
				// 해당 인덱스를 저장해둔다.
				if(cache[i]==x) {
					pos=i;
					break;
				}
			}
			// 새로운 작업이 캐시에 없는 상태였을 때 
			if(pos==-1) {
				// 캐시 메모리에 새로운 작업이 들어가야하므로 
				// 기존에 있는 작업들의 순서가 하나씩 뒤로 밀리게 된다.
				for(int i=s-1; i>=1; i--) {
					cache[i]=cache[i-1];
				}
			}
			// 새로운 작업이 캐시에 있는 상태였을 때 
			else {
				// 해당 작업이 있는 부분부터 작업들의 순서가 하나씩 뒤로 밀리게 된다.
				for(int i=pos; i>=1; i--) {
					cache[i]=cache[i-1];
				}
			}
			// 그리고 앞부분에 해당 작업을 넣어준다.
			cache[0]=x;
		}
		
		for(int x : cache) {
			System.out.print(x+" ");
		}
	}

}
