import java.util.Scanner; // 입력

public class 변수_2 {
	public static void main(String[] args) {
	/*
	 * 사과 5개
	 * => 사과를 2개 먹었다
	 * => 현재 남아 있는 사과의 갯수
	 * */
			
		int apple = 5;
		apple-=2;
		System.out.println("남은 사과 " + apple);
		
	/*
	 * 국어 80
	 * 영어 90
	 * 수학 70
	 * ---------- 평균 구하기
	 * 
	 * */
		int kor = 80;
		int eng = 90;
		int math = 70;
		System.out.println((kor+eng+math)/3);
		
		Scanner scan = new Scanner(System.in);
		// System.in => 키보드에서 입력된 값을 읽어오는 역할
		// => 공백 / 엔터
		System.out.print("국어 점수 입력 : ");
		int kor2 = scan.nextInt();
		System.out.println("국어:"+kor2);
		System.out.print("영어 점수 입력 : ");
		int eng2 = scan.nextInt();
		System.out.println("영어:"+eng2);
		System.out.print("수학 점수 입력 : ");
		int math2 = scan.nextInt();
		System.out.println("수학:"+math2);
		
		double avg = (kor2+eng2+math2)/3.0;
		System.out.println(avg);
		
		System.out.printf("평균:%.2f",avg);
	}
}
