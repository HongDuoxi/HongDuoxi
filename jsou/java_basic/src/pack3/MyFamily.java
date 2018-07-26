package pack3;

public class MyFamily {

	public static void main(String[] args) {
		
		
		System.out.println("\n\n\n");
		
		//첫째 할아버지
		GrandFa gr = new GrandFa();
		System.out.println("할아버지 나이: " + gr.getNai());
		System.out.println("가보: " + gr.gabo);
		System.out.println("가훈: " + gr.gahun);
		System.out.println(gr.say());
		gr.say();
		gr.EAT();
		System.out.println(gr.data);
		
		
		//둘째 할아버지
		System.out.println();
		GrandFa gr2 = new GrandFa(72);
		System.out.println("할아버지 나이: " + gr2.getNai()); 
		System.out.println("가보: " + gr2.gabo);
		
		System.out.println("\n\n-------------------\n");
		
		//할아버지에게 상속받은 아버지 클래스
		Father fa = new Father(); //할아버지의 멤버변수와 메소드를 가져옴(단, private멤버만 빼고)
		System.out.println("가보: " + fa.gabo); 
		System.out.println("가훈: " + fa.gahun);
		System.out.println(fa.say());
		fa.say();
		fa.EAT();
		System.out.println("아버지 나이: " + fa.getNai());
		System.out.println("집은 " + fa.getHouse(3200));
		System.out.println(fa.data);
		
		/*
		System.out.println();
		Father fa2 = new Father(51);
		System.out.println("아버지2 나이: " + fa2.getNai());
		*/
		
		//---------------------------------------
		
		System.out.println("\n\n--------------------\n");
		Me me = new Me();
		System.out.println("가보: " + me.gabo);
		System.out.println("가훈: " + me.gahun);
		System.out.println(me.say());
		me.say();
		me.EAT();
		System.out.println("나의 나이: " + me.getNai());
		System.out.println("집은 " + me.getHouse(5000));
		me.life();
		me.displayData();
	
	}
}

















