package javastudy2;

import java.util.Scanner;

public class Mltpl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int A = sc.nextInt();
		int B = sc.nextInt();
       
		System.out.println("____");
		System.out.println(A*(B%10));
		System.out.println(A*(B%100/10));
		System.out.println(A*(B/100));
		System.out.println("____");
		System.out.println(A*B);
		
		sc.close();
	}
}