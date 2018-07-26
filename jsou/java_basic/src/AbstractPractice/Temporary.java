package AbstractPractice;

public class Temporary extends Employee{
	
	private int ilsu;
	private double ildang;
	
	//-------------------------------------
	
	public Temporary(String irum, int nai, int ilsu, double ildang) {
		super(irum, nai);
		this.ilsu = ilsu;
		this.ildang = ildang;
	}
	
	//-------------------------------------
	
	@Override
	public double pay() {
		return ilsu*ildang;
	}
	
	@Override
	public void print() {
		System.out.print("임시직: "); 
		display();
		System.out.println((int)pay());
	}

}
