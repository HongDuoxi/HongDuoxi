package pack6;

public interface Resume {
	
	String SIZE = "A4"; //public final static: 대문자(파이널)에 기울임체(스태틱)
	
	//이렇게 쓰면 다 public이야.
	void setIrum(String irum);
	void setPhone(String phone);
	void print();
	
	default void playJava(boolean b) { //일반 메소드는 못오는데 default를 써주면 가능
										//default는 오버라이드 가능
		if(b) {
			System.out.println("자바 프로그래밍 가능");
		} else {
			System.out.println("자바 프로그래밍 불가능");
		}
	}
	
	static void changeData() {
		System.out.println("스태틱 처리 가능");
	}

}
