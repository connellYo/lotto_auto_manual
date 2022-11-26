package lottoGame;

public class Common {
	
	int auto_num;
	int manual_num;
	int []lotto_tmp=new int[45];
	int []lotto=new int[7];
	int []auto_lotto=new int[6];
	
	
	Common(){}
	
	
	
	
	//렌덤 번호 생성
	int[] random_num(int []random) {
		int tmp; //temporary
		int rn;// 랜덤 인덱스 넘버
		//로또번호생성
		for (int i = 0; i < random.length; i++) {
			random[i] = i + 1;
		}

		for (int i = 0; i < 500; i++) {
			rn = (int) (Math.random() * 45);
			tmp = random[0];
			random[0] = random[rn];
			random[rn] = tmp;
		}
		
		return random;}
	

	// 로또 번호 출력 + 배열에 넣기
	
	int[] lotto_print(int[]random) {
		System.out.println("[[ 로또 추첨번호 ]]");
		for (int i = 0; i < 7; i++) {
			lotto[i]=random[i];
			if(i!=6) {
			System.out.print(lotto[i] + "\t");
			}
		}
		System.out.println("보너스번호 : " + lotto[6]);
		System.out.println();
		return lotto;
	}
	
	// auto 번호 출력 + 배열에 넣기 
	
		int[] auto_print(int[]random) {
			System.out.println("[[ 자동 추첨번호 ]]");
			for (int i = 0; i < 6; i++) {
				auto_lotto[i]=random[i];
				System.out.print(auto_lotto[i] + "\t");
			}
			System.out.println();
			return auto_lotto;
		}
	
	
	
	

   //각 info객체에  당첨 번호/당첨 개수/ bonus 당첨 여부/ bonus 번호 를 업데이트 해준다
	void lotto_compare(lotto_info [] info,int[] lotto, int total_num) {
		int count=0;
		for(int i=0;i<total_num;i++) {
			count=0;
			for(int j=0;j<6;j++) {
				for(int k=0;k<6;k++) {
				if(info[i].my_num[j]==lotto[k]) { //i줄의 내 번호와 로또 넘버 비교해주기
					info[i].match_num[count]=lotto[k];
					count++;
					info[i].count=count; // info[i] 객체에 count 넘버 넣어주기 (당첨 개수 체크)
					break;
				} else if(info[i].my_num[j]==lotto[6]) {
					info[i].bonus_num=lotto[6]; // info[i] 객체에 보너스 번호 넣어주기
					info[i].bonus_check=1; // info[i] 객체에 보너스 번호 맞으면 1 넣기
					break;
				}
				
				}
			}
		}
	}
	
	

	
	// 각 로또 줄 객체에 등수 입력 등수에 들지 않으면 rank에 0으로 넣음 
	void lotto_rank(lotto_info [] info,int total_num) {
		for(int i=0; i<total_num;i++) {
	
		switch (  info[i].count ) {
		

		case 6:
			 info[i].rank=1;
			break;
		
		case 5:
			 if(info[i].bonus_check==1) {
				 info[i].rank=2;
			 }else {
				 info[i].rank=3;
			 }
			break;
		
		case 4:
			 info[i].rank=4;
			break;
		
		case 3:
			 info[i].rank=5;
			break;
		
		default:
			 info[i].rank=0;
			break;
		
		}//switch
		}
		
		}
	
	
	// 결과값 print out 
	
	void print_out( lotto_info [] info,int total_num )
		{	
		System.out.println("-----------------------------------------------");
		System.out.println("            [로또 결과]                           ");
		
		for(int i=0;i<total_num;i++) {
			//i 줄 객체 출력  
			info[i].print_info(total_num);

		if(i%5==4) {
			System.out.println("-------------------------------------------");
		}
		
		}
		}
	
}


	

	

	