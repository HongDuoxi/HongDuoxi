package pack.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class SwingMenu extends JPanel implements ActionListener { // swing메뉴는 패널이야.
	JButton btnR, btnG, btnB;
	JTextArea txtArea = new JTextArea("", 10, 10);
	JMenuBar mBar;
	JMenuItem mnuMes, mnuOk, mnuInput;

	public SwingMenu() {
		setLayout(new BorderLayout()); //flow를 -> Border로 바꿔줌
		btnR = new JButton("빨강");
		btnG = new JButton("초록");
		btnB = new JButton("파랑");
		btnR.addActionListener(this);
		btnG.addActionListener(this);
		btnB.addActionListener(this);
		
		JPanel jPanel = new JPanel();
		jPanel.add(btnR);
		jPanel.add(btnG);
		jPanel.add(btnB);
		add("South", jPanel);
		add("Center", txtArea);
		
		menuShow();
	}
	
	private void menuShow() {
		mBar = new JMenuBar();
		JMenu menu = new JMenu("메뉴");
		mnuMes = new JMenuItem("메시지");
		mnuOk = new JMenuItem("확인");
		mnuInput = new JMenuItem("입력");
		menu.add(mnuMes);
		menu.add(mnuOk);
		menu.add(mnuInput);
		
		mBar.add(menu);
		
		//메뉴에 리스너 장착
		mnuMes.addActionListener(this);
		mnuOk.addActionListener(this);
		mnuInput.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnR) {
			txtArea.setBackground(Color.RED);
		} else if(e.getSource() == btnG) {
			txtArea.setBackground(Color.GREEN);
		} else if(e.getSource() == btnB) {
			txtArea.setBackground(Color.BLUE);
		} //버튼의 단점. 화면의 공간을 너무 많이 차지한다. > menu로 해결
		  else if(e.getSource() == mnuMes) {
			JOptionPane.showMessageDialog(this, "메시지가 실행되었습니다", "알림", JOptionPane.INFORMATION_MESSAGE/*마지막은 생략가능*/);
			System.out.println("창이 닫히기 전까지 수행 안함");
		} //모달 다이얼로그 옵션: 다이얼로그 창이 닫히기 전까지 아래있는 버튼 작동 불가
		  else if(e.getSource() == mnuOk) {
			int re = JOptionPane.showConfirmDialog(this, "버튼울 선택해주세요", "선택옵션 타이틀", JOptionPane.YES_NO_CANCEL_OPTION);
			System.out.println(re);
//			switch(re) {
//			case 0:
//				txtArea.setText("예 선택");
//				break;
//			case 1:
//				txtArea.setText("아니오 선택");
//				break;
//			case 2:
//				txtArea.setText("취소 선택");
//				break;
//			} //눈에 잘 띄지 않기 때문에 이렇게 잘 쓰지 않는다.
			switch(re) {
			case JOptionPane.YES_OPTION:
				//txtArea.setText("예 선택"); //하나만 나옴
				txtArea.append("예 선택\n"); //나온 글 아래에 추가
				break;
			case JOptionPane.NO_OPTION:
				//txtArea.setText("아니오 선택\n");
				txtArea.append("아니오 선택\n");
				break;
			case JOptionPane.CANCEL_OPTION:
				//txtArea.setText("취소 선택\n");
				txtArea.append("취소 선택\n");
				break;
			}
		} else if(e.getSource() == mnuInput) {
			String ss = JOptionPane.showInputDialog(this, "자료입력");
			txtArea.append(ss + "\n");
		}

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("메뉴 & 대화상자");

		SwingMenu panel1 = new SwingMenu(); // Panel을 new한거야

		// frame.getContentPane().add(panel1); //이전에 panel을 frame에 배치하는 방법
		frame.add(panel1); // 이번에 추가된 기능이야. 요새는 이렇게 panel을 frame에 배치
		frame.setJMenuBar(panel1.mBar); //Frame에 메뉴바 생성
		
		frame.setBounds(200, 200, 300, 300); 
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JFrame창 쫑료하는 방법
	}

}
