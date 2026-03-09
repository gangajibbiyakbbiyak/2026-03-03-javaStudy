// 문자열 비교 => equals ==> 로그인처리
// == (equals), != !equals
import java.util.Scanner;
public class 제어문_선택조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// admin / 1234
		System.out.print("ID 입력:");
		String id = scan.next();
		
		System.out.print("비밀번호 입력:");
		String pwd = scan.next();
		
		if(id.equals("admin") && pwd.equals("1234")) // 특별한 경우가 아니면 문자열 비교는 equals 사용.
//		if(id=="admin" && pwd=="1234") // == 을 쓰면 틀리다고 나온다.
		{
			System.out.println("로그인되었습니다!!");
		}
		else {
			System.out.println("ID나 Password가 틀립니다!!");
		}
	}

}
