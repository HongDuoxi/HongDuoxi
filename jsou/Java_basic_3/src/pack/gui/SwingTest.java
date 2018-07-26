package pack.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SwingTest extends JFrame implements ActionListener {
	JTextField txtName, txtAge;
	JLabel lblResult; // 글을 직접 입력받게 하는 것보다 선택하는 것을 더 좋아함. 나중에 가공하기도 더 좋음.
	ButtonGroup buttonGroup = new ButtonGroup(); // 1. 버튼 그룹을 만들어서
	JRadioButton rdoM, rdoF; // 2. 두가지 버튼을 설정

	public SwingTest() {
		super("이벤트 연습");
		layInit();

		setBounds(200, 200, 300, 300);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫는 명령
	}

	private void layInit() {
		setLayout(new GridLayout(5, 1));

		// 1행
		JLabel lbl1 = new JLabel("이름: ");
		txtName = new JTextField("", 20);
		JPanel pn1 = new JPanel();
		pn1.add(lbl1);
		pn1.add(txtName);
		add(pn1);

		// 2행
		JLabel lbl2 = new JLabel("나이: ");
		txtAge = new JTextField("", 20);
		JPanel pn2 = new JPanel();
		pn2.add(lbl2);
		pn2.add(txtAge);
		add(pn2);
		
		//3행
		rdoM = new JRadioButton("남자", false);
		rdoF = new JRadioButton("여자", true); //둘 다 true면 마지막게 선택됨
		buttonGroup.add(rdoM);
		buttonGroup.add(rdoF);
		JPanel pn3 = new JPanel();
		pn3.add(new JLabel("성별선택"));
		pn3.add(rdoM);
		pn3.add(rdoF);
		add(pn3);
		
		//4행
		JButton btnOk = new JButton("확인");
		btnOk.addActionListener(this);
		JPanel pn4 = new JPanel();
		pn4.add(btnOk);
		add(pn4);
		
		//5행
		lblResult = new JLabel("결과: ", JLabel.CENTER);
		add(lblResult);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//입력자료 유효성 검사
		if(txtName.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "이름을 입력하시오");
			txtName.requestFocus(); //웹에서는 포커스를 맞춰주는 게 중요해. 그래서 이름에 포커스가 깜빡거리게 설정
			return;
		}
		
		if(txtAge.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "나이을 입력하시오");
			txtAge.requestFocus(); //웹에서는 포커스를 맞춰주는 게 중요해. 그래서 이름에 포커스가 깜빡거리게 설정
			return;
		}
		//1. 나이는 숫자로만 받기 위해 아스키코드 값으로 한계를 주는 방법이 있다.
		//2. 정규표현식을 사용해서 숫자와 문자를 구분하는 방법도 있다.
		//3. try-catch문장을 쓸 수도 있다.
		
		//<try-catch문장> 사용하기
		int nai = 0;
		try{ //이런 경우에 try-catch 문장을 사용하는고야.
			nai = Integer.parseInt(txtAge.getText());
		} catch(Exception e2) {
			JOptionPane.showMessageDialog(this, "나이는 숫자만 허용");
			txtAge.requestFocus(); 
			return;
		}
		
		//System.out.println(rdoM.isSelected() + " " + rdoF.isSelected()); //누가 선택됐는지 잘하고 있는지 콘솔창을 통해 확인
		String gender = "";
		if(rdoM.isSelected()) {
			gender = "남";
		} else {
			gender = "여";
		}
		
		String ss = "결과: " + txtName.getText() + " 님의 나이는 " + txtAge.getText() + " " + gender;
		lblResult.setText(ss);
	}

	public static void main(String[] args) {
		new SwingTest();
	}
}
