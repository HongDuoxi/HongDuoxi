package pack5;

public class Jepum_main {

	public static void main(String[] args) {

		//Jepum jepum = new Jepum(); //추상클래스는 new할 수 없다!
		//자식이 new하면서 부모의 생성자가 불려올 순 있지만 부모를 new할 수는 없어.
		Jepum jepum = null; //이게 뭐지? new랑 뭐가 다르... 제품 클래스를 불러오는 거?
		
		Jepum_TV tv = new Jepum_TV();
		tv.volunmShow();
		tv.volunmControl();
		
		System.out.println();
		Jepum_Radio radio = new Jepum_Radio();
		Jepum_Phone phone = new Jepum_Phone();
		
		jepum = tv;
		jepum.volunmControl();
		jepum = radio;
		jepum.volunmControl();
		jepum = phone;
		jepum.volunmControl();
		
		System.out.println("\n-------------------\n");
		Jepum[] jeArray = new Jepum[3]; //생성자를 new한 게 아니라 배열 생성한거야.
		
		jeArray[0] = tv;
		jeArray[1] = radio;
		jeArray[2] = phone;
		
		for(int k = 0; k < jeArray.length; k++) {
			jeArray[k].volunmControl();
		}
		
		for(Jepum k : jeArray) {
			k.volunmControl();
		}

	}

}
