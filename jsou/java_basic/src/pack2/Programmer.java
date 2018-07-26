package pack2;

public class Programmer { //class에는 private 쓰지 않는다
	
	public String nickName; //초기값은 null
	//private int age = 0;
	private int age; //초기값으로 0을 가짐
	String spec = "자바개발자";
	
	public static String motto = "미치자";
	//static은 남용하면 안돼. 꼭 필요한 경우에만 사용하자!
	
	//public final double PI = 3.14; 
	//중간에 final을 적어쥬면 수정 불가능.
	//대문자로 쓰는게 개발자들 간 약속!
	public final static double PI = 3.14; 
	
	public Programmer() {
		System.out.println("난 생성자야. 초기화를 담당해!");
		System.out.println("초기화가 필요없으면 소스 코딩을 생략해도 괜찮아");
		age = 20;
	}
	
	public void displayData() {
		String sp = reSpeck();
		System.out.println("별명이 " + nickName + ", 나이는 " + age +"살" + ", 보유기술은 " + sp);
	}
	
	private String reSpeck() {
		return "보유 기술은 " + spec;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
