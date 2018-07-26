package pack2;

public class MySingleton {
	
	int kor = 100;
	int gap = 45;
	
	private static MySingleton melon = new MySingleton();
	
	public static MySingleton getInstance() {
		return melon;
	}
	
	public void appe (int gap) {
		this.gap = gap;
		System.out.println("차이는 " + gap);
	}

}
