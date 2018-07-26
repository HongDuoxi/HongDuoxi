package pack4;

public class PolyBus extends PolyCar{
	
	private int passenger = 10;
	
	public PolyBus() {
		System.out.println("그 중에서 버스야");
	}	
	
	public void show() { //자식 고유의 메소드
		System.out.println("< 버스 >");
	}
	
	@Override
	public void displayData() { // 자식 클래스는 부모 클래스의 변수를 따로 선언할 필요 없이
								// ___. 필요없이 바로 사용. ____. 이거는 메인에서 쓰는 거쥬
		System.out.println("버스 승객은 " + passenger + ", 버스 속도는 " + speed);
	}
}
