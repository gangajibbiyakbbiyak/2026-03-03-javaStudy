package com.sist.inter;
/*
 * 기본
 * 	= 클래스 : 설계 도구
 * 	= 객체 : 실제로 만들어진 것 => 사용
 * 	= 인스턴스 : 객체가 만들어질때 생기는 하나의 실체
 * 			   ---------------------------
 * 				메모리에 저장된 상태
 * 	  클래스 ====== 메모리
 * 			인스턴스화 ----- 인스턴스
 * 							|
 * 						   A a
 *  = 예)
 *  	스마트폰 설계 => 클래스 : 어떻게 만들지
 *  		모델명
 *  		색상
 *  		저장용량
 *  		카메라
 *  	  ----------- 메모리에 저장 : 만든것
 *  		색상 : 빨간색
 *  		모델명 : S-26
 *  		저장용량 : 126GB
 *  		카메라 : 12MP
 *  	  ----------- 인스턴스
 *  		스마트폰 구매
 *  		---------- 사용 : 객체 : 실제 사용
 *  
 *  	1. 인터페이스 / 추상클래스
 *  					|=> 일부만 개발자에게 맡긴다
 *  		=> 개발자에게 맡기는 것
 *  		=> 구현도 가능
 *  
 *  		예) 버튼 클릭 / 마우스 클릭 => 프로그램에 맞게 구현 요청
 *  		    윈도우 => 인터페이스 => 부품 업체가 여러곳
 *  					마우스 / 키보드 ...
 *  			----------------
 *  		=> 추상클래스의 일종
 *  			: 미완성된 클래스 => 직접사용이 불가능
 *  							  => 상속을 내려서 구현 후에 사용
 *  											---
 *  											implements
 *  		=> 자바는 모든 클래스 단일 상속
 *  		   ---------------------- 기능 추가 (다중 상속)
 *  										   -------
 *  											interface
 *  											=> 클래스 : 상위 클래스
 *  		=> 추상클래스의 단점을 보완
 *  		   --------
 *  		   |구현이 된 메소드 ===> 많다
 *  		   |구현이 안된 메소드 ===> 적다
 *  		   ------------------------- 구현이 안된 메소드가 더 많다
 */
interface 도형
{
	String COLOR = "black";
	// public static final
	// 도형 그린다
	public void draw();
	// abstract
	// public abstract void draw();
	/*
	 * abstract public void draw();
	 */
}
// 관련된 클래스를 모아서 한개의 이름으로 제어 => 인터페이스
// => 메모리 공간을 1개만 사용
// 웹 => 전송받는 메소드 / 브라우저 보내기
//       request        response : 어떤 파일 실행
class 선 implements 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(COLOR+"를 이용해서 선을 그린다");
	}
	
}

class 사각형 implements 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(COLOR+"를 이용해서 사각형을 그린다");
	}
	
}
// => 상속 / 구현 ==> 데이터형 2개 (도형, 삼각형)
class 삼각형 implements 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(COLOR+"를 이용해서 삼각형을 그린다");
	}
	
}
public class 인터페이스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		도형 a = new 선();
		a.draw();
		
		a = new 사각형();
		a.draw();
		
		a = new 삼각형();
		a.draw();
		
		// 클래스 모아서 관리 => 상속내리는 클래스 이용
		//                           ----- 인터페이스 이용
		
	}

}
