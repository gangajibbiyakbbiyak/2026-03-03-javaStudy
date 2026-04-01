// 1-2+3-4+5-6+7-8+9-10 구하기
// 반복문은 반드시 => 수열(수끼리 규칙)

public class 제어문_반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1;i<=10;i++) {
			if(i%2==0)
				sum-=i;
			else
				sum+=i;
		}
		System.out.println(sum);
		
		// 1~10 ==> 3의 배수는 제외하고 출력
		for(int i=1;i<=10;i++) {
			if(i%3!=0)
				System.out.print(i+" ");
		}
		
		System.out.println();
		// 1~10 ==> 2의 배수이고 3의 배수인 값을 출력
		for(int i=1;i<=10;i++) {
			if(i%2==0 && i%3==0)
				System.out.println(i+" ");
		}
		
		// 가급적이면 반복 횟수 지정하면 주로 for문 사용
		// 반복 횟수가 없는 경우에는 주로 while을 사용
	}

}
