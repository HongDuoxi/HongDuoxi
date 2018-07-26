package pack2;

import java.util.Calendar;

public class MySingleton_main {
	
	public static void main(String[] args) {
	
	MySingleton s1 = new MySingleton();
	MySingleton s2 = new MySingleton();
	System.out.println(s1 + " " + s2);
	
	MySingleton s3 = MySingleton.getInstance();
	MySingleton s4 = MySingleton.getInstance();
	System.out.println(s3 + " " + s4);
	
	System.out.println();
	Calendar life = Calendar.getInstance(); 
	int y = life.get(Calendar.YEAR); //final이라 대문자 static이라 기울임체
	System.out.println(y + "년");
	
	Calendar life1 = Calendar.getInstance(); 
	int y1 = life1.get(Calendar.YEAR); //final이라 대문자 static이라 기울임체
	int m1 = life1.get(Calendar.MONTH);
	int d1 = life1.get(Calendar.DATE);
	System.out.println("오늘은 " + y1 + "년 " + (m1+1) + "월 " + d1 + "일"); 
	//"월"만 0부터 반환해서 +1 시켜줘야 됨
	
	System.out.println();
	System.out.println("차이는 " + s1.gap);
	s1.appe(50);
	
	
	}

}
