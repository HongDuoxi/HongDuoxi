package pack7;

public class FlyerAirplane implements Flyer{
	
	@Override
	public void fly() {
		System.out.println("엔진 소리를 내며 구름 속으로 사라짐");
	}
	
	@Override
	public boolean isAnimal() {
		return false;
	}

}
