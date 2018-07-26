package pack5;

public class Jepum_TV extends Jepum{ //제품을 상속 걸면 빨간 줄이 뜨는데 추상 클래스를 오버라이드 안해서 그래. 
	
	public Jepum_TV() {
		System.out.println("TV 생성자");
	}
	
	@Override //추상메소드를 오버라이드하면 빈삼각형이 옆에 뜸
	public void volunmControl() {
		System.out.println("TV 소리조절");
	}

}
