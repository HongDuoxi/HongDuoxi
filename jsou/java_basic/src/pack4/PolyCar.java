package pack4;

public class PolyCar {
	
	protected int speed = 80; //패키지 내에서 사용 가능 밖에서는 폴리카를 부모로 갖는 자식 클래스만 사용 가능
	
	public PolyCar() {
		System.out.println("난 대중교통이야~~~~~");
	}
	
	public void displayData() {
		System.out.println("속도: " + speed);
	}
	
	public int getSpeed() {
		return speed;
	}
	

}
