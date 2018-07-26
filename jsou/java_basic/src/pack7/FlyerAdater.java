package pack7;

abstract public class FlyerAdater implements Flyer{ //추상 클래스 중에서도 어댑터 클래스
	
	@Override
	public void fly() {}
	
	@Override
	public boolean isAnimal() {
		return false;
	}

}
