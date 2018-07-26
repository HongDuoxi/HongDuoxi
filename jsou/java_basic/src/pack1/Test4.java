package pack1;

public class Test4 {

	public static void main(String[] args) {
		// 논리 연산자 수행 시 주의사항
		
		boolean a = true, b = false, c;
		
		c = a || b;
		System.out.println(c);
		c = a && b;
		System.out.println(c);
		
		System.out.println("------------------");
		boolean b1, b2;
		//System.out.println(aa());
		b1 = aa();
		System.out.println(b1);
		System.out.println(bb());
		
		System.out.println("\n\n주의할 점---------");
		//b2 = aa() || bb(); //하나만 만족되도 true. 앞에서 참이면 뒤는 안 봄.  
		//그래서 bb를 수행하지 않아. 이런 걸 로직에러라고 하는거야.
		//에러는 안 나는데 결과가 이상하게 나오니까 주의해야 해.
		b2 = bb() || aa(); //여기선 두개 다 수행.
		System.out.println(b2);
		
	    System.out.println();
	    //b2 = aa() && bb();
	    b2 = bb() && aa();
	    System.out.println(b2);
	    
	    System.out.println("\n\n주의할 점 해결-----"); // 모두 수행을 원할 시
	    b2 = aa() | bb(); //바를 하나만 주기
	    System.out.println();
	    b2 = bb() | aa();
	    System.out.println(b2);
	    
	    System.out.println();
	    System.out.println("\n^^;");
	    b2 = aa() & bb();
	    System.out.println();
	    b2 = bb() & aa();
	    System.out.println(b2);
	    
	    
	    System.out.println();
		System.out.println("종료");

	}
	
	
	public static boolean aa() { //인자는 없고, 반환값은 boolean
		System.out.println("aa 처리");
		return true;
	}
	
	public static boolean bb() { //인자는 없고, 반환값은 boolean
		System.out.println("bb 수행");
		return false;
	}

}
