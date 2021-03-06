package pack.gui;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyMemoJang extends JFrame implements ActionListener {
	JButton btnCopy = new JButton("Copy");
	JButton btnPaste = new JButton("Paste");
	JButton btnCut = new JButton("Cut");
	JButton btnDel = new JButton("Del");
	JPanel pn = new JPanel();

	JTextArea txtMemo = new JTextArea("");
	String copyText;

	// 메뉴아이템
	JMenuItem mnuNew, mnuSave, mnuOpen, mnuExit, 
	mnuCopy, mnuPaste, mnuCut, mnuDel, mnuAbout, mnuEtc1, mnuEtc2;
	
	// 팝업메뉴
	JPopupMenu popup; //마우스의 왼쪽과 오른쪽을 구분하는 방법
	JMenuItem mWhite, mBlue, mYellow;

	public MyMemoJang() {
		super("제목없음 - 메모장");
		initLayout();
		menuLayout();

		setBounds(200, 200, 400, 300);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int re = JOptionPane.showConfirmDialog(MyMemoJang.this, "정말 종료하시겠습니까?", "종료",
						JOptionPane.YES_NO_OPTION);
				if (re == JOptionPane.YES_OPTION) {
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JFrame을 종료할 때는 system.exit가 아니라 이렇게 해야 정말 종료가 됨.
																	// 공식이라고 생각해고 외워둬.
				} else {
					setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
				}
			}
		});
	}

	private void initLayout() {

		// 버튼 추가하기
		pn.add(btnCopy);
		pn.add(btnPaste);
		pn.add(btnCut);
		pn.add(btnDel);
		add("South", pn);

		// 스크롤바 만들기
		JScrollPane pane = new JScrollPane(txtMemo);
		// add("Center", txtMemo);
		add("Center", pane);

		btnCopy.addActionListener(this);
		btnPaste.addActionListener(this);
		btnCut.addActionListener(this);
		btnDel.addActionListener(this);
	}

	private void menuLayout() {
		JMenuBar menubar = new JMenuBar();

		JMenu mnuFile = new JMenu("파일"); // 주메뉴
		mnuNew = new JMenuItem("새로만들기"); // 부메뉴
		mnuOpen = new JMenuItem("열기...");
		mnuSave = new JMenuItem("저장...");
		mnuExit = new JMenuItem("종료");
		mnuFile.add(mnuNew);
		mnuFile.add(mnuOpen);
		mnuFile.add(mnuSave);
		mnuFile.addSeparator();
		mnuFile.add(mnuExit);

		JMenu mnuEdit = new JMenu("편집");
		mnuCopy = new JMenuItem("복사");
		mnuPaste = new JMenuItem("붙여넣기");
		mnuCut = new JMenuItem("잘라내기");
		mnuDel = new JMenuItem("삭제");
		mnuEdit.add(mnuCopy);
		mnuEdit.add(mnuPaste);
		mnuEdit.add(mnuCut);
		mnuEdit.add(mnuDel);

		JMenu mnuHelp = new JMenu("도움말");
		mnuAbout = new JMenuItem("메모장 정보...");

		// 메뉴 속에 메뉴를 넣는 방법
		JMenu mnuEtc = new JMenu("기타");
		mnuEtc1 = new JMenuItem("계산기");
		mnuEtc2 = new JMenuItem("메모장");
		mnuEtc.add(mnuEtc1);
		mnuEtc.add(mnuEtc2);
		mnuHelp.add(mnuAbout);
		mnuHelp.add(mnuEtc);

		menubar.add(mnuFile); // 메뉴바에 메뉴 장착
		menubar.add(mnuEdit); // 메뉴바에 메뉴 장착
		menubar.add(mnuHelp); // 메뉴바에 메뉴 장착

		setJMenuBar(menubar); // frame에 메뉴바 장착

		mnuNew.addActionListener(this);
		mnuOpen.addActionListener(this);
		mnuSave.addActionListener(this);
		mnuExit.addActionListener(this);

		mnuCopy.addActionListener(this);
		mnuPaste.addActionListener(this);
		mnuCut.addActionListener(this);
		mnuDel.addActionListener(this);

		mnuAbout.addActionListener(this);
		mnuEtc1.addActionListener(this);
		mnuEtc2.addActionListener(this);
		
		
		//팝업 메뉴
		popup = new JPopupMenu();
		JMenu mColor = new JMenu("색상 선택");
		mWhite = new JMenuItem("White");
		mBlue = new JMenuItem("Blue");
		mYellow = new JMenuItem("Yellow");
		mColor.add(mWhite);
		mColor.add(mBlue);
		mColor.add(mYellow);
		popup.add(mColor);
		txtMemo.add(popup); //대상이 txtArea
		
		mWhite.addActionListener(this);
		mBlue.addActionListener(this);
		mYellow.addActionListener(this);
		
		txtMemo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//초기 마우스가 3개의 버튼으로 이루어 져 있어 순서대로 1,2,3이다.
				if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
					popup.show(txtMemo, e.getX(), e.getY());
				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCopy || e.getSource() == mnuCopy) {
			// System.out.println(txtMemo.getSelectedText()); //뒤지면 다 나와 선택한 값만 저장하기
			copyText = txtMemo.getSelectedText(); // 복사
		} else if (e.getSource() == btnPaste || e.getSource() == mnuPaste) {
			// txtMemo.setText(copyText); //기존 문자열 싹 없애고 덮어써버려;; 그 지점에만 딱! 붙여넣으려면?
			int po = txtMemo.getCaretPosition();
			txtMemo.insert(copyText, po);
		} else if (e.getSource() == btnCut) {
			copyText = txtMemo.getSelectedText(); // 범위내의 문자열은 가지고 있어야 돼
			int start = txtMemo.getSelectionStart();
			int end = txtMemo.getSelectionEnd();
			txtMemo.replaceRange("", start, end);
		} else if (e.getSource() == btnDel) { // 컷이랑 비슷해서 딜리트 만들어 놓고 얘를 불러다 쓰는 경우도 있음
			int start = txtMemo.getSelectionStart();
			int end = txtMemo.getSelectionEnd();
			txtMemo.replaceRange("", start, end);
		}

		else if (e.getSource() == mnuNew) {
			txtMemo.setText("");
			this.setTitle("제목없음 - 메모장");
		} else if (e.getSource() == mnuOpen) {
			FileDialog dialog = new FileDialog(this, "열기", FileDialog.LOAD);
			dialog.setDirectory(".");
			dialog.setVisible(true);
			if (dialog.getFile() == null)
				return;
			String dfName = dialog.getDirectory() + dialog.getFile();

			try {
				BufferedReader reader = new BufferedReader(new FileReader(dfName));

				txtMemo.setText("");
				String line;
				while ((line = reader.readLine()) != null) {
					txtMemo.append(line + "\n");
				}
				reader.close();

				this.setTitle(dialog.getFile() + " - 메모장");
			} catch (Exception e2) {
				System.out.println("열기 에러" + e2);
			}

		} else if (e.getSource() == mnuSave) {
			// 경로 및 파일명 얻기 대화상자 호출 (각 os는 6개의 대화상자를 기본 제공) //박스로부터 저장하고 여는게 아니다. 단지, 정보를 얻기
			// 위한 박스일 뿐.
			FileDialog dialog = new FileDialog(this, "저장", FileDialog.SAVE);
			dialog.setDirectory(".");
			dialog.setVisible(true);
			if (dialog.getFile() == null)
				return;
			// System.out.println("박스 반환정보: " + dialog.getDirectory() + dialog.getFile());
			// //경로 및 파일명 정보를 받아오기
			String dfName = dialog.getDirectory() + dialog.getFile(); // 1. 제목을 변수로 받아서

			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(dfName)); // 2. 적용, 실질적인 저장작업
				writer.write(txtMemo.getText());
				writer.close();

				this.setTitle(dialog.getFile() + " - 메모장");
			} catch (Exception e2) {
				System.out.println("저장오류" + e2);
			}

		} else if (e.getSource() == mnuExit) {
			System.exit(0);
		} else if (e.getSource() == mnuAbout) {
			//대부분의 대화상자는 모달임 (cf.모달리스) 모달: 창이 뜬 상태에서는 다른 창 선택 못함
			new MemoAbout(this);
			//System.out.println("창 호출 후");
		} else if (e.getSource() == mnuEtc1) {
			try { 
				Runtime runtime = Runtime.getRuntime(); //프로그램 실행 메소드. 런타임이라는 클래스 new가 숨어있는 형태. 딱 getRuntime() 메소드만 가져오는 거
				runtime.exec("calc.exe");
			} catch (Exception e2) {
				// TODO: handle exception
			}
		} else if (e.getSource() == mnuEtc2) {
			try {
				Runtime.getRuntime().exec("notepad.exe");
			} catch (Exception e2) {
			}
		} else if (e.getSource() == mWhite) {
			txtMemo.setBackground(Color.WHITE);
		} else if (e.getSource() == mBlue) {
			txtMemo.setBackground(Color.BLUE);
		} else if (e.getSource() == mYellow) {
			txtMemo.setBackground(Color.YELLOW);
		}
		

		txtMemo.requestFocus();

	}

	public static void main(String[] args) {
		new MyMemoJang();
	}

}
