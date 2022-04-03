package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Study_15 {

	public static void main(String[] args) throws IOException {
		// A, B 두 사람이 가위바위보 게임을 진행. N번의 게임을 해서 A가 이기면 A를 출력, B가 이기면 B를 출력.
		// 1: 가위, 2: 바위, 3:보 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int val = Integer.parseInt(br.readLine());
		int[] a = new int[val];
		int[] b = new int[val];
		// A가 낸 가위,바위,보 정보 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<val; i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		
		// B가 낸 가위,바위,보 정보 
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<val; i++) {
			b[i]=Integer.parseInt(st.nextToken());
		}
		
		// A가 이기는 경우는 3가지이다. (가위, 보), (바위, 가위), (보, 바위)
		// 저 3경우의 값을 뺴주면 -2, 1, 1이므로 이 경우 A를 출력하도록 한다.
		for(int i=0; i<val; i++) {
			if(a[i]==b[i]) System.out.println("D");
			else if(a[i]-b[i]==1 || a[i]-b[i]==-2) System.out.println("A");
			else System.out.println("B");
		}
	}

}
