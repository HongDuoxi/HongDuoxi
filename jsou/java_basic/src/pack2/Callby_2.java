package pack2;

public class Callby_2 {
	
	public void ex(int a, int b) { //인자로 기본형 변수(=지역변수)
		int imsi = a; 		//위에서 a=5, b=6로 설정 될 경우
		a= b;				//a=6, b=5로 두 기억장소가 뒤바뀜 
		b = imsi;
		System.out.println("메소드 내의 a값: " + a + ", b값: " + b);
	}
	
	public void ex(Callby_1 data) { //인자로 참조형 변수
		int imsi = data.a;
		data.a = data.b;
		data.b = imsi;
		System.out.println("메소드 내의 a값: " + data.a + ", b값: " + data.b);
	}
	
	public void ex(int ar[]) { //인자로 참조형 변수(배열)
		int imsi = ar[0];
		ar[0] = ar[1];
		ar[1] = imsi;
		System.out.println("메소드 내의 ar[0]값: " + ar[0] + ", ar[1]값: " + ar[1]);
	}

}
