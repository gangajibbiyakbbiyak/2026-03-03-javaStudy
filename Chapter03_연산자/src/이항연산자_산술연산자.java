/*
 * 산술연산자
 * +, -, *, /, %
 * --------------------
 * 산술규칙
 * 1) int 이하 데이터형(byte, short, char)
 * => 연산하면 int로 변경
 * 	  byte + byte = int
 * 	  char + char = int
 * 	  short + short = int
 * 	  byte + char = int
 * 
 * 2) 큰데이터형으로 결과값이 나온다
 * => int + long = long
 * 	  ---
 * 	  long
 * 	  long + double = double
 * 	  double
 * 
 * 0으로 나누는 경우 에러 발생
 * 정수 / 정수 = 정수
 * 
 * % : 나머지값 출력
 * *** 결과값이 왼쪽 부호를 따라간다
 * 5 % 2 = 1
 * -5 % 2 = -1
 * -5 % -2 = -1
 * 5 % -2 = 1
 */
public class 이항연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5%2);
		System.out.println(-5%2);
		System.out.println(5%-2);
		System.out.println(-5%-2);
	}

}
