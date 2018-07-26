package pack4;

public class PolyProduct_main {

	public static void main(String[] args) {
		
		PolyProduct product = null;
		
		System.out.println();
		PolyRadio radio = new PolyRadio();
		radio.setVolumn(10);
		System.out.println(radio.getVolumn());
		radio.volumnControl();
		
		
		System.out.println();
		PolyTv tv = new PolyTv();
		tv.setVolumn(7);
		System.out.println(tv.getVolumn());
		tv.volumnControl();
		tv.TvShow();
		
		
		System.out.println("\n\n--------다형성--------\n"); //다형성(폴리모피즘): 면접단골질문
		
		product = radio;
		product.volumnControl();
		product = tv;
		product.volumnControl();
//		product.tvShow(); //부모는 자식의 고유 메소드에 간섭할 수 없다.
		
		System.out.println();
		PolyProduct poly[] = new PolyProduct[2]; //2칸을 만들거야 0,1의 두 칸.
		poly[0] = radio;
		poly[1] = tv;
		
		//향상된 for구문
		for(PolyProduct elec: poly) {
			elec.volumnControl();
		}
		
	}

}
