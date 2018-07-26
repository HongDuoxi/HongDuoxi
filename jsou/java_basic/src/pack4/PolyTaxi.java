package pack4;

public class PolyTaxi extends PolyCar{
	
	private int passenger = 2;
	
	public PolyTaxi() {
		System.out.println("그 중에서 택시야");
	}
	
	public void show() {
		System.out.println("< 택시 >");
	}
	
	@Override
	public void displayData() {
		System.out.println("택시 승객은 " + passenger);
	}
}
