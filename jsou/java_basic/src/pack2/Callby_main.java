package pack2;

public class Callby_main {

	public static void main(String[] args) {
		// 인자전달시 call by value, call by reference
		
		Callby_1 my = new Callby_1();
		Callby_2 your = new Callby_2();
		
		System.out.println("\n\n원래값 a: " + my.a + ", b: " + my.b);
		
		System.out.println();
		your.ex(my.a, my.b); //인수로 기본형 변수(값이 전달) //기억장소 4개 쓴 거야. callby 안에 있는 a, b랑 다른거야
		System.out.println("1. 수행 후 a값: " + my.a + ", b값: " + my.b); //값이 다시 돌아옴
		
		System.out.println();
		your.ex(my); //data에는 callby_1의 객체변수 넣어야 돼. 인수로 참조형을 넣으라는 것(주소 전달)
		System.out.println("2. 수행 후 a값: " + my.a + ", b값: " + my.b); //기억장소 2개 쓴 거야
		
		System.out.println();
		your.ex(my.c); //값이 아니라 주소가 넘어가는 것. 다른 기억장치를 만든 게 아니라 있는 거 가져오는거야 - 배열
		System.out.println("3. 수행 후 c[0]: " + my.c[0] + ", c[1]: " + my.c[1]); //배열의 주소를 넘기는 것
		System.out.println(my.c[0] + " " + my.c[1]);
	}

}
