/*
 * 36page
 * ------
 * 변수의 정의 : 하나의 값을 저장할 수 있는 메모리 주소의 별칭
 * RAM => 주소 (주소마다 => 데이터 저장)
 *  | 각 => 4byte
 *  
 *  저장 크기
 *  1byte / 2byte / 4byte / 8byte => 기본형
 *  
 *  37page
 *  지역변수
 *  => stack 공간에 저장
 *  => {변수 선언} => 지역변수
 *                  ------ {}이 종료되면 자동 해제 => 메모리 자체 관리
 *  *** 변수 사용시에는 반드시 어떤 종류의 값을 저장할 지 미리 지정해야 한다.
 *      학점 => 문자 'A' => 정수 = 65 'a' => 97
 *      
 *      캐멀스타일 : 변수가 어떤 데이터 저장되어 있는지 의미
 *      -------
 *      가독성 : filename => fileName => 헝가리안식 표현
 *      
 *      변수 선언
 *      int kor;
 *      int eng;
 *      int math;
 *      
 *      int kor, eng, math;
 *      
 *      변수의 초기값
 *      kor = 100;
 *      eng = 90;
 *      math = 80;
 *      
 *      선언+초기값
 *      int kor = 90;
 *      
 *      프로그램에서 사용 => 초기값이 없는 상태에서는 오류 발생
 *      
 *      int a = 100; a에 100을 저장
 *      			 100을 a에 저장
 *      
 *      int a = 100 + 100;
 *      	---- 대입연산자 오른쪽 => 왼쪽
 *      
 *      => 변수명
 *      1) 길이 => 제한은 없다(3~10)
 *      2) 변수명에 i나 j는 사용하지 않는다
 *      
 *      => 변수 : 변하는 수 => 수정 / 저장 / 읽기
 *      
 *      
 * */
public class 변수_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)'A');
	}

}
