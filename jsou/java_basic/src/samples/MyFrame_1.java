package samples;

import java.awt.Frame;

//자바 제작자가 제공하는 Frame 클래스를 사용 - 포함

public class MyFrame_1 {
	
	private Frame fr;
	
	public MyFrame_1() { //생성자 호출
		
		fr = new Frame("포함연습");
//		fr.setLocation(700, 400);
//		fr.setSize(500, 300);
//		fr.setVisible(true);
		
		//display(); //호출
		
	}
	
	private void display() {
		fr.setLocation(700, 400);
		fr.setSize(500, 300);
		fr.setVisible(true);
	}
	
	public static void main(String[] args) {
//		new MyFrame_1(); //객체를 만들 필요가 없으면 이렇게도 가능
		MyFrame_1 frame1 = new MyFrame_1();
		frame1.display();
		//사람들이 X를 누르는 것 > 이벤트, 사건발생, UXUI
		
	}
	
	
}
