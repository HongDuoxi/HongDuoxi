package pack3;

public final class Me extends Father {
	
	private int nai = 24;
	public final String NAME = "홍다희"; //파이널일 땐 변수명 대문자로. 값 수정 불가. 참조만 가능.
	public String data = "Me data";
	
	public Me() {
		
		System.out.println("내 생성자");
	}
	
	public final void life() { //class에 final을 이미 걸었으니까 불필요
		System.out.println("행복하게 살기");
	}
	
	@Override
	public int getNai() { //get은 꼭 위에다가 변수를 선언해야 하는건가?
		return nai;
	}
	
	public void displayData() {
		System.out.println(data);
		String data = "displayData method's data";
		System.out.println(data);
		System.out.println(this.data);
		System.out.println(super.data); // Father를 부르는 것. 할아버지 data는 찾아갈 수 없다.
		
		
	}

}
