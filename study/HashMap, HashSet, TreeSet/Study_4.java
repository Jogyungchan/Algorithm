package study_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Study_4 {

	public static void main(String[] args) throws IOException {
		// S문자열이 입력되고 T문자열을 입력한 후 연속되는 S부분 문자열이 T문자열과 아나그램이 되는 개수 출력.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String t = br.readLine();
		br.close();
		
		// S부분 문자열의 문자 개수를 세기위한 HashMap과 
		// T 문자열의 문자 개수를 세기위한 HashMap.
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		// T 문자열의 문자 개수를 세준다.
		for(char x : t.toCharArray()) {
			map2.put(x, map2.getOrDefault(x, 0)+1);
		}
		
		int count=0;
		int lt=0;
		// (T문자열에 개수-1)한 값만큼 S문자열의 부분 문자를 세준다.
		for(int i=0; i<t.length()-1; i++) {
			map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0)+1);
		}
		// 그 다음 문자부터 문자를 세준다.
		for(int rt=t.length()-1; rt<s.length(); rt++) {
			map1.put(s.charAt(rt), map1.getOrDefault(s.charAt(rt), 0)+1);
			// T문자열 HashMap과 S부분문자열 HashMap이 같으면 아나그램이므로 count를 증가시킨다.
			if(map1.equals(map2)) count++;
			// 연속된 문자중에서 맨 처음 문자의 수를 빼준다.
			map1.put(s.charAt(lt), map1.get(s.charAt(lt))-1);
			// 빼 준 문자의 수가 0이라면 중복된 값이 아니기 때문에 remove를 해준다.
			if(map1.get(s.charAt(lt))==0) map1.remove(s.charAt(lt));
			lt++;
		}
		System.out.println(count);
	}

}
