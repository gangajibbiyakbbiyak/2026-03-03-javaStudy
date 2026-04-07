package com.sist.manager;
import java.io.*;

import com.sist.commons.Manager;
import com.sist.vo.*;
public class FoodManager implements Manager{
	// 맛집 데이터 저장
	public static FoodVO[] foods=new FoodVO[713];
	/*
	 * 1. 데이터형
	 * 	= 기본형
	 * 		정수(int)...
	 * 	= 참조형
	 * 		클래스, 배열 => 주소를 이용한 방식
	 * 		---- 자바 라이브러리 클래스 / 사용자 정의
	 * 		클래스 1개는 한개 맛집에 대한 정보를 가지고 있다
	 * 
	 * 2. 데이터 공유
	 * 	=> 모든 사용자가 같은 데이터를 사용 => 공유
	 * 		=> static : 오라클 (데이터베이스 => 공유된 데이터)
	 * 3. 모든 클래스에서 접근이 가능 => public
	 * 		모든 변수는 private이 아니다 => 선택적이다
	 * 4. 초기화 => 값을 저장
	 * 		1) 명시적 초기화 int a = 10
	 * 		2) 초기화 블록
	 * 			인스턴스 {}
	 * 			정적	   static{}
	 * 			생성자
	 * 			=> 클래스 {} 은 선언만 가능
	 * 				=> 파일읽기(X)
	 * 			** static변수 => static{}
	 * 			** 인스턴스는 => 생성자()
	 * 			--------------------------상속예외
	 * 
	 */
	// 초기화 => 배열값 저장
	static
	{
		// 구현해서 초기화가 가능 => 자동 호출
		// => 파일 읽기 => CheckException => 예외처리
		// => 초기화블록은 throws를 사용할 수 없다
		try
		{
			StringBuffer sb = new StringBuffer();
			// 문자열을 모을 수 있는 임시 저장 장소를 가지고 있다
			// => 문자열 결합에 속도가 빠르다 : Buffer
			int i = 0;
			FileReader in = new FileReader("c:\\javaDev\\food.txt");
			while((i=in.read())!=-1) // -1 EOF (파일의 끝)
			{
				sb.append((char)i);
				// int read() => char 변환
				// 한글자씩 읽어 온다 ==> BufferedReader => 한줄씩
			}
			in.close();
			
			//System.out.println(sb.toString());
			// foods에 값 채우기
			String[] datas = sb.toString().split("\n");
			i=0;
			for(String data:datas)
			{
				System.out.println(data);
				String[] s = data.split("\\|");
				FoodVO vo=new FoodVO();
				vo.setNo(Integer.parseInt(s[0]));
				vo.setName(s[1]);
				vo.setType(s[2]);
				vo.setPhone(s[3]);
				vo.setAddress(s[4]);
				vo.setScore(Double.parseDouble(s[5]));
				vo.setParking(s[6]);
				vo.setPoster(s[7]);
				vo.setTime(s[8]);
				vo.setContent(s[9]);
				vo.setTheme(s[10]);
				vo.setPrice(s[11]);
				foods[i]=vo;
				i++;
			}
			
		}catch(Exception ex){}
	}
	// 기능
	@Override
	public FoodVO[] food_list(int page) {
		// TODO Auto-generated method stub

		int j=0;
		int pagecnt = (page*10)-10; // 페이지별 배열의 시작점
		int row = 10;
		int total = food_total();
		if(total==page)
			row=foods.length%10;
		FoodVO[] food = new FoodVO[row];
		// ArrayList => 배열의 단점을 보완 => 크기를 지정하지 않는다
		for(int i=0;i<foods.length;i++)
		{
			// i >= pagecnt => 배열의 시작점
			if(j<10 && i>=pagecnt)
			{
				
				food[j]=foods[i];
				j++; // 10개씩 나누는 변수
			}
		}
		
		
		
		
		
		return food;
	}
	@Override
	public FoodVO food_detail(int no) {
		// TODO Auto-generated method stub
		
		return foods[no-1];
	}
	@Override
	public FoodVO[] food_find(String type, String fd) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public FoodVO[] food_filter(String type) {
		// TODO Auto-generated method stub
		int row = 0;
		for(FoodVO vo:foods)
		{
			if(vo.getType().contains(type))
			{
				row++;
			}
		}
		FoodVO[] food = new FoodVO[row];
		int i = 0;
		for(FoodVO vo:foods)
		{
			if(vo.getType().contains(type))
			{
				food[i]=vo;
				i++;
			}
		}
		
		return food;
	}
	@Override
	public int food_total() {
		// TODO Auto-generated method stub
		return (int)(Math.ceil(foods.length/10.0));
	}
}
