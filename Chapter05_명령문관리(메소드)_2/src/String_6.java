// 문자열 분리
// => split
/*
 * 원형
 * String[] split(String regex);
 */
public class String_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color = "red,green,blue,yellow,black,magenta,pink";
		String[] colors = color.split(",");
		for(String c:colors)
		{
			System.out.println(c);
		}
		/*
		 * 정규식 기호
		 * | . ? * +  는 기호이기 때문에 역슬러시 두개 줘야한다. 안그러면 한글자씩 잘라서 갖고옴
		 */
		color = "red|green|blue|yellow|black|magenta|pink";
		String[] colors2 = color.split("\\|");
		for(String c:colors2)
		{
			System.out.println(c);
		}
	}

}
