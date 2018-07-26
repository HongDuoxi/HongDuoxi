package pack5;

public class Animal_main {

	public static void main(String[] args) {
		
		Animal animal = null;
		
		System.out.println();
		Ani_Cow cow = new Ani_Cow();
		System.out.println(cow.name() + "은 " + cow.eat() + "이에요.");
		
		Ani_Lion lion = new Ani_Lion();
		System.out.println(lion.name() + "은 " + lion.eat() + "이에요.");
		lion.eatOther(); //lion 고유의 메소드니까 cow는 못 써
		
		System.out.println("---------------------------------------");
		animal = cow;
		System.out.println(animal.name());
		animal = lion;
		System.out.println(animal.name());
		
		System.out.println("---------------------------------------");
		Animal_Util.find(cow);
		System.out.println();
		Animal_Util.find(lion);
		
		System.out.println("---------------------------------------");
		//Ani_Dog dog = new Ani_DOg(); //추상 클래스는 생성불가
		Ani_Dog dog = new Ani_DogWolf();
		System.out.println(dog.name());
		System.out.println(dog.eat());
		System.out.println(dog.action());
	}

}
