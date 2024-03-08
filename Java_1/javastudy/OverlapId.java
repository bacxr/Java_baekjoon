package javastudy;

import java.util.Scanner;

public class OverlapId {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Id = sc.nextLine();
		
		if(Id.equals("joonas")) {
			System.out.print(Id + "??!");
		} else {
			System.out.print(Id);
		}
	}
}
