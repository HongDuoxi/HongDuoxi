package samples;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame_6 extends Frame{
	
	public MyFrame_6() {
		
		setTitle("내부 클래스 연습");
		setSize(300, 200);
		setLocation(200, 200);
		setVisible(true);
		
		//내부 익명(무명) 클래스 사용
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); 
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mousePressed(e);
			}
		});
	}
	
	public static void main(String[] args) {
		new MyFrame_6();
	}
}
