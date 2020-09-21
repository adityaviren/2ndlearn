package basic;
import java.util.Scanner;
public class learncreatingrepofromlocal {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("1st num");
		int a=sc.nextInt();
		System.out.println("2nd num");
		int b=sc.nextInt();
		add(a,b);
	}
	private static void add(int a,int b) {
		long sum=a+b;
		System.out.println("Addition is "+sum);
	}

}
