package pack.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LayoutEX extends Frame implements ActionListener{ //ActionListener(버튼, 메뉴)는 메소드가 하나니까 임플리먼트 해도 부담 없지
	Panel pn1 = new Panel();
	Panel pn2 = new Panel();
	Panel pn3 = new Panel();
	Panel pn4 = new Panel();
	Panel pn5 = new Panel();
	Button btsOK; //이름 줄 때 앞에 세글자는 버튼이라는 형태, 뒤는 용도
	CardLayout card = new CardLayout();//레이아웃 매니저
	TextField txtBunho, txtIrum;
	
	public LayoutEX() {
		//Frame은 기본이 BorderLayout 동/서/남/북/가운데 공간이 있는 배치
		//화면이 반으로 쪼개 진 그리드 레이아웃으로 배치를 바꿀거야
		setLayout(new GridLayout(2, 1));
		
		//1번째 행
		Label lbl1 = new Label("bunho");
		txtBunho = new TextField("10",  20); //싱글라인 에디터. 화면에서 글을 쓸 수 있음
		
		//Penal은 기본이 FlowLayout (좌에서 우로, 위에서 아래로 중앙정렬)
		pn1.add(lbl1);
		pn1.add(txtBunho);
		pn1.setBackground(Color.YELLOW);
		//add(pn1); //Label을 panel에  배치
		
		Label lbl2 = new Label("irum");
		txtIrum = new TextField("Hong",  20);
		
		pn2.add(lbl2);
		pn2.add(txtIrum);
		pn2.setBackground(Color.MAGENTA);
		//add(pn2);
		
		//카드 레이아웃: 차곡차곡 겹쳐놓고 필요할 때 가져오는 방법
		pn3.setLayout(card); //원래 FlowLayout이었는데 CardLayout으로 바꿈
		pn3.add("KBS", pn1);
		pn3.add("SBS", pn2);
		//add(pn3); //위에 레이아웃에 겹쳐서 있음
		
		btsOK = new Button("OK");
		btsOK.addActionListener(this); //LayoutEX가 버튼을 가지고 있으므로.. 여기서 버튼을 누를 경우 actionPerformed로 감. 정해진 것.
		pn4.add(pn3);
		pn4.add(btsOK);
		add(pn4);
		
		//---------레이아웃 매니저에 대한 내용 중----------
		
		//2번째 행
		pn5.setBackground(Color.GREEN);
		pn5.setLayout(new BorderLayout());
		pn5.add("Center", new Label("My name is java", Label.CENTER)); //"Center"는 Border꺼 Label.CENTER는 Label꺼
		pn5.add("East", new Label("East"));
		pn5.add("West", new Label("West"));
		pn5.add("South", new Label("South", Label.CENTER));
		pn5.add("North", new Label("North", Label.CENTER));
		
		add(pn5); //panel은 원래 FlowLayout
		
		setTitle("레이아웃 연습");
		setBounds(200, 200, 400, 300); //프레임은 컨테이너라고 생각하면 돼. 그 안에 또 작은 컨테이너 "패널"을 넣을 수 있음. 패널 안에는 체크박스라던지 컴포넌트들을 넣을 수 있다.
		setVisible(true);
		
		addWindowListener(new WindowAdapter() { //()안에 들어가는 내부 익명 클래스 공부하고 이해하기
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		setTitle("버튼을 클릭했구나!");
		//System.out.println(e.getActionCommand()); //콘솔창에 버튼에 있응 글이 찍혀
		if(e.getActionCommand().equalsIgnoreCase("ok")) {
			btsOK.setLabel("click");
			card.show(pn3, "SBS");
		} else {
			btsOK.setLabel("OK");
			card.show(pn3, "KBS");
		} //작은 공간을 활용할 수 있는 CardLayout를 잘 알아둬
	}

	public static void main(String[] args) {
		new LayoutEX(); //생성자에서 끝나므로 생성자만 생성하고 끝!
	}

}
