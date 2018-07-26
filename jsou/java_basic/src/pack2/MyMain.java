package pack2;

public class MyMain {

	public static void main(String[] args) {
		// 응용프로그램의 시작 지점
		
		int imsi = 10;
		System.out.println("imsi: " + imsi);
		System.out.println(Math.PI);
		System.out.println(Math.random());
		
		//내가 만든 클래스로 인스턴스(instance, Object, 객체, 개체) 생성
		
		Car boung = new Car(); // boung은 참조형 변수다.
		//boung. //private은 여기서 안보인다. 
		System.out.println(boung.wheel);
		boung.abc(); // 홍길동(boung)네 집의 abc불러줘~~~
		
		//boung = null;
		//System.out.println(boung.wheel); //NullPointerException
		
		//boung.def(); //private 메소드이므로 접근불가. 클래스 내에서만 가능
		//boung.speed(); //private 메소드이므로 접근불가. 클래스 내에서만 가능
		
		System.out.println();
		System.out.println(boung.korea(imsi));  //이거 왜 20이 나오지??..
		System.out.println();
		
		System.out.println("속도는 " + boung.getSpeed());
		////boung.setSpeed(80);
		boung.setSpeed(1111, 12); //비밀번호 불일치
		boung.setSpeed(1234, 120); //비밀번호 일치
		System.out.println("속도는 " + boung.getSpeed());

			
		//외부에서 프라이빗에게 값을 줄 수 있는 방법, 겟터셋터
		
	}

}
