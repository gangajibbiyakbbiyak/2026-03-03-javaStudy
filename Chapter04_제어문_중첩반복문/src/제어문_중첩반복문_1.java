/*
 * 중첩
 * ---
 * 	 로그인이 된 경우
 * if(조건문) =======> if(조건문 && 조건문)
 * {
 * 		   관리자면
 * 		if(조건문)
 * 		{
 * 
 * 		}
 * }
 * 
 * ---------------------------------------
 *       1    2    7
 * for(초기값;조건식;증가식) =====> 세로 (줄 수)
 * {      3    4     6
 * 	for(초기값;조건식;증가식) =====> 가로(실제 출력물)
 * 	{        5
 * 		반복 수행 문장
 * 	}
 * }
 */
public class 제어문_중첩반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 구구단
		for(int i=1;i<=9;i++) { // 9줄을 만든다
			for(int j=2;j<=9;j++) { // 8개를 출력
				System.out.printf("%d*%d=%2d\t",j,i,j*i); // 한 줄에 8개 만들기
				// \t tab (일정 간격)
			}
			System.out.println(); // 9줄 만들기
		}
	}

}
