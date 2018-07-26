package pack1;

public class Test2 {
	
	public static void main(String[] args) {
		
		System.out.println("\n<산술연산자>\n");
		int a = 5;  //치환연산자
	    int b = 3;
	    int c = a + b;
	    System.out.println("c: " + c);
	    
	    System.out.println();
	    System.out.println(a+b);
	    System.out.println(a-b);
	    System.out.println(a*b);
	    System.out.println(a/b); //몫
	    System.out.println(a%b); //나머지
	    System.out.println(a/(double)b); //몫과 나머지
	    							  	//더블이 왜 b 앞에 들어가지?
	    
	    System.out.println();
	    //System.out.println(a/0); 값 오류
	    System.out.println(a/0.0);
	    System.out.println(a%0.0);
	    
	    System.out.println();
	    System.out.println(3+4*5); //곱하기, 나누기 > 더하기, 빼기. 왼쪽부터 계산
	    System.out.println((3+4)*5); //연산자 우선순위. ()안에 있는 것 연산 최우선 순위
	    
	    String ss1 = "다희";
	    String ss2 = "바보";
	    String ss3 = ss1 + ss2; //문자열 더하기 가능
	    System.out.println("ss3 : " + ss3);
	    System.out.println(ss3 + "래 " + 2018); //숫자가 문자로 형변환 자동으로 됨. 숫자의 문자열화(문자와 문자열은 다르다)
	    System.out.println(ss3 + "아니래 " + 2018 + 6);
	    System.out.println(ss3 + "던데? " + (2018 + 6));
	    
	    System.out.println();
	    String ss4 = "5" + 6; //숫자를 문자로 인식. 연산 안할거야.
	    System.out.println(ss4);
	    
	    //int ia = 5+6; //숫자로 연산하겠다는 의사표시.
	    //System.out.println("ia : " +ia);
	    
	    int ia = Integer.parseInt("5") +6; //입력값 5를 숫자화 하기
	    System.out.println("ia : " +ia);
	    
	    String ss5 = Integer.toString(5)+6; //입력값 5를 문자화 하기
	    System.out.println("ss5 : " +ss5);
	    
	    //누적
	    System.out.println();
	    int no = 500;
	    //System.out.println("no는 "+ Integer.toString(no));
	    no = no + 1; 
	    no += 1; //컴퓨터가 좋아하는 식
	    
	    no++;   //후위증가연산자
	    ++no;   //전위증가연산자
	    
	    System.out.println("no는 "+no);
	    
	    
	    //증감 연산자에 대해 
	    System.out.println();
	    int imsi = 5;
	    int result = ++imsi +1;
	    System.out.println(imsi);
	    System.out.println(result);
	    
	    System.out.println();
	    
	    int imsi2 = 5;
	    int result2 = imsi2++ +1;
	    
	    System.out.println(imsi2);
	    System.out.println(result2);
	    
	    System.out.println();
	    System.out.println(imsi2++);
	    System.out.println(imsi2);
	    System.out.println(imsi2++);
	    System.out.println(imsi2);
	    
	    System.out.println();
	    System.out.println(result2);
	    
	    //이렇게 쓰면 헷갈리니까 다른 연산자랑 함께 사용하지 않음
	    //참고로 이해하고 넘어간 부분..
	    
	    
	    //부호에 관해
	    System.out.println();
	    int imsi3 = 3;
	    System.out.println(imsi3);
	    System.out.println(imsi3*-1);
	    System.out.println(-imsi3);
	    
	    
	    System.out.println("\n수업 종료...");
	    
	}
		
	}
