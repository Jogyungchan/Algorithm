package _for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B_11021 {

	public static void main(String[] args) throws IOException {
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int val = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String[] str= new String[val];
		
		for(int i=0; i<val; i++) {
			st = new StringTokenizer(br.readLine()," ");
			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())).append("\n");
		}
		br.close();
		for(int i=0; i<val; i++) {
			System.out.println("Case #"+(i+1)+": "+sb);
		}*/
		//*******************
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int val = Integer.parseInt(br.readLine());
		String[] str;
		int[] arr = new int[val];
		
		for(int i=0; i<val; i++) {
			str = br.readLine().split(" ");
			arr[i]=Integer.parseInt(str[0])+Integer.parseInt(str[1]);
		}
		br.close();
		for(int i=0; i<val; i++) {
			System.out.println("Case #"+(i+1)+": "+arr[i]);
		}*/
		
		//********************
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int val = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=1; i<=val; i++) {
			st= new StringTokenizer(br.readLine()," ");
			System.out.println("Case #"+i+": "+(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())));
		}
		br.close();*/
		
		//**************8
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int val = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int i=1; i<=val; i++) {
			st = new StringTokenizer(br.readLine()," ");
			bw.write("Case #"+i+": "+(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())));
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
