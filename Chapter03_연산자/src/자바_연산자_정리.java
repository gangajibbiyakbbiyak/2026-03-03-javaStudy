/*
 * Chapter 01
 * 1. 4page => 자바 구동(javac/java)
 * 		=> 15page
 * 2. 29page => 주석 처리
 * 3. 30page => 명령문이 종료되면 => ;
 * -------------------------------------
 * Chapter 02
 * 1. 변수
 *    36page : 한 개의 데이터 저장
 *    37page : 지역변수
 *    			블록 => {}이 종료하면 자동으로 삭제
 *    			----------------------------
 *    			반드시 사용전에 초기화
 *    			----------------------------
 *    			변수명칭 => 캐멀 => 변수는 소문자 시작
 *    							 단어 두개 연결 => 두번째 단어 대문자
 *    							 문법은 아니고 => 규칙
 *    38page : 변수명의 길이 => 3~10;
 *    			=> 어떤 용도인지 주석
 *    
 *    41page : 정수에 대한 설명
 *    		   byte / int / long
 *    			|      |      |
 *    			8bit  32bit  64bit
 *    43page : 정수표현법
 *    			=> 10진법 => 1, 10...
 *    45page : 문자 => char => 멀티바이트(유니코드) - 각국의 언어를 사용
 *    		   문자당 => 2byte
 *    		   char c = '한글자' => 한글 가능
 *    47page : 실수
 *    		   float => 10.5F => 4byte => 사용빈도는 거의 없다 - 소수점 6자리
 *    		   double => 10.5(D 생략이 가능) => 15자리 => 8byte - 정밀도 - 실수의 default
 *    50page : boolean : true / false만 저장이 가능
 *    		   => 1byte 메모리 => C/P => 0, 1
 *    51page : 문자열 => String
 *    52page : (특수문자)
 *    55page : 자동 형변환
 *    		   큰 데이터 = 작은 데이터
 *    57page : 강제 형변환
 *    66page : String ==> 각 데이터로 변경
 *    72page : 입력 => Scanner
 *    81page : 증감 연산자
 *    83page : 산술 연산자
 *    90page : 비교 연산자
 *    93page : 논리 연산자
 *    104page : 대엽연산자
 *    105page : 삼항연산자 (조건)?값1:값2
 *    
 */
public class 자바_연산자_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		{
			int b = 20;
			{
				int c = 30;
				System.out.println("a="+a);
				System.out.println("a="+b);
				System.out.println("a="+c);
			}
			System.out.println("a="+a);
			System.out.println("a="+b);
//			System.out.println("a="+c);
		}
		System.out.println("a="+a);
//		System.out.println("a="+b);
//		System.out.println("a="+c);
	}

}
