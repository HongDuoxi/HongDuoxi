package pack4;

public class Dog_main {

	public static void main(String[] args) {
		
		System.out.println("\n\n");

		Dog dog = new Dog();
		dog.print();
		System.out.println(dog.callName());
		
		System.out.println("\n-------------\n");
		
		HouseDog hdh = new HouseDog("집순이");
		hdh.print();
		hdh.show();
		System.out.println(hdh.callName());
		
		System.out.println();
		WolfDog wd = new WolfDog("늑대");
		wd.print();
		wd.show();
		System.out.println(wd.callName());
		wd.display();
		
		System.out.println("\n-------------\n");
		
		WolfDog bushdog = wd; // = wd.print(); bushdog안에 wd의 주소의 치환
		bushdog.print(); 
		
		System.out.println();
		Dog dog2 = wd;  //자식이 부모의 객체에 치환하는 건 가능
						//wd은 Dog의 자식이기 때문에 프로모션이 가능
		dog2.print(); 	//부모 객체 변수의 이름으로 자식의 메소드를 부를 수 있음. 반대의 경우는 캐스팅 필요..
						//단!!!!! 오버라이딩 된 메소드만 호출가능
//		dog2.show();	//불간섭의 원칙: 자식 고유의 메소드는 호출 불가
//		dog2.display();
		
//		bushdog = dog(부모); //??????....부모의 주소를 자식에게 줄 수 없다구..?...............
//		bushdog = dog2(부모); 
		bushdog = (WolfDog)dog2; //캐스팅을 통해 가능
//		wd = dog2(부모);	//불가능
		wd = (WolfDog)dog2;	//캐스팅을 통해 가능
		
		Dog coyote = new Dog("코요테");
		coyote.print(); 
		System.out.println(coyote.callName());
		coyote = bushdog;
		coyote.print();

	}

}
