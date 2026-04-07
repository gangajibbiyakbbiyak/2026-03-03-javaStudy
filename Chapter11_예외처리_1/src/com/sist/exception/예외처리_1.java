package com.sist.exception;

import java.util.Scanner;

import com.sun.jdi.Method;

/*
 * 에러가 나는 경우
 *  => 컴파일시 에러 / 실행시 에러 => javascript 연동
 *    => javac        java
 *  => 1. 사용자 입력 => 유효성 검사 = if
 *  		=> 예외처리 => 선택
 *  		=> UnCheckException
 *     2. 개발자 실수 : 예외처리 => 필수
 *     	ip(네트워크), URL, 데이터베이스 연결
 *     파일명...
 *     => CheckException : 컴파일러가 검사
 *     --------------------------------------- 수정이 가능 : 예외
 *     3. 생각하지 못한 에러
 *     --------------------------------------- 에러
 * 예외처리
 *  => 소스상에서 수정이 가능한 에러
 *  예외처리 범위(상속도)
 *  위로 갈수록 범위가 커진다
 *  		
 *  		Object
 *  			|
 *  		Throwable : 예외처리의 최상위
 *  			|
 *  -------------------------
 *  |                       |
 *  Error					Exception
 *  						|
 *  				-------------------------
 *  				|						|
 *  			IOException :               
 *  			입출력 = 메모리, 네트워크, 파일
 *  					|표준
 *  					  |
 *  					System.out
 *  						   ---
 *  					System.in
 *  			ClassNotFoundException
 *  				리플렉션 : 클래스 정보를 읽어서
 *  					메모리 할당 / 메소드 호출 / 변수값 지정
 *  					new 없이 메모리 할당이 가능
 *  
 */
class MyException
{
	public void aaa()
	{
		System.out.println("MyException:aaa() Call");
	}
	public void bbb()
	{
		System.out.println("MyException:bbb() Call");
	}
	public void ccc()
	{
		System.out.println("MyException:ccc() Call");
	}
}
public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
		}catch(Exception ex) {}
	}

}
