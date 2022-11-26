package lottoGame;

public class Combine extends Differ{
   Combine(){}//기본생성자
   
  //수동 추첨 로또 줄을 info 배열 각 객체에 하나씩 차례로 넣어주고 
  //그 다음 자동 추첨 로또 줄을 넣어주는 method 
   lotto_info[] lotto_combine(lotto_info[] info, int auto_num, int manual_num ){
      
      
      for(int i=0;i<manual_num;i++) {
         System.out.printf("<<<<<<<<<<<<<<%d번째 수동 입력 시작>>>>>>>>>>>>>>\n ",i+1);
         System.out.println();
         info[i]=new lotto_info();
         info[i].my_num=Manual_lotto().clone(); //깊은 복사
      }
      
      for(int i=manual_num; i<manual_num+auto_num;i++) {
	    	 info[i]=new lotto_info();
	         info[i].my_num=Auto_lotto().clone(); //깊은 복사 
      }
      
      return info;
   }
   

}