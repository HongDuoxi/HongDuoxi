 package pack3;

public class Poham_Handle {
	
	int quantity; //회전량
	
	/*public */ Poham_Handle() {
		quantity = 0;
	}
	
	String leftturn(int q) {
		quantity = q;
		return "좌회전";
	}
	
	String rigntturn(int q) {
		quantity = q;
		return "우회전";
	}
	
	String strignt(int q) {
		quantity = q;
		return "직진";
	}
	

}
