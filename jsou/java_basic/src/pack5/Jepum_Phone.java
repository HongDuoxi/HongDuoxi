package pack5;

public class Jepum_Phone extends Jepum{

	
	@Override //오버라이드 강요. 다형성을 위해서..
	public void volunmControl() {
		System.out.println("Phone 소리조절");
	}
	
	@Override  //오버라이드 선택적
	public void volunmShow() {
		setVolunm(10);
		System.out.println("소리크기: " + getVolunm());
	}
}
