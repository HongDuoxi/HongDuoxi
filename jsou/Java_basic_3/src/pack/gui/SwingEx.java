package pack.gui;

import java.awt.BorderLayout;
//import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingEx extends JFrame implements ActionListener { //1. J프레임 상속받고 임플리먼트로 액션리스너 받기
	JLabel lblShow; // Swing은 자바로 했고. 윈도우나 모바일에서도 사용 가능
	int count = 0;

	public SwingEx() {
		setTitle("Swing Test");

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 1)); // 2행으로 그리드 바꾸기
		// panel.setBackground(Color.CYAN);

		// panel의 첫번째 행
		JButton button = new JButton("클릭(C)");
		button.setMnemonic(KeyEvent.VK_C); // (Alt + C) 키를 누르면 버튼이 실행되게 설정
		panel.add(button); // panel에 첫행에 버튼을 넣어줘
		button.addActionListener(this);
		panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 10, 50)); // 버튼 크기 조절


		// panel의 두번째 행
		lblShow = new JLabel("버튼 클릭 수: " + count);
		panel.add(lblShow);

		// getContentPane().add(panel); //이전에는 이렇게만 가능했는데
		// add("Center", panel); //이제는 이렇게도 가능
		add(panel, BorderLayout.CENTER);

		setBounds(200, 200, 300, 300);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JFrame 종료하는 법
	}

	@Override
	public void actionPerformed(ActionEvent e) { //3. 액션리스너에 있는 하나의 메소드 actionPerformed 호출하기
		count++;
		lblShow.setText("버튼 클릭 수: " + count);
	}

	public static void main(String[] args) {
		new SwingEx(); //2. 스윙 생성자 호출하기
	}

}
