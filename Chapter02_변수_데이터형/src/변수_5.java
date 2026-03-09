/*
 * 변수
 * 1. 국어 / 수학 / 영어 / 총점 / 평균 / 학점 / 등수
 * 
 * 2. 문자열 저장 : String
 * */
public class 변수_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int kor, math, eng, total;
//		double avg;
//		String grade; // char 도 가능
//		int rate;
		
//		int drink = 12;
//		drink = drink - 5;
//		drink-=5; // 누적 / 차감
//		System.out.println("남은 음료수 : " + drink);
		// 남은 음료수 : 7
		
		/*
		 * 샌드위치 ==> 250
		 * 사과 ==> 100
		 * 주스 ==> 150
		 * 
		 * 샌드위치 1 사과 2 주스 1
		 * => 총 칼로리
		 * */
//		int 샌드위치 = 250;
//		int 사과 = 100;
//		int 주스 = 150;
//		System.out.println("총 칼로리 : " + (샌드위치*1 + 사과*2 + 주스*1));
		
		/*
		 * 이름은 홍길동 / 성별 남자 / 나이 20 / 키 180.5 / card false
		 * 장바구니
		 * 		우유 = 1200 => 2개
		 * 		빵 = 1500 => 3개
		 * 		계란 = 200 => 10개
		 * */
		String name = "홍길동";
		String gender = "남자";
		int age = 20;
		double height = 180.5;
		boolean isCard = false;
		
		int milk = 1200;
		int bread = 1500;
		int egg = 200;
		int jangbaguni = milk*2 + bread*3 + egg*10;
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(height);
		System.out.println(isCard);
		System.out.println(jangbaguni);
		
		String msg = """
				가나다라마바사 ABCDEFG
				ABCDEFG 가나다라마바사
				""";
		System.out.println(msg);
	}

}
