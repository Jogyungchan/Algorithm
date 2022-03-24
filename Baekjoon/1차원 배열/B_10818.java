package _array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int val = Integer.parseInt(br.readLine());
		String str = br.readLine();
		br.close();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int[] arr = new int[val];
		int max = 0;
		int min = 0;
		for(int i=0; i<val; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(i==0) {
				max=arr[i];
				min=arr[i];
			}
			else {
				max=Math.max(max, arr[i]);
				min=Math.min(min, arr[i]);
			}
		}
		System.out.println(min+" "+max);
	}
}
