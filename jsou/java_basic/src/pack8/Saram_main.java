package pack8;

public class Saram_main {

	public static void main(String[] args) {
		
		Saram saram = new Saram();
		System.out.println(saram.getIrum());
		//------------------------------------
		SaramJames james = new SaramJames();
		Saram saram2 = james.getSaram();
		System.out.println(saram2.getIrum());

	}

}
