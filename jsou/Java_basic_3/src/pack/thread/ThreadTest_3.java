package pack.thread;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;

public class ThreadTest_3 extends Frame implements ActionListener, Runnable{
	
	Label lbl;
	Thread thread;
	boolean b = false;
	
	public ThreadTest_3() {
		lbl = new Label("Display datetime", Label.CENTER); //New font: 글꼴의 크기와 색
		add("Center", lbl);
		
		Button btnClick = new Button("click");
		add("South", btnClick);
		btnClick.addActionListener(this);
		
		setTitle("Thread watch");
		setBounds(200, 200, 300, 250);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				b = true;
				System.exit(0);
				
			}
		});
		 
		thread = new Thread(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//버튼을 누르면 이 메소드로 들어오게 되어있다. 
		//System.out.println("바보");
		if(thread.isAlive()) return;
		thread.start();
	}
	
	@Override
	public void run() {
		while(true) {
			
			if(b == true) break;
			calendarShow();
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	private void calendarShow() {
		Calendar cal = Calendar.getInstance();
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH) +1;
		int d = cal.get(Calendar.DATE);
		int h = cal.get(Calendar.HOUR);
		int mi = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		lbl.setText(y + "-" + m + "-" + d + " " + h + ":" + mi + ":" + s);
		lbl.setFont(new Font("궁서", Font.BOLD, 22));
	}
	
	public static void main(String[] args) {
		new ThreadTest_3();
	}

}
