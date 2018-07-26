package pack7;

//public class InterRadio implements InterVol, InterAdvanceVol{ //인터페이스는 다중상속 가능. 오버라이딩 다 해줘야 함.
public class InterRadio implements InterAdvanceVol{ 						
	
	private int v = 0;
	
	@Override
	public void volUp(int v) {
		this.v += v;
	}
	
	@Override
	public void volDown(int v) {
		this.v -= v;
	}
	
	@Override
	public void volOff() {
		
	}
	
	@Override
	public void volResume() {
		
	}
	
	public void show() {
		System.out.println("현재 볼륨은 " + v);
	}

}
