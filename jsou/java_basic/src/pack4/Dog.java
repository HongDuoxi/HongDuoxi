package pack4;

public class Dog {
	
	private String name = "개";
	//private String type = "개";
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String callName() {
		return "종류: " + name;
	}
	
	public void print() {
		System.out.println(name + "는(은) 지구에 산다.");
	}

}
