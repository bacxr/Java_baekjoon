
package javastudy2;

import java.util.Scanner;

public class ChangeYear {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int bdhsmyear = sc.nextInt();
		
		System.out.print(bdhsmyear + "년의 불기연도는? \n" + (bdhsmyear+543) + "년 입니다!");
		
		sc.close();
		
	}
}
