import java.util.Scanner;

public class B_9498 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.close();
		
		if(90<=a && a<=100) System.out.println("A");
		else if(80<=a && a<=89) System.out.println("B");
		else if(70<=a && a<=79) System.out.println("C");
		else if(60<=a && a<=69) System.out.println("D");
		else System.out.println("F");
	}

}
