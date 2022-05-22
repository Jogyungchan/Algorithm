package study_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Study_5 {

	public static void main(String[] args) throws IOException {
		// n명의 학생들에게 좋아하는 숫자를 입력받아 중복된 숫자가 있으면 'D'출력, 아니면 'U' 출력.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		HashSet<Integer> hash = new HashSet<>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			hash.add(arr[i]);
		}
		br.close();
		
		// hash는 중복된 수를 지우면서 값을 저장해주기 때문에 
		// 처음 입력된 수와 hash에 저장된 값의 수가 다르다면 
		// 중복된 수가 존재했던 것이므로 'D' 출력 아니면 'U' 출력 
		if(hash.size()==n) System.out.println("U");
		else if(hash.size()!=n) System.out.println("D");
	}

}
