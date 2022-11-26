package lottoGame;

import java.util.Scanner;

public class Price {
	static Scanner scan=new Scanner(System.in);
	int total_num; //로또 구매 개수
	int price; //로또 가격
	
	Price(){} //기본 생성자
	
	// 로또 총 구입 개수를 입력받아 가격을 계산하고 
    //리턴값으로 총 구입 개수를 넘겨주는 method 
	int price() {
		System.out.println("총 구입하고 싶은 로또의 개수를 입력하세요>>>>>>>>");
		this.total_num=scan.nextInt();
		this.price=this.total_num*1000;
		System.out.printf("총 금액은: %d 원 입니다.\n",this.price);
		return this.total_num;
	}//price method - 생성자 아님 주의!
    //생성자는 Price 여기 method는 price! (p가 소문자다)
	
}//class