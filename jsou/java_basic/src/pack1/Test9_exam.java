package pack1;

//import java.util.Scanner;

public class Test9_exam {

	public static void main(String[] args) {
		
		
		System.out.println("\n\n");
		
		
/*
		// 문제 1) 키보드로 부터 숫자를 (2~9) 입력받아 구구단 출력
		
		
		Scanner mul = new Scanner(System.in);
		
			
		System.out.print("원하는 구구단(2~9단)을 입력하시오: ");
		int a = mul.nextInt();
		mul.close();
		
		System.out.println();
		
		if(a < 2 || a > 9) {
			System.out.println("입력오류: 2~9의 사이값을 입력하시오");
			System.exit(0);
		}
		
		for(int num = 1; num <= 10; num++) {
			System.out.println(a + " * " + num + " = " + (a*num));
		}
		
	
		System.out.println("\n");
		
		
		// 문제 2) 1 ~ 100 사이의 정수 중 3의 배수이면서 5의 배수인 
		//		   숫자의 갯수??????와 그 수들의 합을 출력  중요해~~!!!!!!!!!! 곱, 나누기, 예제 해보기
		

		int hap = 0;
		int count= 0;
		
		
		for(int you = 1; you <= 100; you++) {

			if (you % 3 == 0 && you % 5 == 0) {
				
				System.out.print(you+ ", ");
				hap += you;
				count += 1;
			}
		}
		
		System.out.println("\n");
		System.out.println("수의 갯수는 " + count + "개이다.");
		System.out.println("수의 합은 " + hap + "이다.");

		
		System.out.println("\n\n");
	
		
		// 문제 3) 2~9 단을 모두 출력

	
		for (int a1 = 2 ; a1 <=9; a1++) {
			
			for(int num = 1; num <= 10; num++) {
				System.out.println(a1 + " * " + num + " = " + (a1*num));
			}
			
			System.out.println();
			
		}
		
	
		
		// 문제 4) *********
		//			*******
		//		     *****
		//		      ***
		//		       *
		
			
	
		char star = 42;
		int u = 9;
		
		
		for(int i = 1; i <= 5; i++) {
			
			
			for(int j = 1; j <= u; j++) {
				
				System.out.print(star);
				
				}
			
			u -= 2;
			System.out.println();
			
			for(int w; w <= 4; w++) {
				
				System.out.print(" ");
				
			}
			
		}
		
		System.out.println("\n\n\n\n");
		
*/
		
		
		//4번 정답
		
		//패턴을 찾는 게 중요해.
		
		
		for (int i = 5; i >= 1; i--) {
			
			for(int p = 0; p < 5 - i; p++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= (i*2) - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		for (int i = 5; i >= 1; i--) {
			
			for(int p = 0; p < 5 - i; p++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= (i*2) - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		
		
/*		// 문제 5) 문제 4번을 뒤집어서 출력
		
		
		for(int d = 1; d <= 5; d++) {
			for(int h = d; h >= 1; h--) {
				
				System.out.print(star);
		 		}
			
			System.out.println();
			}
		

		
*/
		
		System.out.println();
		
		
		//5번 정답
		
		for (int i = 1; i <= 5; i++) {
			
			for(int p = 0; p < 5- i; p++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= (i * 2) - 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		for (int i = 4; i >= 0; i--) {
			
			for(int p = 0; p < i; p++) {
				System.out.print(" ");
			}
			for(int j = 1; j < 2 * (5 - i); j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		

	}
}