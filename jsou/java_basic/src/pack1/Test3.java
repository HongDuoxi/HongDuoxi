package pack1;

public class Test3 {

	public static void main(String[] args) {
		// 관계, 논리, 기타 연산자

		int a = 2; // 4byte 언제나 새로운 값이 들어올 수 있는 기억장소
					// 이름은 소문자로(클래스만 대문자로), 영문자로, 언더바 정도는 괜춘 ex.abc

		System.out.println(a > 3); // 관계연산자 true, false값이 출력
		System.out.println(a <= 3);
		System.out.println(a == 3);
		System.out.println(a != 3);

		System.out.println();
		int b = 10;
		System.out.println(b > 3); // b>3 해도 되지만, 가독성을 위해 띄어쓰도록 노력하자.
		System.out.println(b <= 10);
		System.out.println(b > 3 && b <= 10); // && and연산: 둘 다 참일 때만 참. 첫번째가 거짓이면 뒤도 안보고 false
		System.out.println(b <= 50 && b == 10); // 논리곱

		System.out.println(b > 6 || b < 10); // || or연산: 하나라도 참이면 무조건 true. 앞에서 참이면 뒤도 안보고 true
		System.out.println(b <= 6 || b == 3 + 7); // 우선순위 ()>산술>관계>논리>=치환
		
		//Shift 연산자
		System.out.println(); 
		int ii = 8, ij = 0;
		System.out.println(ii + " " + ij);
		System.out.println("ii: " + ii + " " + Integer.toBinaryString(ii)); //8의 이진수 값
		
		ij = ii << 3; //이진법에서 왼쪽으로 1비트 밀라는 명령. 남은 자리는 0으로 채워라.
		System.out.println("ij: " + ij + " " + Integer.toBinaryString(ij));
		
		ij = ii >> 2; 
		System.out.println("ij: " + ij + " " + Integer.toBinaryString(ij));
		ij = ii >>> 2; 
		System.out.println("ij: " + ij + " " + Integer.toBinaryString(ij));
		
		//삼항연산자
		System.out.println();
		int result = (ii >= 5)?150:22 + 20; //(조건)?참값:거짓값
		System.out.println("result: " + result);
		
		System.out.println("--------");
		abc(); ///abc() 호출
		System.out.println("이런저런 일을 하다가");
		abc();
		System.out.println("뭔가를 하다가");
		def((int)3.4); //???????????????왜 97이 아니라 2가 나오지?
		System.out.println("프로그램 종료");
		
	}
		
	public static void abc() {
	    System.out.println("unit 수행");
	}
		
	public static void def(int arg) { //(인자, parameter, argument), 기억장소에 값을 담는 또 다른 방법을 배운고야.
	    System.out.println("def unit 수행");
	    System.out.println("arg: " + arg);
	}

		
}
