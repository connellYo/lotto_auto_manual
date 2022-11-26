
package lottoGame;

public class Lotto{
   
   public static void main(String[] args) {
      Price pr=new Price(); //객체 생성
      Differ di=new Differ(); //객체 생성
      Common co=new Common(); //객체 생성
      Combine cb=new Combine(); //객체 생성
      int total_num=0; //로또 구매 개수
      int auto_num=0; //auto 구매 개수
      int manual_num=0; //manual 구매 개수
      int []lotto_tmp=new int[45]; // lotto 45개 수 랜덤 배열 (45개 배열)
      int []lotto=new int[7];// lotto 6개 번호+보너스 번호까지 받는 배열
      
      System.out.println("               [로또 추첨 시작]           ");
      //1. price 출력
      total_num=pr.price(); // 구입 총 개수 받음 
      
      //2. auto 개수 와 manual 개수 나눔 
      // 추가 기능 : auto 개수를 먼저 정하고 auto 개수가 total 개수보다 크면 다시 입력받음
      // : manual 같은 경우 전체에서 auto를 산고 남은 개수를 초과하면 다시 입력 받음 
   
      auto_num=di.ask_autoNo(total_num);
      manual_num=di.ask_manualNo(total_num, auto_num);
      
      //3. 로또 번호 받기 
      lotto_tmp=co.random_num(lotto_tmp);
      lotto=co.lotto_print(lotto_tmp);
      
      
      lotto_info [] info=new lotto_info[total_num]; 
      // 로또 구매 개수 만큼 info 배열 만들어주기
  
      
      
      //4. manual 번호 받기 + auto 번호 할당 받기 
       info=cb.lotto_combine(info,auto_num,manual_num).clone();
      //깊은 복사로 옮겨옴
      
      
      
      //5. 로또 번호와 내 번호 비교하기 
      co.lotto_compare(info, lotto, total_num);
      
      //6. 등수 넣기
      co.lotto_rank(info, total_num);
      
      //7. 출력
      
      co.print_out(info,total_num);
      
      
}//main

      

}//class