package samples;

import java.awt.Frame;

public class MyFrame_2 extends Frame{
	
	public MyFrame_2() {
		super("상속연습"); //제목은 Frame 클래스의 private 멤버
		setLocation(500, 300);
		setSize(700, 400);
		setVisible(true);
	}
	
/*	private void abc() {
 		serTitle("상속연습");
		setLocation(500, 300);
		setSize(700, 400);
		setVisible(true);
	}*/

	public static void main(String[] args) {
		new MyFrame_2();
/*		MyFrame_1 frame2 = new MyFrame_2();
		frame2.abc();*/
	}

}
