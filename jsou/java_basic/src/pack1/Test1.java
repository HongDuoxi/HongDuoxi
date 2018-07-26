package pack1;

public class Test1 {

	public static void main(String[] args) {
		// 한 줄 주석 : 실행에 참여하지 않음
		
		System.out.println("환영합니다");
		System.out.println("안녕");
		System.out.print("반가워");
		//주석한줄
		/*
		 주석여러줄
		 주석
		 머그면
		 안대요
		 */
		
		System.out.println();
		System.out.println();
		
		//단순변수 : 기억장소의 이름
		//기본형 기억장소: 상수 자체를 기억장소가 기억
		
		byte var1;
		var1 = 27;
		System.out.println(var1);
	
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE+"\n"); //반대 슬라이스 엔터
		
		System.out.println(var1);
		
		System.out.println();
		short var2 = 32767; // 2byte : -32768 ~ 32767
		System.out.println("var2: "+ var2); // 상품가격이 3만원대라면 고려해야할 점
		
		System.out.println();
		int var3 = 2147436487; // 4byte : 2의 31승 ~ 까지 가능
		System.out.println("var3: "+ var3); //기본이 int야
		
		System.out.println();
		//long var4 = 2147483648L;// 8byte
		long var4 = 10L;
		System.out.println("var4: "+ var4);
		
		System.out.println("\n-------\n");
		
		//promotion: 자동 형변환, casting: 강제 형변환 *이거 되게 중요하대
		//byte b1 = 127; //자동 형변환
		//byte b1 = (byte)128; //강제 형변환 형태
		byte b2 = 10;
		byte b3 = (byte)(b2+1);  // 127이 넘을 수 있으니까 아예 안되게 에러가 뜨니까 이럴 때 캐스트를 사용하는 것이다.
		System.out.println(b3);
		
		System.out.println();
		//short s1 = (short)10;
		int i1 = 10;
		System.out.println(i1);
		short s2 = (short)i1; //강제적으로 형변환
		System.out.println(s2);
		//허리 35인치를 20인치 바지에 넣으면 안되지
		//오류를 감안하고서라도 형변환을 하겠다 하는 경우.
		//경우에 따라 캐스팅을 해 주는 것이 상당히 중요하다.
		
		
		System.out.println("\n----실수-----\n");
	    double d1 = 1.2;  //8byte 소수점이 있으면 더블로 본다 소수 15자리까지 믿을 수 있다.
	    d1 = 3; //promotion
	    System.out.println("d1 : " +d1);
		d1 = 56.7;
		
		//float f1 = 3.5F; //4byte 실수형 기억장소 
		float f1 = (float)3.5;
		System.out.println("f1 : " +f1);
		
		int i2 = (int)3.5;
		System.out.println("i2 : " +i2);
		
		System.out.println();
		// double result = 4.5 + 10; 연산시 큰 타입으로 자동 형변환. int인 10을 자동으로 double로 변환해서 10.0으로 출력 됨
		// double result = 4.5 + (double)10; 굳이 이럴 필요 없다. 과해. 과잉친절이야.
		double result = (int) 4.5 + 10;
		System.out.println("result : " +result);
		
		double dd = 5.5;
		int result2 = (int)4.5 + (int)dd;
		System.out.println("result2: " + result2);
		
		System.out.println();
		boolean bu1 = true;
		bu1 = false;
		System.out.println("bu1 : " + bu1);
		
		System.out.println();
		char c1 = 'a';
		//char은 문자 하나라서 happy같은 문자열은 에러. String을 char에 넣을 수 없다
		//c1 = "a"; 큰따옴표도 에러 
		System.out.println("c1 : " + c1 + " " + (int)c1 +" " 
							+ (char) 97 + " " + (int) 'A' + " "+ (int)'0');
		
		System.out.println("\n문자열 : String 객체 - 참조형");
		String ss = "happy Hong da hee"; //문자열이니까 큰따옴표로
		System.out.println("ss : " + ss);
		String msg = "자바는 문자를 기본형처럼 표시 가능"; //원래는 불가능한데 자바에서 편의를 봐준거래.
	    System.out.println("msg : " + msg);
		//byte short int long float double boolean char - 기본형
	    //참조형에서 class가 나오면서 어려워진대.
	    
	}

}
