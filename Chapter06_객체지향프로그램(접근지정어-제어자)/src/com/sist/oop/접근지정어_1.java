package com.sist.oop;
/*
 * 접근지정어 / 제어자
 * ---------------
 * 구분 => 패키지 => 안에 있는 클래스 가지고 오기 => import
 * ------------------------------------------------=
 * 1. package : 한번만 사용
 * 2. import => 여러번 사용이 가능
 * 3. class
 * 	  -----
 * 	  |접근지정어 => public / default
 * -------------------------------- 클래스 제작 순서
 * 4. 클래스 구조
 * 	(public) class ClassName
 * {
 * 	------------
 * 	변수 => private
 *  ------------
 *  생성자 => 다른 클래스와 연결 => public
 *  ------------
 *  메소드 => 다른 클래스와 통신 => public
 *  ------------
 * }
 * 
 * 1) static / instance
 *    ------   --------
 *    static 특징
 *    ---------- 공유 목적 => 사이트(동일한 내용이 나온다)
 *    						로그 / 공통 CSS
 *    			 객체 생성없이 사용이 가능
 *    => 컴파일시에 메모리 저장
 *    => 독립적으로 사용이 가능 ==> 클래스.변수명
 *    						   클래스.메소드()
 *    => 공유 멤버 변수 : 회사명, 학교명 ...
 *    	 ------- 변경이 되면 모든 인스턴스 한번에 변경
 *       ------- 오라클 저장되는 데이터
 *    => 사용제한
 *       ------- static 메소드 안에서 static 만 사용이 가능
 *       ------- 인스턴스를 사용
 *       		 반드시 new 이용해서 객체 생성 후에 사용이 가능
 *    => 사용 목적 : 전역 변수 / 전역 함수
 * 2) instance 변수
 * 	  객체변수 => 따로 메모리를 만들어서 저장 후 사용
 * 				맛집 : 300개
 * 				: 다른 주소에 저장된 데이터는 접근이 불가능하다
 * 				  -------------------
 * 				  반드시 저장시에 new 생성자()
 * 							  --- 새로운 메모리
 * 	  => static / instance => 프로그램 종료시까지 메모리 유지
 * 	  => instance 변수 구분 => this.변수명
 * 	  => ** static은 this를 사용할 수 없다
 * 	  class A
 * 	  {
 * 		int a,b;
 * 		static int c; // 메모리 크기에서 제외
 * 	  }
 * 	  ------------------- 실제로 저장되는 메모리 크기 : 8byte
 * 	  
 * 	2. 생성자
 * 		=> 클래스를 저장해서 => 객체를 생성시에 호출
 * 		   생성자 => 호출
 * 					new 생성자()
 * 		=> 특징
 * 		   클래스명과 동일
 * 		   리턴형이 없다 => void는 리턴형
 * 		   오버로딩 지원
 * 		   class A
 * 		   {
 * 				public A(){}
 * 		   }
 * 		   오버로딩
 * 			=> 같은 이름의 메소드로 새로운 기능 제작
 * 			=> 문법
 * 			   메소드명 동일
 * 			   매개변수의 갯수가 데이터형이 다르다
 * 			   리턴형/접근지정어는 관계없다
 * 			=> 생성자에서 오버로딩을 지원
 * 				=> 초기화가 다르게 만드는 경우
 * 		변수 => 초기화
 * 		class A
 * 		{
 * 			기본값
 * 			String name; => null
 * 			int age; => 0
 * 			
 * 			명시적 초기화
 * 			-----------------
 * 			String name="홍길동";
 * 			int age=20;
 * 			-----------------
 * 
 * 			초기화 블록
 * 			{
 * 				name="심청이";
 * 				age=25
 * 			}
 * 		}
 * 
 * 	프로그램
 * 	------
 * 	1. 기능 설정 : 메소드
 * 		=> 메소드안에서 공통으로 사용되는 변수
 * 									--- 인스턴스 변수
 * 	2. 화면 UI => 변수 초기화
 * 		=> 명시적 초기화 => 알고 있는 상태 => 목록 => 페이지 나눠짐
 * 			--- page = 1
 * 		=> static 블록
 * 			=> 객체 생성없이 화면에 출력 => static 변수만 사용이 가능
 * 		=> instance 블록
 * 			=> 파일 / 데이터베이스 / 크롤링
 * 			--------------------------자동 호출
 * 		=> 생성자 ==> public
 * 		*** static => static 블록
 * 		*** instance => 생성자
 * 		*** 모든 변수는 은닉화 => private
 * 	3. 구현
 * 		메소드 => 다른 연결 => public
 * 		=> static 메소드 : 공통으로 적용되는 기능
 * 		***=> instance 메소드 : 각 객체마다 따로 수행하는 기능
 * 		=> abstract 메소드 : 개발자에게 맡긴다
 * 							=> 미완성 : 선언
 * 					|설계 도구 => 추상클래스 / 인터페이스
 * 
 * 		=> static 메소드 : 클래스명.메소드()
 * 		   Math.random()
 * 		=> instance 메소드 : 객체명.메소드()
 * 		   Scanner scan = new Scanner(System.in)
 * 		   scan.nextInt()
 * 		   String s="";
 * 		   s.length()
 * 	1. 자바의 접근지정어
 * 	= public
 * 		어디서든 상관없이 접근 => 공개
 * 		: 클래스, 생성자, 메소드
 *  = protected
 *  	같은 패키지에서 접근 / 다른 패키지 => 상속을 받은 클래스
 *  	.. 사용 빈도가 거의 없다
 *  = default
 *  	같은 패키지에서 접근
 *  	----------폴더
 *  = private 비공개 => 은닉화
 *  	=> 자신의 클래스 내에서만 사용이 가능 => 인스턴스변수
 *  2. public > protected > default > private
 *  	=> 오버라이딩시에 접근지정어는 축소할 수 없다
 *  	class A
 *  	{
 *  		void display(){}
 *  	}
 *  	class B extends A
 *  	{
 *  		void display(){}
 *  	}
 * 
 * ------------------------------------------------------
 * 			같은 클래스 같은 폴더	다른 클래스(상속)   모든 클래스
 * ------------------------------------------------------
 * private     O		
 * ------------------------------------------------------
 * default     O		O	
 * ------------------------------------------------------
 * protected   O		O				O
 * ------------------------------------------------------
 * public      O		O				O			O
 * ------------------------------------------------------
 * 
 * 
 * 
 * 
 * 
 */
// => 한명 , 한개에 대한 설계 => new
// 모든 변수에 private 사용하는건 아니다
// Button
class Sawon
{
	private int sabun;
	private String name;
	String dept;
	protected String job;
	public String loc;
	private long pay;
	// 캡슐화
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPay() {
		return pay;
	}
	public void setPay(long pay) {
		this.pay = pay;
	}
	
	
}
public class 접근지정어_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon hong = new Sawon();
		hong.dept="개발부";
		hong.job="사원";
		hong.loc="제주";
		// => 메소드를 이용해서 접근
		hong.setSabun(1);
		hong.setName("홍길동");
		hong.setPay(3000);
		// => 변수 => 저장 setXxx, 읽기 getXxx
		
		System.out.println("이름:"+hong.getName());
		System.out.println("사번:"+hong.getSabun());
		System.out.println("연봉:"+hong.getPay());
		System.out.println("부서:"+hong.dept);
		System.out.println("직위:"+hong.job);
		System.out.println("근무지:"+hong.loc);
	}

}
