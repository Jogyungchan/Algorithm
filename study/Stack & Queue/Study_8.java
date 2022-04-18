package study_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Person{
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id=id;
		this.priority=priority;
	}
}

public class Study_8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		Queue<Person> Q = new LinkedList<>();
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			Q.offer(new Person(i, arr[i]));
		}
		br.close();
		
		int answer=0;
		while(!Q.isEmpty()) {
			Person tmp = Q.poll();
			for(Person x : Q) {
				if(x.priority>tmp.priority) {
					Q.offer(tmp);
					tmp=null;
					break;
				}
			}
			if(tmp!=null) {
				answer++;
				if(tmp.id==m) break;
			}
		}
		System.out.println(answer);
	}

}
