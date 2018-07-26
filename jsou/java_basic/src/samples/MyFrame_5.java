package samples;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame_5 extends Frame{
	
	String str[] = {"다희", "동훈", "대환", "경영", "유정오"}; //비트맵 방식으로 글씨도 그림처럼
	
	int x, y;
	
	public MyFrame_5() {
		//super("내부 클래스 연습")
		setTitle("내부 클래스 연습");
		setSize(300, 200);
		setLocation(200, 200);
		setVisible(true);
		
		Wevent we = new Wevent();
		addWindowListener(we); 
		addMouseListener(new Mevent());
	}
	
	class Wevent extends WindowAdapter{ //내부 클래스
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	class Mevent extends MouseAdapter{
		
		@Override
		public void mouseClicked(MouseEvent e) { //mouseClicked >> 이벤트 핸들러
			//setBackground(Color.BLUE);
//			int x = e.getX();
//			int y = e.getY();
			x = e.getX();
			y = e.getY();
			//System.out.println(x + ", " + y);
			setTitle(x + ", " + y);
			//paint(getGraphics());
			repaint(); //paint() 메소드 호출, 내부적으로 화면을 깨끗히 하고 페인트 메소드를 다시 불러옴
		}
	}
	
	@Override
	public void paint(Graphics g) { //Graphics는 붓이라고 생각하면 돼
		//g.drawString("사이 좋게 지내자", x, y);
		g.setColor(new Color(
				(int)(Math.random() * 255),
				(int)(Math.random() * 255),
				(int)(Math.random() * 255)));
		g.setFont(new Font("고딕", Font.BOLD, (int)(Math.random() * 250 + 50))); //안내 팝업창을 잘 읽으면 금방금방 는다.
		int i = (int)(Math.random() * 5);
		g.drawString(str[i], x, y); //여기서 랜덤하게 이름이 나오게 바꿔보기
	}

	public static void main(String[] args) {
		new MyFrame_5();

	}

}
