package pack.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class PackMan extends JFrame implements KeyListener {
	Image image;
	int x, y;
	int sel = 1;

	public PackMan() {
		super("상하좌우 화살표를 사용하세요");

		setLayout(null);
		setResizable(false); // 창 크기 조절 안할거야
		setIconImage(Toolkit.getDefaultToolkit().getImage("c:/work/packman/pack1.jpg")); // 상단 이미지 바꾸는 법

		setBounds(200, 200, 300, 300);
		setBackground(Color.WHITE);
		setVisible(true);

		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		x = getWidth() / 2;
		y = getHeight() / 2;

		addKeyListener(this); // frame에 KeyListener를 장착 > key값을 인식
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode(); // int key변수에 자판의 코드를 받아옴
		// System.out.println(key); //키를 누르고 나면 키보드의 값을 인식해서 콘솔에 출력
		if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_NUMPAD6) { // 오른쪽화살표, numberLock키 6번
			// System.out.println("오른쪽");
			// if(sel == 1) sel = 2; else sel = 1; //입을 암냠냠냠 하게 만드는 방법
			sel = (sel == 1) ? 2 : 1; // 삼항연산자
			x = (x < getWidth()) ? x += 10 : -image.getWidth(this); // x가 0보다 작아지면 이미지의 x좌표가 0부터 다시!
		} else if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_NUMPAD4) {
			sel = (sel == 3) ? 4 : 3;
			x = (x > 0) ? x -= 10 : getWidth()+image.getWidth(this);
		} else if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_NUMPAD8) {
			sel = (sel == 5) ? 6 : 5;
			y = (y < getHeight()) ? y += 10 : -image.getHeight(this);
		} else if (key == KeyEvent.VK_UP || key == KeyEvent.VK_NUMPAD2) {
			sel = (sel == 7) ? 8 : 7;
			y = (y > 0) ? y -= 10 : getHeight()+image.getHeight(this);
		}

		repaint();
	}

	@Override
	public void paint(Graphics g) { // 붓이라고 생각해. 기본적으로 호출되는 메시지. 시스템에서 호출하는거야.

		switch (sel) {
		// 오른쪽
		case 1:
			image = Toolkit.getDefaultToolkit().getImage("c:/work/packman/pack1.jpg");
			break;
		case 2:
			image = Toolkit.getDefaultToolkit().getImage("c:/work/packman/pack2.jpg");
			break;
			
		// 왼쪽
		case 3:
			image = Toolkit.getDefaultToolkit().getImage("c:/work/packman/pack3.jpg");
			break;
		case 4:
			image = Toolkit.getDefaultToolkit().getImage("c:/work/packman/pack4.jpg");
			break;
			
		// 아래
		case 5:
			image = Toolkit.getDefaultToolkit().getImage("c:/work/packman/pack5.jpg");
			break;
		case 6:
			image = Toolkit.getDefaultToolkit().getImage("c:/work/packman/pack6.jpg");
			break;
			
		// 위
		case 7:
			image = Toolkit.getDefaultToolkit().getImage("c:/work/packman/pack7.jpg");
			break;
		case 8:
			image = Toolkit.getDefaultToolkit().getImage("c:/work/packman/pack8.jpg");
			break;
		}

		g.clearRect(0, 0, getWidth(), getHeight()); // 잔상을 지워주는 방법. getWidth(), getHeight() 좌우길이를 구할 수 있음.
		g.drawImage(image, x - image.getWidth(this) / 2, y - image.getHeight(this) / 2, this);
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	public static void main(String[] args) {
		new PackMan();

	}

}
