package pack2;

public class Programmer_practice {

	public static void main(String[] args) {

		Programmer shine = new Programmer();
		
		shine.nickName = "홍또시";
		System.out.println("Shine의 애칭은 " + shine.nickName);
		
		System.out.println(Programmer.motto);
		System.out.println(shine.spec);
		
		shine.displayData(); //이게 모지?
		
		
	}

}
