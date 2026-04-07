package com.sist.exception;
// 멀티 catch => 다중 예외처리
public class 예외처리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String n1 = "10";
			String n2 = "3";
			int[] arr = {
					Integer.parseInt(n1), Integer.parseInt(n2)
			};
			int res=arr[0]/arr[2];
			System.out.println(res);
			// ==> else if : 한개만 수행
		}catch(NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			e.printStackTrace();
		}
//			catch(NumberFormatException e) // 정수변환이 안되는 경우
//		{
//			e.printStackTrace();
//		}catch(ArrayIndexOutOfBoundsException e) // 배열범위 초과
//		{
//			e.printStackTrace();
//		}catch(ArithmeticException e) // 0으로 나누는 경우
//		{
//			e.printStackTrace();
//		}catch(Exception e) // 다중 if문의 else역할
//		{
//			e.printStackTrace();
//		}
	}

}
