package pack3;

public class Zzz /*extends Object*/{
				 //Object: 최상위 수퍼 클래스, 모든 클래스에는 extends Object가 생략되어 있다. 
	public int aa = 10;
	
	@Override
	public String toString() {
		return "헤헿ㅎㅎㅎ"; //오버라이딩 부모 메소드 기능을 버리고 내 기능을 새로 넣겠다!
	}
	
	public static void main(String[] args) {
		
		Zzz zoo = new Zzz();
		System.out.println(zoo);
		System.out.println(zoo.toString());
	}
	
	//상속이든 포함이든 비슷하게 쓰인다면 포함을 쓰는 것을 추천.
	//포함을 쓰면 딱 그 클래스만 넘어오고, 상속을 쓰면 쮸르륵 다 넘어옴

}
