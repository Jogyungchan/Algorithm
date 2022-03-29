package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study_3 {

	public static void main(String[] args) throws IOException {
		// 문자열을 입력받아 그 중에 가장 긴 단어 출력 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 가장 긴 단어를 찾기 위해 split함수를 이용하여 문자열 배열에 단어를 저장 
		String[] str = br.readLine().split(" ");
		br.close();
		
		int max = 0;
		int num = 0;
		for(int i=0; i<str.length; i++) {
			// 가장 긴 단어를 찾으면 해당 단어에 대한 배열 인덱스를 num 변수에 저장 
			int len = str[i].length();
			if(max<len) {
				max = len;
				num = i;
			}
		}
		System.out.println(str[num]);
	}

}
