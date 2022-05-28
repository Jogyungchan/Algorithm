package study_6;

import java.util.Scanner;

public class Study_1 {

	public static void main(String[] args) {
		// 재귀함수를 이용하여 입력받은 숫자를 1부터 차례로 출력하는 프로그램.
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		DFS(n);
	}

	private static void DFS(int n) {
		if(n==0) return;
		// 다음과 같이 코드를 구성하면 코드가 stack 형식과 비슷하게 출력되므로
		// 1부터 차례로 출력할 수 있다.
		else {
			DFS(n-1);
			System.out.print(n+" ");
		}
	}
}
