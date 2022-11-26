package lottoGame;

public class lotto_info { // lotto 한줄마다 결과값+자기번호 info 총합체
	int [] my_num=new int[6]; //자기번호
	int bonus_check=0; // 보너스번호가 당첨 되었으면 1로 바뀜
	int [] match_num=new int[6]; // lotto 당첨 넘버 넣기
	int rank=0; // 등수
	int count=0; // 맞은 개수
	int bonus_num=0; // 보너스 넘버 
	
 
	lotto_info(){} //기본생성자
	
	lotto_info(int [] my_num){
		this.my_num=my_num; //내 번호 저장 
	} // 내번호를 저장하는 생성자
	
	
	void print_info(int total_num) {
		
		 //내번호 출력
	      for(int i=0;i<6;i++) {
	         
	    	  	System.out.print(my_num[i]+"\t");
	         }
	      //등수출력
	      if(rank!=0) {
	         System.out.print("등수:"+rank+"등\t");
	         }else {
	            System.out.print("다음 기회에 \t");
	         }
	       
	      //당첨번호 출력
	       System.out.print("당첨 번호:\t");
	         if(count>0) {
	         for(int k=0; k<count; k++) {
	         System.out.print(match_num[k]+"\t");   
	         }
	         
	         }else {System.out.print("없습니다.\t");}
	         
	         //보너스 당첨번호 출력
	         if(bonus_check==1) {
	            System.out.print("보너스 당첨 번호: \t"+bonus_num+"\t");
	         }
	         System.out.println();
		
		
	}
		      
}