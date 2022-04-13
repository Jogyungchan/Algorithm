package study_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Study_3 {

	public static void main(String[] args) throws IOException {
		// n*n 크기의 정사각 격자와 크레인을 이용하여 인형뽑기 기계를 만드는 프로그램.
		// 인형을 뽑고 바구니에 담게 되는데 바구니 맨 위에 담긴 인형이 새로 뽑은 인형과 같다면 두 인형은 사라지게 된다.
		// 사라지게 된 인형의 개수를 구하는 출력.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] board = new int[n][n];
		StringTokenizer st;
		// 숫자를 활용하여 정사각 격자의 인형을 생성해준다.
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<n; j++) {
				board[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		// moves 배열을 통해 크레인이 이동하는 곳을 가르킨다.
		int m = Integer.parseInt(br.readLine());
		int[] moves = new int[m];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<m; i++) {
			moves[i]=Integer.parseInt(st.nextToken());
		}
		br.close();
		
		// 스택을 이용하여 바구니 역할 
		Stack<Integer> stack = new Stack<>();
		// 사라지게 된 인형의 개수를 출력하기 위한 변수 
		int count=0;
		for(int x : moves) {
			x-=1;
			for(int i=0; i<n; i++) {
				// 인형이 비어있다면 크레인이 계속 내려가면서 인형이 발견될때까지 이동,
				// 인형을 찾았다면 찾은 인형과 바구니에 맨 위에 인형을 비교하여 같으면 pop해주고 count를 2개 증가한다.
				if(board[i][x]!=0) {
					if(!stack.isEmpty() && stack.peek()==board[i][x]) {
						stack.pop();
						count+=2;
					}
					// 두 인형이 같지 않다면 바구니에 담아주고, 새로 뽑은 인형이 있는 자리에는 인형이 사라지도록 0을 넣어준다.
					else stack.push(board[i][x]);
					board[i][x]=0;
					break;
				}
			}
		}
		System.out.println(count);
	}

}
