package pack2;

public class MyCullMain {

	public static void main(String[] args) {

		System.out.println("\n\n뭔가 하다가...\n");
		
		Animal animal = new Animal("라이온킹", 3);
		animal.display();
		
		System.out.println();
		MyCullc calc = new MyCullc();
		System.out.println(calc.goPlus(3.6, 1));
		System.out.println(calc.goTry(3, 15));
		System.out.println(MyCullc.msg);
		
		System.out.println();
		System.out.println(Math.PI);
		System.out.println(Math.abs(9594/44));
		
	}

}
