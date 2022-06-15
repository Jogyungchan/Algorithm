package gyungchan.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B_1269 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashSet<Integer> hs = new HashSet<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int aNum = Integer.parseInt(st.nextToken());
		int bNum = Integer.parseInt(st.nextToken());
		int size = 0;
		int count = 0;
		
		StringTokenizer a = new StringTokenizer(br.readLine());
		for(int i=0; i<aNum; i++) {
			hs.add(Integer.parseInt(a.nextToken()));
		}
		
		StringTokenizer b = new StringTokenizer(br.readLine());
		for(int i=0; i<bNum; i++) {
			int value = Integer.parseInt(b.nextToken());
			if(hs.contains(value)) {
				count++;
			}
			else {
			hs.add(value);
			}
		}
		bw.write(String.valueOf(aNum+bNum-count*2));
		bw.flush();
		bw.close();

	}

}
