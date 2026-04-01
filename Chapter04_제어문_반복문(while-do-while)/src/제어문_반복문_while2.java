/*
 * 1. while
 * 		사용자가 구구단 => 단을 입력하면
 * 		해당 단을 출력
 * 		--------------------------
 * 		변수 => 사용자가 입력한 단이 필요
 * 			   -------------------
 * 			   루프변수 : 1 ~ 9
 */
import java.util.Scanner; // 사용자가 입력이 있는 경우
/*
 * nextInt()
 * nextDouble()
 * next()
 * nextLine()
 */
public class 제어문_반복문_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 단 입력하라");
		int dan = scan.nextInt();
		
		// 요구사항 출력
		int i=1; // 1~9까지 변경되는 변수 : 루프(반복문)
		// 출력
		while(i<=9)
		{
			System.out.printf("%d*%d=%2d\n",dan,i,dan*i);
			i++; // 9가 될때까지 수행
		}
	}

}
