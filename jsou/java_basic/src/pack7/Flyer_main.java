package pack7;

public class Flyer_main {

	public static void main(String[] args) {

		System.out.println(Flyer.FAST);

		FlyerBird bird = new FlyerBird();
		bird.fly();
		FlyerAirplane airplane = new FlyerAirplane();
		airplane.fly();

		System.out.println();
		Flyer_Util.showData(bird);
		Flyer_Util.showData(airplane);
		
		
		
	}

}
