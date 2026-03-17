/*
 * trim() : 좌우의 공백 제거
 * => 유효성 검사
 * valueOf()
 * format()
 */
import javax.swing.*;
public class String_7 extends JFrame{

	JTextField tf = new JTextField();
	public String_7()
	{
		add("North",tf);
		tf.setText(String.valueOf(10));
		setSize(300,350);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new String_7();
	}

}
