package study_6;

import java.util.Scanner;

public class Study_3 {

	public static void main(String[] args) {
		// 자연수 n이 입력되면 n!를 구하는 프로그램 
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		System.out.println(DFS(n));
	}

	private static int DFS(int n) {
		if(n==1) return 1;
		else return n*DFS(n-1);
	}

}
