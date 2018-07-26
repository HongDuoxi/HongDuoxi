package pack5;

public class Animal_Util {
	
	public static void find(Animal animal) { //find의 아규먼트로 Animal animal을 넣었어..
		
		animal.print();
		
		if(animal instanceof Ani_Cow) {//instanceof: 객체타입 비교연산자. 맞으면 true 아니면 false를 출력
			Animal a = animal; //Animal a = (Ani_Cow)animal; 자식의 주소는 부모에게 들어간다.
			System.out.println("이름: " + a.name());
		}else if(animal instanceof Ani_Lion) {
			Animal b = animal;
			System.out.println("이름: " + b.name());
		}else {
			System.out.println("기타동물");
		}
	}

}
