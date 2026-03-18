/*
 * ***1. 클래스의 구성요소
 * 클래스
 * -----------------------
 * 변수
 * = 공통 사용 변수
 * = 객체마다 따로 사용 변수
 * -----------------------
 * 
 * -----------------------
 * 
 * -----------------------
 * 2. 객체지향프로그램의 특성
 * 		=> 권장
 * ***3. 클래스 안에 변수의 종류
 * ***4. 변수를 어떻게 활용
 * -----------------------
 */
import lombok.*;
@Getter
@Setter
class Sawon{
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private String loc;
	private long pay;
	private String hiredate;
	
}
public class 객체지향프로그램_개념 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 저장
		Sawon sa1 = new Sawon();
		Sawon sa2 = new Sawon();
		Sawon sa3 = new Sawon();
		System.out.println("sa1="+sa1);
		System.out.println("sa2="+sa2);
		System.out.println("sa3="+sa3);
	}

}
