package pack3;

public class Poham_Car_main {

	public static void main(String[] args) {
		
		Poham_Car sonata = new Poham_Car("소나타");
		sonata.playHandle(20);
		System.out.println(sonata.ownerName + "의 회전량은 " + sonata.turnShow + " " + sonata.handle.quantity);
		 
		sonata.playHandle(0);
		System.out.println(sonata.ownerName + "의 회전량은 " + sonata.turnShow + " " + sonata.handle.quantity);
		
		Poham_Car ferrari = new Poham_Car("페라리");
		ferrari.playHandle(-10);
		System.out.println(ferrari.ownerName + "의 회전량은 " + ferrari.turnShow + " " + ferrari.handle.quantity);

	}

}
