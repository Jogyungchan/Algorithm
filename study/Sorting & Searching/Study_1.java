package algorithm_6;

import java.util.Scanner;

public class Study_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i]=scan.nextInt();
		scan.close();
		
		for(int i=0; i<n-1; i++) {
			int idx=i;
			for(int j=i+1; j<n; j++) {
				if(arr[idx]>arr[j]) idx=j;
			}
			int tmp=arr[idx];
			arr[idx]=arr[i];
			arr[i]=tmp;
		}
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}

}
