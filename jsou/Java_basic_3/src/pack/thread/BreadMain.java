package pack.thread;

public class BreadMain {
	
	public static void main(String[] args) {
		BreadPlate breadPlate = new BreadPlate();
		
		BreadMaker maker = new BreadMaker(breadPlate);
		BreadEater eater = new BreadEater(breadPlate);
		
		maker.setPriority(8); //이게뭐지?
		maker.start(); //동기화(synchronized)에 의해서 자원(breadCount)이 공유되고 있다.
		eater.start();
	}

}