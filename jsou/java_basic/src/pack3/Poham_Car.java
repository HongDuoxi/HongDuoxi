package pack3;

public class Poham_Car { //완성차 제작 Class: 여러 부품(class) 조립

	int speed = 0;
	String ownerName, turnShow;
	//...등등 많은 변수들
	
	Poham_Handle handle; //클래스를 멤버필드로 사용
	
	public Poham_Car() {
		// 있어도 되고 있어야 하고 없어도 되는 생성자
	}
	
	public Poham_Car(String name) {
		ownerName = name;
		handle = new Poham_Handle(); //클래스의 포함관계
		turnShow = "직진"; 
	}
	
	public void playHandle(int q) { //누군가가 자동차 운전을 하며 핸들을 움직인다
		if (q > 0) {
			turnShow = handle.rigntturn(q); //rigntturn은 handle꺼니까 handle.rigntturn해줘야 돼.
		} else if (q < 0) {
			turnShow = handle.leftturn(q);
		} else {
			turnShow = handle.strignt(q);
		}
	}
	
}
