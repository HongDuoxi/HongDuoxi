package pack5;

abstract public class Jepum { //추상클래스: abstract 메소드를 가지고 있으면 추상 클래스가 되며
					//추상 클래스는 객체화 될 수 없다.(자기 스스로 new할 수 없다.) 단독으로도 추상 가능.
					//추상 메소드로만 구성된 추상 클래스는 인터페이스가 된다.
	
	private int volunm;
	
	public Jepum() {
		System.out.println("추상클래스 생성자");
	}
	
	public void setVolunm(int volunm) {
		this.volunm = volunm;
	}
	public int getVolunm() {
		return volunm;
	}
	
	public void volunmShow() {
		System.out.println("소리 크기는 " + volunm);
	}
	
	abstract public void volunmControl(); 	//추상abstract 메소드: 이름만 있고 body{행위, 내용}이 없는 메소드.
											//추상 메소드가 있다는 것은 반드시 자식 클래스가 있을거라는거야 
											//자식이 빛을 갚듯이 오버라이드 반드시 해야 됨.

}
