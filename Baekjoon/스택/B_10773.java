import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_10773 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		int[] arr = new int[k];
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<k; i++) {
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]!=0) stack.push(arr[i]);
			else stack.pop();
		}
		br.close();
		
		int answer=0;
		for(int x : stack) {
			answer+=x;
		}
		System.out.println(answer);
	}

}