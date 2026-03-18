/*
 * 클래스
 * 	학생 => 한명에 대한 설명
 *  맛집 => 맛집 한개에 대한 저장
 *  레시피 => 레시피 한개에 대한 설계
 *  ----
 *  => 100 => new
 *  => 설계 : 사이트의 상세보기
 *  => 영화 => CGV / 롯데시네마 / 메가박스
 *  		  ----------------------
 *  			|공통으로 사용되는 변수
 *  			---- 추상화
 *  -----------------------------------
 *  학생 => 국어 / 영어 / 수학 / 총점 / 평균 / 학점 / 이름
 *  class Student
 *  {
 *  	int kor, eng, math, total;
 *  	double avg;
 *  	char score;
 *  	String name;
 *  }
 */
import java.util.*;
class Student
{
	int kor, eng, math, total;
	double avg;
	char score;
	String name;
}
public class 클래스_변수_장점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] std = new Student[3];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			Student s = new Student();
			System.out.print("이름 입력:");
			s.name = scan.next();
			
			System.out.print((i+1)+"번째 국어 점수:");
			s.kor = scan.nextInt();
			
			System.out.print((i+1)+"번째 영어 점수:");
			s.eng = scan.nextInt();
			
			System.out.print((i+1)+"번째 수학 점수:");
			s.math = scan.nextInt();
			
			s.total=s.kor+s.eng+s.math;
			s.avg=s.total/3.0;
			
			std[i]=s;
		}
		for(Student ss:std)
		{
			System.out.printf("%5s%5d%5d%5d%7d%7.2f\n",ss.name,ss.kor,ss.eng,ss.math,ss.total,ss.avg);
		}
	}

}
