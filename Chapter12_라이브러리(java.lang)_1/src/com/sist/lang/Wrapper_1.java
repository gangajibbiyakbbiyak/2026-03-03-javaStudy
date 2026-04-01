package com.sist.lang;
// 포장 클래스 => 데이터형을 쉽게 다루기 위해서 만들어진 클래스
//				=> 제네릭에서 사용이 가능하게 만든 클래스
// <클래스> : 데이터형 통일 <int> (X), <Integer> (O)
/*
 * 기본형 : 클래스화
 * -------------
 * byte => Byte
 * short => Short
 * int => Integer
 * long => long
 * -------------
 * 문자형
 * 	char => Character
 * 실수형
 * 	float => Float
 * 	double => Double
 * 논리형
 * 	boolean => Boolean
 * 문자배열
 *  char[] => String
 *  
 *  양쪽의 호환성
 *  ----------
 *  AutoBoxing / UnBoxing
 *  
 *  Integer i = new Integer(10)
 *  ---------------------------
 *  integer i = 10;
 */
public class Wrapper_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = 10;
		Integer j = 20;
		System.out.println(i+j);
	}

}
