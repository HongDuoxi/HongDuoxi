package pack6;

public class Volunm_main {

	public static void main(String[] args) {
		//Volunm volunm = new Volunm();
		Volunm volunm = null;
		
		Volunm_Radio radio = new Volunm_Radio();
		radio.volunmUp(10);
		radio.volunmDown(5);
		
		Volunm_Tv tv = new Volunm_Tv();
		tv.volunmUp(7);
		tv.volunmDown(3);
		tv.kbs();
		
		System.out.println();
		volunm = radio;
		volunm.volunmUp(10);
		volunm.volunmDown(5);
		
		System.out.println();
		volunm = tv;
		volunm.volunmUp(10);
		volunm.volunmDown(8);
	}

}
