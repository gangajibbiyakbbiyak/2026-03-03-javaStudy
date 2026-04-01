package com.sist.lang;

public class System_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		try
		{
			System.out.print("'1'정수 입력:");
			int num = System.in.read(); // char => int
			// => 키번호 => '1' => 49
//			System.out.println("num="+(num-'0'));
			System.out.print("'2'정수 입력:");
			int num2 = System.in.read();
			
			System.out.println();
		}catch(Exception ex) {}
		
	}

}
