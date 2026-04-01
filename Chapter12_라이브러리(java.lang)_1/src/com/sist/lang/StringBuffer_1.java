package com.sist.lang;
// String과 동일 => append => 문자열 결합
import java.io.*;

public class StringBuffer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String foodData="";
			FileReader fr = new FileReader("c:\\javaDev\\food.txt");
			
			int i=0;
			long start = System.currentTimeMillis();
			while((i=fr.read())!=-1) // -1 EOF
			{
				foodData+=(char)i;
			}
			fr.close();
			long end = System.currentTimeMillis();
			
			System.out.println(foodData);
			System.out.println("걸린 시간:"+(end-start)+"MS");
		}catch(Exception ex) {}
	}

}
