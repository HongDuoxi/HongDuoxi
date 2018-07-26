package pack7;

public class FlyerBird implements Flyer {

	@Override
	public void fly() {
		System.out.println("날개를 저으며 숲 속으로 사라짐");
	}
	
	@Override
	public boolean isAnimal() {
		return true;
	}

}
