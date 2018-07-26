package pack3;

public class GrandFa {
	
	private int nai = 80; //현재 클래스에서만
	public String gabo = "고려청자"; //현재 프로젝트의 패키지 상관없이, 프로젝트 달라지만 안됨 
									//생략은 현재 패키지내 어디서든 유효, 다른 패키지에서는 참조 안됨. friendly
	protected String gahun = "자바를 자바라"; //현재 패키지에서는 마음껏 사용가능. 
								//다른 패키지에서는 그랜파를 부모로 가지고 있는 자식 클래스에서는 참조 가능. 
								//그랜파를 부모로 가지고 있지 않은 클래스에서는 참조 불가능.
	public String data = "GrandFa data";
	
	//------------------------------------
	
	
	
	public GrandFa() { //1
		System.out.println("할아버지 생성자");
	}
	
	public GrandFa(String aa) { //2
		//...
	}
	
	public GrandFa(String aa, int dd) { //3
		//...
	}
	
	public GrandFa(int nai) {
		this(); //생성자는 생성자를 부를 수 있지만 가장 위! 제일 먼저 적어야 돼~
				//1번 생성자를 찾아가
//		this("사탕"); //2번 생성자를 찾아가
//		this("사탕", 2); //3번 생성자를 찾아가
		this.nai = nai; // this.멤버변수 = 지역변수 //this에 점을 찍으면 멤버호출
	}
	
	
	//----------------------------------------
	
	
	public String say() { 
		return "할아버지 말씀: 그날 그날 정리해라";
	}

	public final void EAT() {//메소드에 파이널이 있으면 오버라이드 불가
		System.out.println("밥은 맛있게 먹자");
	}
	
	public int getNai() {
		return nai;
	}

}


