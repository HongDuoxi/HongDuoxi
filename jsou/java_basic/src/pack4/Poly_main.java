package pack4;

public class Poly_main {

	public static void main(String[] args) {
		
		//클래스 선언 - 부모, 자식 똑같이 선언 //??부모 클래스는 맨 위에 선언해줘야 하나?
		
		PolyCar car1 = new PolyCar();
		PolyBus bus1 = new PolyBus(); //생성자를 데려옴. 부모 생성자 먼저, 자식 생성자 다음
		PolyTaxi taxi1 = new PolyTaxi();
		
		car1.displayData();
		System.out.println(car1.getSpeed());
		
		System.out.println();
		bus1.displayData();
		bus1.show();
		System.out.println(bus1.getSpeed());
		
		System.out.println();
		taxi1.displayData();
		taxi1.show();
		System.out.println(taxi1.getSpeed());
		
		
		
		System.out.println("\n----------about. 다형성------------\n\n");
		
		PolyCar car2 = new PolyBus(); 	//Promotion: 자식의 주소를 부모에게 주는 것. 
										//(1)** 폴리카의 객체인 car2가 폴리 버스의 주소를 가지고 있다.
		car2.displayData(); //부모의 객체로 자식의 메소드를 불러올 수 있는데 
							//단, 오버라이딩된 메소드에 한해 가능하다.
		System.out.println(car2.getSpeed());
//		car2.show(); //err: 자식 고유 메소드이므로
		
		System.out.println();
		PolyCar car3 = taxi1; //자식의 주소를 부모 객체에게 줄 수 있다.
		car3.displayData();
		System.out.println(car3.getSpeed());
		

		
		System.out.println("\n\n---------------(1)-----------------\n");
		
//		PolyBus bus2 = new PolyCar();
//		PolyBus bus2 = car1;
		PolyBus bus2 = (PolyBus)car2;	//(1)**
		bus2.displayData();
		bus2.show();
		System.out.println(bus2.getSpeed());
		
		System.out.println();
//		PolyTaxi taxi2 = new PolyCar();
//		PolyTaxi taxi2 = new PolyBus();
		PolyTaxi taxi2 = (PolyTaxi)car3;
		taxi2.displayData();
		
//		PolyTaxi taxi3 = (PolyTaxi)car1; //ClassCastException, run time err: 실행하면 오류가 뜨는 것
		
		
		
		System.out.println("\n\n----------------(2)----------------\n");
		
//		잔머리..
		car1 = bus1;
		car1.displayData();
			
		car1 = taxi1;
		car1.displayData();
		

		System.out.println();
		car1 = new PolyCar();
		
		
		System.out.println();
		PolyCar p[] = new PolyCar[3]; //배열 객체 생성
		p[0] = car1;
		p[1] = bus1;
		p[2] = taxi1;
		for(int a = 0; a < p.length; a++) { // p의 0,1,2번째 가 순서대로 출력. 기본형, 참조형 다 가능.
			p[a].displayData();
		}
		
		
		
		System.out.println("\n\n-------------향상된 for--------------\n");
		
		for(PolyCar my: p){ //for(타입: 집합형 자료){ p의 0번째(car1)부터 변수에 차례대로 대입되는 것. 참조형만 가능
			my.displayData();
		}
		
	}

}
