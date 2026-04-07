package com.sist.inter;

import javax.swing.JFrame;

// 다중 상속 => 메소드명이 충돌이 안되게하는게 기본이다 => 윈도우
interface A
{
	public void aaa();
}
interface B
{
	public void bbb();
}
interface D
{
	public void aaa();
}
class C implements A,B,D
{

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("bbb() Call...");
	}

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("aaa() Call...");
	}
	
}
public class 인터페이스_3 extends JFrame{

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
