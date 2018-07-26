package AbstractPractice;

public class SalesMan extends Regular{
	
	private int sales;  //실적
	private double commission; //수수료율(예:0.25)
	
	//-------------------------------------
	
	public SalesMan(String irum, int nai, double salary, int sales, double commission) {
		super(irum, nai, salary);
		this.sales = sales;
		this.commission = commission;
	}
	
	//-------------------------------------
	
	@Override
	public double pay() {
		return super.pay() + (sales*commission);
	}
	
	@Override
	public void print() {
		System.out.print("영업직: ");
		display();
		System.out.println((int)pay());
	}
	
	
	

}
