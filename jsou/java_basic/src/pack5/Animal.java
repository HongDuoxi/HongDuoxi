package pack5;

abstract public class Animal { //부모 클래스로만 살거야 객체 생성할 생각 없어.
	
	abstract public String name();
	abstract public String eat();
	abstract public String action();
	
	public void print() {
		System.out.println("동물 클래스의 일반메소드 프린트");
	}

}
