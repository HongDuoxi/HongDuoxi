package AbstractPractice;

public class Manager extends Regular{

	private double incentive; //관리수당
	
	//-------------------------------------
	
	public Manager(String irum, int nai, double salary) {
		super(irum, nai, salary);
		
		if(salary >= 2500000) {
			incentive = salary*0.6;
		} else if(salary < 2000000) {
			incentive = salary*0.4;
		} else {
			incentive = salary*0.5;
		}	
	}
	
	//-------------------------------------
	
	@Override
	public double pay() {
		return super.pay() + incentive;
	}
	
	@Override
	public void print() {
		System.out.print("관리직: ");
		display();
		System.out.println((int)pay());
	}
	

}
