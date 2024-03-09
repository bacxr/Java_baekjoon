package javastudy2;

import java.util.Scanner;

public class sumthExpnn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		//각 값의 결과값을 담자
		int RestAc = A % C;
		int RestBc = B % C;
		
		System.out.println((A+B)%C);
		System.out.println((RestAc + RestBc)%C);
		System.out.println((A*B)%C);
		System.out.println((RestAc * RestBc)%C);
		sc.close();
	}
}
