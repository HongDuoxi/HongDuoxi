package pack2;

public class Animal {
	
	private int leg = 4;
	private int age;
	private String name;
	private static int mouse = 1;
	
	public Animal() {
		//생성자는 반드시 있으나 내용이 없을 시 생략 가능(컴파일러가 생성)
	}
	
	public Animal(int leg) { //constructor overlode(ing) 생성자 오버로딩
		this.leg = leg;		
	}
	
	public Animal(String name, int nai) { //constructor overlode(ing) 생성자 오버로딩
		this.name = name;
		age = nai;
	}
	
	public void display() {
		System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
	}
	
/* 	public void display(int nai) { //method overlode(ing) 재명명
		age = nai;
		System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
	}
*/ 	
	//하나의 클래스 내에 동일한 메소드가 2개면 오류지만 (아규먼트argument)에 지역변수를 넣으면 괜찮아
	//지역변수 nai를 멤버필드 age와 치환하는거야
	
	public void display(int age) { //method overlode(ing) 재명명
		this.age = age;
		System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
	}
/*
	public void display(String name) { //method overlode(ing) 재명명
		this.name = name;
		System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
	}
*/	
	public void display(int age, String irum) { //method overlode(ing) 재명명
		this.age = age;
		this.name = irum;
		System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
	}
	
	public void display(String name, int age) { //method overlode(ing) 재명명
		this.age = age;
		this.name = name;
		System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
	}
	
/*	public void display(int leg) { //method overlode(ing) 재명명
		this.leg = leg;
		System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
	} //이거는 int age와 구분이 되지 않기 때문에 가능
	//오버로딩의 성립조건 기억하기
*/	
	public void display(int age, int leg) { //method overlode(ing) 재명명
		this.age = age;
		this.leg = leg;
		System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
	}
/*	
	public int display(int aa) { //method overlode(ing) 재명명
		this.age = age;
		System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
		return 5;
	}
*/
	public static void myStaticMethod() {
		System.out.println("난 스태틱 메소드");
		System.out.println("입의 개수: " + mouse); //leg는 new 해야지 필요한 변수니까 static에 못 넣어!!
	}
	
	public void normalMethod() {
		System.out.println("난 일반 메소드");
		System.out.println("다리 개수: " + leg);
		System.out.println("입의 개수: " + mouse);
	}
	
}