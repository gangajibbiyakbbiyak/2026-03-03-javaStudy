// 흐름 제어
/*
 * 건너뛴다 / 반복수행 / 선택 / 반복제어
 * ------------------------------
 * 
 * 조건문 => 에러처리 / 필요한 부분
 * 			------------ 예외처리
 * 	= 단일 조건문
 * 	  형식)
 * 		if(조건)
 * 	= 선택 조건문
 * 	= 다중 조건문
 * 선택문
 * 	= 선택문
 * 반복문
 * 	= do ~while
 *	= while
 *	= for
 * 반복제어문
 * 	= break
 * 	= continue
 */
// 입력 => 1. 짝수 / 홀수 => 조건처리
import java.util.Scanner;
public class 제어문_종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력:");
		// 엔터 => 메모리에 저장
		
		int num = scan.nextInt();
		//	입력된 정수 읽기
		if(num%2==0)//짝수
		{
			// 조건 => true일때만 문장을 수행
			System.out.println(num+"는(은) 짝수입니다");
		} // false면 건너뛴다
		if(num%2==1)//홀수 num%2!=0
		{
			System.out.println(num+"는(은) 홀수입니다");
		}
	}

}
