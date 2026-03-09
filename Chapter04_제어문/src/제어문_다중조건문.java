/*
 * 사칙연산 => 계산기
 */
import java.util.Scanner;
public class 제어문_다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력:");
		int num1 = scan.nextInt();
		
		System.out.print("연산자 입력(+, -, *, /):");
		String op = scan.next();
		
		System.out.print("두번째 정수 입력:");
		int num2 = scan.nextInt();
		
		char c = op.charAt(0); // 첫번째 입력된 문자 읽기
		// 문자열은 인덱스번호 => 0부터 시작한다
		// == 정수 / 실수 / 논리 / 문자
		if(c=='+') {
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		}else if(c=='-') {
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
		}else if(c=='*') {
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
		}else if(c=='/') {
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}else {
				System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
			}
		}else { // 해당 조건이 없는 경우 => 생략이 가능
			System.out.println("잘못된 연산자입니다.");
		}
	}

}
