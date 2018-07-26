package samples;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame_3 extends Frame implements WindowListener, MouseListener { // 프래임 상속 윈도우리스너 구현
	// 윈도우 이벤트 관련 추상 메소드 관련 WindowListener
	public MyFrame_3() {
		super("인터페이스 연습");

		addWindowListener(this); // 아규먼트를 달래. 현재 클래스 안에 리스너가 있으므로 this를 넣어줌.
									// 현재 프레임에 WindowListener 장착. 이벤트가 발생하면 귀기울이고 있다가 실행
		addMouseListener(this);
	}

	private void abc() {
		setLocation(500, 300);
		setSize(700, 400);
		setVisible(true);
	}

	// 7개의 윈도우리스너 내의 추상 메소드를 오버라이딩 해야 함

	@Override
	public void windowActivated(WindowEvent e) { // windowActivated: 이벤트 핸들러 메소드
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("종료");
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("화면 복귀");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("화면 아이콘화");
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	int count = 0;

	// mouse 관련 메소드

	@Override
		public void mouseClicked(MouseEvent e) {
		//int count = 0;
		//System.out.println("폼바닥 클릭수: " + (count += 1));
		
		//setBackground(Color.GREEN);
		//setBackground(new Color(244, 180, 180));
		
		System.out.println((int)(Math.random()*255));
		int r = (int)(Math.random()*255);
		int g = (int)(Math.random()*255);
		int b = (int)(Math.random()*255);
		setBackground(new Color(r, g, b));
		setTitle(r + " " + g + " " + b); // ㅜㅜ왜 안되지..?
	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	public static void main(String[] args) {
		MyFrame_3 frame3 = new MyFrame_3();
		frame3.abc();
	}

	//

}
