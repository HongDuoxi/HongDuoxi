package samples;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame_4 extends WindowAdapter{ //어댑터 클래스를 상속받아서 원하는 메소드만 오버라이딩. 아까운 extends는 한 번만 쓸 수 있음.

	private Frame frame;
	
	public MyFrame_4() {
		frame = new Frame("Adapter(추상) 클래스 사용");
		frame.setLocation(500, 300);
		frame.setSize(700, 400);
		frame.setVisible(true);
		frame.addWindowListener(this);
	}
	
	@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	
	public static void main(String[] args) {
		new MyFrame_4();
	}

}
