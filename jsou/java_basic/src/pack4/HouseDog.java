package pack4;

public class HouseDog extends Dog{
	
	private String where = "집";
	
	public HouseDog(String name) { //기본 생성자 없이 새로 만들었엉
		super(name);
	}
	
	public void show() {
		System.out.println("거주: " + where);
	}

	@Override
	public void print() {
		System.out.println(getName() + "는(은) " + where + "에 산다.");
	}

}
