/*
 * 프로그램
 * => 반복문(조건, 선택문)
 * 형식
 * 	1) 제어문의 형식
 * 		1. 조건식
 * 			단일		|-----true/false 연산자만 사용
 * 				if(조건문) ----- 부정 연산자(!), 비교연산자, 논리연산자
 * 				{
 * 					실행문장 ==> 조건 true일때 처리
 * 				}
 * 				=> for안에 if 사용 => 검색
 * 			선택
 * 				if(조건문)
 * 				{
 * 					조건이 true
 * 				}
 * 				else
 * 				{
 * 					조건이 false
 * 				}
 * 			선택문
 * 				switch(문자, 문자열, 정수)
 * 				{
 * 					case 값:
 * 						처리문장
 * 						break;
 * 
 * 					default: 처리문장 => break를 생략이 가능
 * 				}
 * 
 * 				
 * 
 */

import java.util.Random;
import java.util.Scanner;
public class 제어문_반복문_문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 1부터 100까지 숫자 중 짝수의 합을 구하는 프로그램을 작성하시오.
		int even = 0;
		for(int i=1;i<=100;i++) {
			if(i%2==0)
				even+=i;
		}
		System.out.println(even);
		
		//2 사용자에게 숫자 n을 입력받아 1부터 n까지의 합을 구하시오.
		Scanner scan = new Scanner(System.in);

        System.out.print("n을 입력하세요: ");
        int n = scan.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;   // i를 계속 더함 // 누적 구할 시.
        }

        System.out.println("1부터 " + n + "까지의 합: " + sum);

        
        //3 1부터 50까지 숫자 중 3의 배수만 출력하시오.
        for(int i=1;i<=50;i++) {
        	if(i%3==0)
        		System.out.print(i+" ");
        }
        
        System.out.println();
        //4 1~100 사이에서 7의 배수 개수를 구하시오.
        int count = 0;
        for(int i=1;i<=100;i++) {
        	if(i%7==0)
        		count++; // 개수 구할 시
        }System.out.println(count+"개");
        
        //5 문자열 "JavaProgramming"의 각 문자 하나씩 출력하시오.
        // 문자열 => 무조건 0번부터 시작.
        String str = "JavaProgramming";
        for(int i=0;i<str.length();i++) {
        	System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
        //6 1부터 10까지 숫자를 while문으로 출력하시오.
        /*
         * while
         * => 순차적
         * 초기값 == 1
         * while(조건문) == 2
         * {
         * 		반복수행문장 == 3
         * 		증가식 == 4
         * }
         * 
         * ==> while(true)
         */
        int i = 1;
        while(i<=10) {
        	System.out.print(i+" ");
        	i++;
        }
        
        System.out.println();
        //7 사용자에게 숫자를 입력받아 1부터 그 숫자까지 출력하시오.
        Random r = new Random();
        int k=r.nextInt(10)+1;
        for(i=1;i<=k;i++) {
        	System.out.print(i+" ");
        }
        
        System.out.println();
        //8 1~100 사이 홀수만 출력하시오.
        for(i=1;i<=100;i+=2) {
        	System.out.print(i+" ");
        }
        //9 1~100 사이 숫자 중 5의 배수 합을 구하시오.
        System.out.println();
        sum=0;
        for(i=1;i<=100;i++) {
        	if(i%5==0)
        		sum+=i;
        }System.out.println(sum);
        
        System.out.println();
        //10 숫자 10부터 1까지 역순 출력하시오.
        for(i=10;i>=0;i--) {
        	System.out.print(i+" ");
        }
	}

}
