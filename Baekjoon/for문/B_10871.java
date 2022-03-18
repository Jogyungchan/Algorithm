package _for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int[] arr = new int[Integer.parseInt(st.nextToken())];
		int a = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()," ");
		br.close();
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			if(arr[i]<a) {
				System.out.print(arr[i]+" ");
			}
		}
		
		
	}

}
