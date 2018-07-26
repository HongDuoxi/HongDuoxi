package pack4;

public class WolfDog extends Dog{
	
	private String where = "산";
	
	public WolfDog(String name) {
		super(name);
	}
	
	public void show() {
		System.out.println("활동: " + where);
	}

	@Override
	public void print() {
		System.out.println(getName() + "는(은) " + where + "에 살아요.");
	}
	
	public void display() {
		print();
		super.print();
	}

}

