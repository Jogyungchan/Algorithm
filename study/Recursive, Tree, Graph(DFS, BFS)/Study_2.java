package study_6;

import java.util.Scanner;

public class Study_2 {

	public static void main(String[] args) {
		// 10진수 n이 입력되면 2진수로 변환하는 프로그램.(재귀함수를 이용)
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		DFS(n);

	}

	private static void DFS(int n) {
		if(n==0) return;
		else {
			DFS(n/2);
			System.out.print(n%2);
		}
	}

}
