package pack1;

import java.util.Scanner;

public class Test7if {

	public static void main(String[] args) {
		// 조건판단문 if

/*		 
		  int num = 550;
		  
		  if(num >= 50) { System.out.println("나는");
		  System.out.println("배고파요 - 조건이 참일 때 수행"); }
		  
		  System.out.println("다음 작업 계속 1");
		  
		  num = 10; if (num < 3) { //if 안에는 참 아니면 거짓값으로 도출해야 됨. 관계, 논리 연산자 써야 됨
		  System.out.println("나는"); System.out.println("배가 안고파요 - 조건이 참일 때 수행"); }else
		  { System.out.println("간식먹어야지"); }
		  
		 
		  System.out.println("다음 작업 계속 2");
		  
*/

		int jumsu = 30;

		if (jumsu >= 70) {
			if (jumsu >= 90) {
				System.out.println("우수");
			} else {
				System.out.println("보통");
			}
		} else {
			if (jumsu >= 50) {
				System.out.println("미흡");
			} else {
				System.out.println("매우미흡");
			}
		}

		System.out.println();
		jumsu = 45;
		String re = "";
		if (jumsu >= 90) {
			re = "수";
		} else if (jumsu >= 80) {
			re = "우";
		} else if (jumsu >= 70) {
			re = "미";
		} else if (jumsu >= 60) {
			re = "양";
		} else { // 마지막은 조건 없이 깔끔하게 else로 끝내는 게 좋은 코딩
			re = "가";
		}

		System.out.println("평가결과: " + re);
		
		
		
		
		System.out.println("\n\n\n\n");
		/*	문제) 키보드로부터 상품명, 수량, 단가를 각각 입력받아 금액(수량*단가) 출력
		조건: 금액이 5만원 이상이면 금액의 10%, 아니면 금액의 5%를 세금으로 출력
		출력모양은 상품명:***, 금액:***, 세금:*** 	*/
		
		
		Scanner all = new Scanner(System.in);
		
		System.out.print("상품명: ");
		String product = all.next();
		System.out.print("수량: ");
		int many = all.nextInt();
		System.out.print("단가: ");
		int price = all.nextInt();
		all.close();
		
		int t = many * price; //금액
		int tax;
		
		if(t >= 50000) {
			tax = (int)(t*0.1);
		}else {
			tax = (int)(t*0.05);
		}
		
		System.out.println();
		System.out.print("상품명: "+ product + ", 금액: " + t + "원, 세금: " + tax + "원");
		
		
		
		
		System.out.println("\n\n");
		System.out.println("프로그램 종료");

	}

}
