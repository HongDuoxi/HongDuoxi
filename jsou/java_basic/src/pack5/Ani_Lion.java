package pack5;

public class Ani_Lion extends Animal{
	
	@Override
	public String name() {
		return "사자";
	}
	
	@Override
	public String eat() {
		return "육식성";
	}
	
	@Override
	public String action() {
		return "크우와앙!!";
	}
	
	public void eatOther() {
		System.out.println("다른 동물들을 먹어요.");
	}

}
