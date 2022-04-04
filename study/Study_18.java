package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Study_18 {

	public static void main(String[] args) throws IOException {
		// N개의 자연수가 입력되면 각 자연수를 뒤집은 수가 소수이면 출력.
		// 예를 들어 32가 입력되면 23으로 뒤집은 후, 23이 소수이면 출력한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int val = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int[] arr = new int[val];
		
		for(int i=0; i<val; i++) {
			// 입력받은 자연수를 뒤집은 후 저장.
			arr[i]=Integer.parseInt(new StringBuilder().append(st.nextToken()).reverse().toString());
			// 1은 소수가 될 수 없으므로 1일 경우 제외.
			if(arr[i]==1) continue;
			int count=0;
			// 자연수를 2부터 나눠보면서 나누어진다면 체크해준다.
			for(int j=2; j<arr[i]; j++) {
				if(arr[i]%j==0) count++;
			}
			// 나누어진 수가 있다면 소수가 아니기 때문에 나누어지지 않은 수만 출력.
			if(count==0) System.out.print(arr[i]+" ");
		}
		
	}

}
