package study_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Study_10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		int[] xi = new int[n];
		for(int i=0; i<n; i++) xi[i]=Integer.parseInt(st.nextToken());
		br.close();
		
		Arrays.sort(xi);
		int answer=0;
		int lt=1;
		int rt=xi[n-1];
		while(lt<=rt) {
			int mid=(lt+rt)/2;
			if(count(xi, mid)>=c) {
				answer=mid;
				lt=mid+1;
			}
			else rt=mid-1;
		}
		System.out.println(answer);
	}

	private static int count(int[] xi, int mid) {
		int cnt=1;
		int ep=xi[0];
		for(int i=0; i<xi.length; i++) {
			if(xi[i]-ep>=mid) {
				cnt++;
				ep=xi[i];
			}
		}
		return cnt;
	}

}
