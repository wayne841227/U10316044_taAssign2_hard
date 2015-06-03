package choise;

public class Question {
	public static String Q;
	public static String[] C = new String[4];
	public static int KEY;
	Question(){
		
	}
	
	public static void question(int RandomQuestion){
		
		switch(RandomQuestion){
		
		case 0:
			Q = "15 X 15 =?";
			C[0] = "225 ";
			C[1] = "235 ";
			C[2] = "325 ";
			C[3] = "275 ";
			KEY = 0;
			break;
			
		case 1:
			Q = "0!= ?";
			C[0] = "10";
			C[1] = "-1";
			C[2] = "0";
			C[3] = "1";
			KEY = 3;
			break;
			
		case 2:
			Q = "誰非文藝復興三傑?";
			C[0] = "米開朗基羅";
			C[1] = "盧梭";
			C[2] = "拉斐爾";
			C[3] = "達文西";
			KEY = 1;
			break;
			
		case 3:
			Q = "誰非民初軍閥?";
			C[0] = "吳佩孚";
			C[1] = "孫傳芳";
			C[2] = "孫中山";
			C[3] = "張作霖";
			KEY = 2;
			break;
			
		case 4:
			Q = "哪個非金庸作品?";
			C[0] = "楚留香傳奇 ";
			C[1] = "越女劍";
			C[2] = "雪山飛狐";
			C[3] = "連城訣";
			KEY = 0;
			break;
			
		case 5:
			Q = "哪國非波羅的海三小國 ?";
			C[0] = "愛沙尼亞";
			C[1] = "羅馬尼亞";
			C[2] = "立陶宛";
			C[3] = "拉脫維亞";
			KEY = 1;
			break;
			
		case 6:
			Q = "何者為申根國但未加入歐盟?";
			C[0] = "比利時";
			C[1] = "挪威";
			C[2] = "荷蘭";
			C[3] = "芬蘭";
			KEY = 1;
			break;
		case 7:
			Q = "何者非馬關條約內容 ?";
			C[0] = "割讓遼東半島";
			C[1] = "朝鮮獨立";
			C[2] = "割讓台灣";
			C[3] = "割讓烏蘇里江以東";
			KEY = 3;
			break;
		case 8:
			Q = "1+2+3+...+100=?";
			C[0] = "5050";
			C[1] = "5000";
			C[2] = "5100";
			C[3] = "5200";
			KEY = 0;
			break;
		
		case 9:
			Q = "4-2= ?";
			C[0] = "2";
			C[1] = "4";
			C[2] = "3";
			C[3] = "45";
			KEY = 0;
			break;
			
		}
		
		
	}
	
	
	
}
