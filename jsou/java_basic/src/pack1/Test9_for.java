package pack1;

//import java.util.Scanner;

public class Test9_for {

	public static void main(String[] args) {
		// 반복문 for
		
		System.out.println("\n");
		
/*

		Scanner all = new Scanner(System.in);
		
		System.out.println();
		System.out.print("a값을 입력하시오: ");
		int a = all.nextInt();
		all.close();
		
		for(int a1 = a; a1 <= 500; a1++) { //(초기값/조건/명령)
			System.out.print(a1 + " ");
		}
		
		
		System.out.println();
		System.out.println("현재 a값은 " + a1 + "입니다.");

	
		int a, hap = 0; //누적기억장소는 다음 실행때 다시 잘 구동이 되도록 초기화해둬야 한다.

		for(a = 1 ; a <= 10; a++) {
			//System.out.print(a + " ");
			//hap = hap + a;
			hap += a; //누적 -=, /=, *= 요렇게도 가능
			//a = 17; for 구문에 조건에 맞지 않는 값을 넣는 건 바보
			//a = 1; 는 무한루프. 즉, for 구문에 a의 변화를 주자 말자!!!!!
		}
		
		System.out.println("\na: " + a);
		System.out.println("합은 " + hap + "입니다.");
		
		System.out.println();
		for(int i = 65; i <= 90 ; i++) {
			System.out.print((char)i + "\t"); // \t는 tap키
		}
		
		System.out.println("\n");
		for(int i = 'A'; i <= 'Z' ; i++) {  //'A' "A"는 다르다.
			System.out.print(i + " ");
		}
		
		
		
		for(int j = 10; j > 1 ; j -= 2) {
			System.out.println(j + " ");
		}
		
		System.out.println();
		for(int ytn=0, tv=5; ytn <= 5; ytn++, tv++) {
			System.out.println(ytn + " " + tv + ",");
		}
		
		System.out.println();
		int aa = 1;
		for(; aa <= 5; aa++) {
			System.out.print(aa + " ");
		}
		
		System.out.println("\n");
		//구구단(3) 출력
		
		for (int count = 1; count <= 10; count++) {
			
			System.out.println("3 * " + count + " = " + (3*count));
			
			if(count ==5) {
				System.out.println("5를 좋아해");
			}
		}
		
*/		
		
		System.out.println("\n\n다중 for -------------");
		
		System.out.println();
		
		for(int m = 1; m <= 3; m++) {
			System.out.println("m = " + m);
			
			for(int n =1; n <= 4; n++) {
				System.out.print("n = " + n + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(char i = 97; i <= 122; i++) {
			
			System.out.print(i + " : ");
			
			for(char j = i; j <= 'z'; j++) {
				System.out.print(j);
			}
			
			System.out.println();
			
		}
		
		//차근차근 하나하나 쳐보고 구동해보면서 하면 는다!
		
		System.out.println("\n\n프로그램 종료");
		
	}

}
