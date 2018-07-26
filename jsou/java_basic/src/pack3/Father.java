package pack3;

public class Father extends GrandFa{ //상속관계
	//컴퓨터가 코드를 읽을 때, 위에서 + extends GrandFa가 있으면 GrandFa의 생성자를 찾아가.
	//GrandFa fa = new GrandFa(); //포함관계
	
	private int nai = 55;
	public String gabo = "다이소 꽃병"; //은닉화: 부모와 똑같은 변수를 자식이 다시 선언하면 그걸로 덮어씀
										// 캡슐화: private 변수를 게터세터로 쓸 수 있게 만드는 것.
	private int house = 1;
	public String data = "Father data";
	
	public Father() {
		
		//super(); //기본적으로 생략되어 있다. 없으면 super();라고 알고 있으면 돼.
		super(88);
		System.out.println("아버지 생성자");
	}
	
	public Father(int n) {
		
		super(n);
		//this(); //생성자를 호출하고 싶으면 가장 위에 올라와야 되므로 에러
		System.out.println("아버지 생성자");
	}
	
/*	@Override
	public String say() { //메소드 오버라이딩(method override(ing)): 부모와 똑같은 메소드를 자식이 다시 선언
						  //왼쪽에 세모는 지금 부모의 메소드와 똑같다고 표시해주는 거야
		return "아버지 말씀: 그날 그날 정리해라";
	}*/
	
	@Override //가독성을 높히고 아래 메소드에 오버라이딩을 강요하는 표시
	public String say() { // method override(ing)
		return "아버지 말씀: 주말에는 총정리 해라";
	}
	
	public int getHouse(int house) {
		//this.house = house;
		return house;
	}
	
	
/*	
	public final void EAT() {//메소드에 파이널이 있으면 오버라이드 불가
		System.out.println("밥은 맛있게 먹자");
	}
*/
	
	
}







