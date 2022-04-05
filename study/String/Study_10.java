package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Study_10 {

	public static void main(String[] args) throws IOException {
		// 한개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력. 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		br.close();
		String str = st.nextToken();
		char c = st.nextToken().charAt(0);
		
		// 떨어진 거리 정도를 나타내기 위해 정수 배열 선언.
		int[] arr = new int[str.length()];
		// 떨어진 거리를 나타내는 변수.
		int n = 1000;
		for(int i=0; i<str.length(); i++) {
			// 문자열과 문자를 비교하면서 같으면 n변수를 0으로 초기화하고 
			// 거리값을 나타내는 배열에 값을 넣어준다.
			if(str.charAt(i)==c) {
				n=0;
				arr[i]=n;
			}
			// 반대로 문자열과 문자를 비교하면서 다르면 n변수의 값을 증가하고,
			// 증가된 값을 배열에 넣어준다.
			else {
				n++;
				arr[i]=n;
			}
		}
		
		n = 1000;
		// 최소 거리를 나타내기 위해 반대쪽으로 한번더 실행.
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i)==c) {
				n=0;
			}
			// 배열에 값을 넣어줄때 최소거리를 나타내기 때문에 
			// 원래 있던 값과 n의 값 중 작은 값을 넣어준다.
			else {
				n++;
				arr[i]=Math.min(arr[i], n);
			}
		}
		
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}

}
