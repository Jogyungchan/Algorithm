package _array;

import java.util.HashSet;
import java.util.Scanner;

public class B_3052 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<Integer> answer = new HashSet<Integer>();
		for(int i=0; i<10; i++) {
			int a = scan.nextInt()%42;
			answer.add(a);
		}
		System.out.println(answer.size());
	}

}
