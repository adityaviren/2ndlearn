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
		sub(a,b);
		mul(a,b);

		sc.close();
	}
	private static void add(int a,int b) {
		long sum=a+b;
		System.out.println("Addition is "+sum);
	}
	private static void sub(int a,int b) {
		long sub=a-b;
		System.out.println("Subraction is "+sub);
	}
	private static void mul(int a,int b) {
		long prod=a*b;
		System.out.println("Multiplication is "+prod);
	}
	private static void mod(int a,int b) {
		long mod=a%b;
		System.out.println("Modulus is "+mod);

	}
}
