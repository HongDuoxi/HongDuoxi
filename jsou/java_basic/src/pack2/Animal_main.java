package pack2;

public class Animal_main {

	public static void main(String[] args) {
		
		System.out.println("\n\n뭔가를 하다가...\n\n");
		
		Animal tiger = new Animal();
		tiger.display();
		tiger.display(4);
		tiger.display(4,"곰돌이푸의 친구 티거");
		tiger.display("귀여운 티거", 7);
		tiger.display(6, 8);
		tiger.display();
		
		System.out.println();
		Animal duck = new Animal(2);
		duck.display("러버덕", 3);
		duck.display(1,3);
		duck.display(); //이렇게도 leg값 바뀌는데
						//왜 값변경 할 수 있는게 게터세터랑 생성자밖에 없다고 하시는거지?
		
		System.out.println();
		Animal wolf = new Animal("야수", 2);
		wolf.display();
		
		System.out.println();
		Animal dog = new Animal("왈이", 3);
		dog.display();
		dog.normalMethod();
		
		//출력 전 뭐가 출력될지 생각해보기
		
		System.out.println();
		System.out.println("\n\n-----------static------------\n");
		//dog.myStaticMethod(); 오류는 아닌데 이렇게 부르지 마~
		Animal.myStaticMethod(); //static이니까 클래스 이름으로 바로 불러줘~ new 필요없서!
		
		
	}
}
