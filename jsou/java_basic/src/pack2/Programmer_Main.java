package pack2;

public class Programmer_Main {

	public static void main(String[] args) {

		Programmer tom = new Programmer(); //생성자 호출
		//tom.Programmer(); //생성자 호출 불가능
		//여기서 tom은 참조형 변수이자 객체변수. 주소를 가지고 있다. 기본형 변수는 int, boolean 등등
		
		System.out.println();
		System.out.println("tom 별명은 " + tom.nickName);
		tom.nickName = "자바마스터";
		System.out.println("tom 별명은 " + tom.nickName);
		
		//System.out.println("\n\ntom의 나이는 " + tom.age);
		//age가 클래스에서 private기 때문에 이렇게는 오류.
		
		tom.setAge(24);
		System.out.println("\ntom의 나이는 " + tom.getAge());
		System.out.println("tom의 보유기술은" + tom.spec);
		tom.displayData();
		tom.spec += ", 파이썬 전문가";
		tom.displayData();
		
		System.out.println();
		//System.out.println(tom.motto); //객체변수로 불러도 가능하지만
		System.out.println(Programmer.motto); //클래스 이름으로 불러도 된다
		
		//tom.pi = 12.3;
		//System.out.println("파이는 " + tom.PI); //참조만 가능
		System.out.println("파이는 " + Programmer.PI); // static으로 설정했을 때 권장방법
		System.out.println(Math.PI);
		//클래스의 이름으로 호출한 대문자를 보면, static이구나!
		
		System.out.println("\n----------------\n");
		Programmer oscar = new Programmer();
		oscar.displayData();
	
	}

}
