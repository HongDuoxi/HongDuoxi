package pack5;

public class Ani_DogWolf extends Ani_Dog{ 
	
	//부모 클래스에 있는 바디가 없는 추상 메소드를 자식 클래스에서 모두 오버라이딩 해줘야 한다.
	
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "늑대먹이";
	}
	
	@Override
	public String action() {
		// TODO Auto-generated method stub
		return "아우우우우우";
	}

}
