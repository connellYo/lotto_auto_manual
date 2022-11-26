
package lottoGame;

import java.util.Scanner;

public class Differ {
   static Scanner scan=new Scanner(System.in);
   Common com=new Common(); // Common class 메소드 사용
   int auto_num; // auto lotto 개수
   int manual_num; //manual lotto 개수
   int []auto_lotto=new int[6]; // 자동 추출 1줄 받음(6번호) 
   int []auto_lotto_tmp=new int[45]; // 자동 추출 45개 번호 모두 포함
   int []manual_lotto=new int[6];// 수동 추출 1줄 받음
   
   Differ(){}
   //자동 추첨 개수 선택
   int ask_autoNo(int total_num) {
      System.out.println("자동 추첨 개수를 입력하세요:");
      auto_num=scan.nextInt();
      if(auto_num>total_num) {
         System.out.println("구매하신 로또 개수보다 초과 입력하셨습니다. 다시 입력해주세요");
         return ask_autoNo(total_num); 
      }
      return auto_num;   
   }
   
   //자동 추첨 개수 할당
   int ask_manualNo(int total_num,int auto_num) {
      
      manual_num=total_num-auto_num;
      
      return manual_num;
   }
   
   
   //자동 로또 번호 받기 (1줄)
   int[] Auto_lotto() {
      auto_lotto_tmp=com.random_num(auto_lotto_tmp);
      auto_lotto=com.auto_print(auto_lotto_tmp);
      return auto_lotto;
      }


	// 수동 로또 번호 받기 (1줄)
   int[] Manual_lotto() {
      for(int i=0;i<6;i++) {
      System.out.printf("%d 번째 숫자를 입력하세요",i+1);
      manual_lotto[i]=scan.nextInt();      
      }
   return manual_lotto;}

}

