package com.sist.lang;

import java.util.StringTokenizer;

public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String info="32,000원 | 2026년 4월 2일 발행 | 404쪽";
		long start = System.currentTimeMillis();
		String[] data = info.split("\\|");
		// 정규식 => 기호
		for(String s:data)
		{
			System.out.println(s);
		}
		long end = System.currentTimeMillis();
		System.out.println("데이터 갯수:"+data.length);
		System.out.println("걸린 시간:"+(end-start));
		System.out.println("==== StringTokenizer ====");
		StringTokenizer st = new StringTokenizer(info,"|");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		end = System.currentTimeMillis();
		System.out.println("걸린시간:"+(end-start));
	}

}
