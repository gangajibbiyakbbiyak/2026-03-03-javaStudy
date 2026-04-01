/*
 * 웹개발
 * ---- String / ArrayList / Integer
 * 		------ 자바에서 지원하는 메소드 => 리턴형 / 매개변수 / 어떤 값 읽기
 * 
 * 비교
 * 	equals / equalsignoreCase
 * 				|검색 => 대소문자 구분이 없다
 * 				JAVA / Java / java ...
 * |ID/PWD => 대소문자 구분
 */
public class String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hong = "admin";
		String shim = "admin";
		String park = new String("admin");
		String lee = "Admin";
		// new는 새로운 메모리에 저장 사용
		if(hong==shim)
		{
			System.out.println("hong과 shim은 같다");
		}
		else
		{
			System.out.println("hong과 shim은 같지않다");
		}
		
		// hong 주소 안에 있는 문자열 / park안에 저장된 문자열이 같은지
		if(hong.equals(park))
		{
			System.out.println("hong과 park은 같다");
		}
		else
		{
			System.out.println("hong과 park은 같지않다");
		}
		// 가급적이면 => == 보다 equals 를 많이 사용
		// => 상세보기 / 아이디 찾기 / 비밀번호 찾기 / 로그인
		// equals 대소문자 구분
		if(hong.equals(lee))
		{
			System.out.println("hong과 lee는 같다");
		}
		else
		{
			System.out.println("hong과 lee는 같지않다");
		}
		
		// equalsIgnoreCase 대소문자 구분 없이 비교 // 검색에 사용
		/*
		 * boolean equalsIgnoreCase(String s)
		 * boolean equals(String s)
		 * ------> 조건문에서 주로 사용
		 */
		if(hong.equalsIgnoreCase(lee))
		{
			System.out.println("hong과 lee는 같다");
		}
		else
		{
			System.out.println("hong과 lee는 같지않다");
		}
	}

}
