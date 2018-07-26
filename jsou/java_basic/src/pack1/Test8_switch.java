package pack1;

import java.util.Scanner;

public class Test8_switch {
	
	public static void main(String[] args) {
		//조건판단문
		
		/*
		int age = 21;
		
		System.out.println(age);
		age = age/10;
		System.out.println(age);
		age = age*10;
		System.out.println(age);  // 10대, 20대 등 연령대를 구할 수 있음
		
		
		if(age == 20) {
			System.out.println("튼튼");
		}else if(age == 30) {
			System.out.println("덜튼튼");
		}
		

		System.out.println ("\n\n");
		switch(age) {
		case 20:
			System.out.println("20대");
			System.out.println("튼튼해");
			break;
		case 30:
			System.out.println("30대");
			System.out.println("덜 튼튼해");
			break;
		case 40:
			System.out.println("40대");
			System.out.println("쓸쓸해");
			break; //있어도 그만 없어도 그만이지만, 넣는게 좋음
		default: //이도저도 아니면
			System.out.println("기타");
			break;
		}
		
		
		System.out.println ("\n\n");
		//double time = Math.random(); //난수 발생
		//int time = (int)(Math.random() * 1000);
		int time = (int)(Math.random() * 4) + 8;
		System.out.println(time + "시");
		
		switch (time) {
		case 8:
			System.out.println("출근하자");
			break;
		case 9:
			System.out.println("회의하자");
			break;
		case 10:
			System.out.println("프로그램 짜자");
			break;
		default:
			System.out.println("명상시간");
			break;
		}
		*/
		System.out.println ("\n\n");
		
		
		
/*
		//문제) 두 개의 실수와 연산자(a,s,m,d)를 각각 입력받아 사칙연산 수행
		
		
		Scanner num = new Scanner(System.in);
		
		System.out.print("1. 실수: ");
		double one = num.nextDouble();
		System.out.print("2. 실수: ");
		double two = num.nextDouble();
		System.out.print("3. 연산자를 영문으로 입력하시오.(a, s, m, d): "); 
		String four = num.next();
	
		
		System.out.println ("\n");
		
		switch (four) {
		case "a":
			System.out.println("두 실수를 더한 값은 " + (one + two));
			break;
		case "s":
			System.out.println("두 실수를 뺀 값은 " + (one - two));
			break;
		case "m":
			System.out.println("두 실수를 곱한 값은 " + (one * two));
			break;
		case "d":
			System.out.println("두 실수를 나눈 값은 " + (one / two));
			break;
		}
		
		System.out.println ("\n");
		
		
		*/
		
		Scanner oth = new Scanner(System.in);
		
		System.out.print("1. 실수: ");
		double a = oth.nextDouble();
		System.out.print("2. 실수: ");
		double b = oth.nextDouble();
		System.out.print("3. 연산자를 입력하시오(q,w,e,r): ");
		String c = oth.next();
		oth.close();
		
		
		System.out.println("\n");
		
		if (c.equals("q")) {
			System.out.println("두 실수를 더한 값은 " + (a + b));
		} else if (c.equals("w")) {
			System.out.println("두 실수를 뺀 값은 " + (a - b));
		} else if (c.equals("e")) {
			System.out.println("두 실수를 곱한 값은 " + (a * b));
		} else if (c.equals("r")) {
			System.out.println("두 실수를 나눈 값은 " + (a / b));
		}
		
		
		
		
		
		
	}

}
