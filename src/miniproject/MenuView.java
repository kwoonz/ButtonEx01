package miniproject;

import java.util.Scanner;

public class MenuView {
	public static Scanner sc = new Scanner(System.in);
	
	public static void MenushowInfo() {
		System.out.println("********** MENU **********");
		System.out.println("1.정보입력 2.정보출력 3.정보수정 4.정보삭제 5.종료");
		System.out.print("선택>> ");
	}

}
