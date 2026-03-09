/*
 * github.com/chaijewon
 * cafe.naver.com/moyaid
 */
public class 자바변수연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 프로그램 시작
//		int kor = 90; // 초기값
//		kor++; // 수정
//		System.out.println("국어:"+kor);
//		
//		int eng = 80;
//		eng--;
//		System.out.println("영어:"+eng);
//		
//		// => true / false 만 저장이 가능
//		boolean b = false;
//		System.out.println("반대:"+!b);
		
		// 산술연산자 => 데이터 저장
		int kor = 80;
		int eng = 78;
		int math = 90;
		// 요청 처리
		// 총점
		int total = kor + eng + math;
		// 평균
		double avg = total / 3.0;
		
		// 출력
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
		System.out.printf("평균:%.2f\n", avg);
		// 정수 : %d
		// 실수 : %f
		// 문자 : %c
		// 문자열 : %s
		// => 문법에서 사용
		
		System.out.println("====== % 나누고 나머지 ======");
		System.out.println("5%2="+(5%2));
		System.out.println("5%-2="+(5%-2));
		System.out.println("-5%2="+(-5%2));
		System.out.println("-5%-2="+(-5%-2));
		// 남는 값은 앞에 있는 부호를 따라간다
		
		int num=100;
		String result=(num%2==0)?"짝수":"홀수";
		//			  ---------- true => 짝수
		//            ---------- false => 홀수
		System.out.println(result);
	}

}
