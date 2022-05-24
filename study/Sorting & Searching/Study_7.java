package study_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Point implements Comparable<Point>{
	public int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point o) {
		if(this.x==o.x) return this.y-o.y;
		else return this.x-o.x;
	}
}

public class Study_7 {

	public static void main(String[] args) throws IOException {
		// 좌표를 오름차순으로 정렬하는 프로그램.
		// x값에 의해서 정렬하고, x값이 같으면 y값에 의해 정렬.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Point> arr = new ArrayList<>();
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr.add(new Point(x, y));
		}
		br.close();
		
		Collections.sort(arr);
		for(Point o : arr) {
			System.out.println(o.x+" "+o.y);
		}
	}
}
