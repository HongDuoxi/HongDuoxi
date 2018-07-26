package pack.thread;

public class BreadMaker extends Thread{
	private BreadPlate plate;
	
	public BreadMaker(BreadPlate plate) {
		this.plate = plate;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 25; i++) {
			plate.makeBread();
		}
	}

}