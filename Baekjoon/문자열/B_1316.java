package _string;

import java.util.Scanner;

public class B_1316 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		String[] str = new String[val];
		
		int answer=0;
		for(int i=0; i<val; i++) {
			int count=0;
			str[i]=scan.next();
			for(int j=0; j<str[i].length(); j++) {
				for(int k=j+1; k<str[i].length(); k++) {
					if(str[i].charAt(j)==str[i].charAt(j+1)) break;
					else if(str[i].charAt(j)==str[i].charAt(k)) count++;
				}
			}
			if(count==0) answer++;
		}
		scan.close();
		System.out.println(answer);
	}

}
