package pack2;

public class Production {
	
	public String name;
	private int price;
	private int size; 
	
	
	//-------------------------------
	
	
	public Production() {
	
	}
	
	public Production(String irum) {
		System.out.println("[생성자 오버로딩]");
		name = irum;
	}
	
	public Production(int price) {
		this.price = price;
	}
	
	
	//--------------------------------
	
	
	public void display() {
		System.out.println("상품명: " + name + ", 가격: " + price  + ", 갯수: " + size);
	}
	
	public void display(int price, int size) {
		this.price = price;
		this.size = size;
		System.out.println("상품명: " + name + ", 가격: " + price  + ", 갯수: " + size);
	}
	
	public void display(String name, int size) {
		this.name = name;
		this.size = size;
		System.out.println("상품명: " + name + ", 가격: " + price  + ", 갯수: " + size);
	}
	
	public void display(String name) {
		this.name = name;
		System.out.println("[메소드 오버로딩]");
		System.out.println("상품명: " + name + ", 가격: " + price  + ", 갯수: " + size);
	}
	
	
	//-----------------------------------
	
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int password, int size) {
		if(password == 55491842) {
			this.size = size;
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		
	}
	
	
	//메소드 오버로딩

}
