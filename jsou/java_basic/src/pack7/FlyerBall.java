package pack7;

public class FlyerBall extends FlyerAdater{ //어댑터 클래스를 상속받아서 원하는 메소드만 오버라이딩 햐.
	
	@Override
	public void fly() {
		System.out.println("공이 관중 속으로 날아감");
	}
	
	public static void main(String[] args) {
		
		FlyerBall ball = new FlyerBall();
		ball.fly();
		
	}

}
