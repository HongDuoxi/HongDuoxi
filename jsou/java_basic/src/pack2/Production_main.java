package pack2;

public class Production_main {

	public static void main(String[] args) {
		
		System.out.println("\n\n");
		
		Production bottle = new Production("스타벅스 보틀");
		bottle.display(28000, 1);
		
		Production milk = new Production(4580);
		milk.display("매일우유", 2);
				
		
		//-----------------------------
		
		System.out.println();
		Production glass = new Production(15500);
		glass.setSize(55491842, 20);
		glass.display("아몬드브리즈");

	}

}
