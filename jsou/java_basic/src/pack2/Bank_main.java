package pack2;

public class Bank_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank tom = new Bank();
		tom.dePosit(5000);
		tom.withDraw(6000);
		System.out.println("tom의 잔액: " + tom.getMoney());
		
		System.out.println();
		Bank oscar = new Bank(2000);
		System.out.println("oscar의 예금액: " + oscar.getMoney());
		oscar.dePosit(1000);
		oscar.withDraw(2500);
		System.out.println("oscar의 예금액: " + oscar.getMoney());
		
		System.out.println("\n\n객체의 주소---------------");
		System.out.println("tom의 주소: " + tom);
		System.out.println("tom의 주소: " + tom.hashCode()); //주소를 16진수로 보여줌
		System.out.println("oscar의 주소: " + oscar);
		System.out.println("oscar의 주소: " + oscar.hashCode());
		
		System.out.println();
		Bank james = null; //NullPointerException
		//System.out.println("james의 예금액: " + james.getMoney());
		System.out.println("james의 주소: " + james);
		james = oscar; //주소의 치환 int a = 5; int b = a; 상수값 치환
		// Animal tiger = oscar 는 타입이 다르기 때문에 주소를 넘길 수 없다.
		
		System.out.println("james의 주소: " + james);
		System.out.println("james의 예금액: " + james.getMoney());
		
		System.out.println();
		if(james == oscar) { // 주소의 비교 if(a == b) 값의 비교
			System.out.println("둘은 같은 객체의 주소를 가지고 있다");
		} else {
			System.out.println("둘은 다른 주소를 가지고 있다");
		}
		
		if(james == tom) { // 주소의 비교 if(a == b) 값의 비교
			System.out.println("둘은 같은 객체의 주소를 가지고 있다");
		} else {
			System.out.println("둘은 다른 주소를 가지고 있다");
		}
		
		
		if(james instanceof Bank) //instanceof: 클래스 타입 비교 연산자
			System.out.println("Bank type");
		else
			System.out.println("Bank type Err");
		
		System.out.println("\n\nString 클래스-------------");		
		String aa = "kor";
		String bb = new String();
		bb = "kor";
		String cc = new String("kor");
		
		System.out.println("\n" + aa +" "+ bb +" "+ cc);
		
		System.out.println();
		
		if(aa == bb) //기본형은 ==으로 비교가 가능하지만 String은 이렇게 비교하면 안 됨.
			System.out.println("a같아b");
		else
			System.out.println("a달라b");
		
		if(aa == cc)
			System.out.println("a같아c");
		else
			System.out.println("a달라c");
		
		if(aa.equals(bb)) //String 비교를 위해 나온 명령어(한글, 영문,...)
			System.out.println("a같아b");
		else
			System.out.println("a달라b");
		
		if(aa.equals(cc))
			System.out.println("a같아c");
		else
			System.out.println("a달라c");
		
		
		System.out.println("\n\n배열---------------\n");
		
		int ar1[] = {1, 2, 3};
		System.out.println(ar1);
		System.out.println(ar1[0] + " " + ar1[1] + " " + ar1[2]);
		
		System.out.println();
		int ar2[][] = {{1, 2, 3},{4,5,6}};
		System.out.println(ar2);
		System.out.println(ar2[0]);		//주소
		System.out.println(ar2[0][0]);  //값
		
		//----------------------------------------------
		//String 비교는 equals(bb)로!!!
		
		System.out.println("\n\n-----------------");
		Bank hong = new Bank();
		System.out.println(hong.imsi);
		System.out.println(hong.imsi2);
		
		
	}

}
