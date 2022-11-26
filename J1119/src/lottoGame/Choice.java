package lottoGame;

import java.util.Scanner;

public class Choice {
	Scanner scan = new Scanner(System.in);
	int choice;
	
	Choice(){}
	
	int choice() {
		
		System.out.println("[[ 로또추첨 프로그램 ]]");
		System.out.println("1. 수동로또구매");
		System.out.println("2. 자동로또구매");
		System.out.println("9. 로또추첨리셋");
		System.out.println("0. 추첨프로그램 종료");
		System.out.println("-----------------------------------------");
		System.out.println("원하는 로또구매방식의 번호를 입력해주세요.");
		choice = scan.nextInt();
		System.out.println();
		
		return choice;
	}//void
}
