package AbstractPractice;

public class Regular extends Employee{
	
	private double salary;
	
	//-------------------------------------
	
	public Regular(String irum, int nai, double salary) {
		super(irum, nai);
		this.salary = salary;
	}
	
	//-------------------------------------
	
	@Override
	public double pay() {
		return salary;
	}
	
	@Override
	public void print() {
		System.out.print("정규직: ");
		display();
		System.out.println((int)pay());
	}

}
