package pack1;

import java.util.Scanner;

public class Test11_while {
	
	public static void main(String[] args) {
		//반복문 while
		
		int w = 3; //for(변수=초기값; 조건; 증감식){}
		
		while(w <= 100) { //조건이 참인 동안 반복, 조건만 있음. 위에서 초기치 줘야 됨!
			System.out.println("w: " + w);
			w += 1; //반복문 탈출을 위한 명령문 필수
		}
		
		System.out.println("\n반복문 탈출 후 w: " + w);
		
		System.out.println("\n\n");
		
		w = 0;
		while(true) { //무한루프
			w++;
			if (w ==3) continue;
			System.out.println("w는 " + w);
			if(w == 5) break;
		}
		
		System.out.println("\n\n");
		
		w = 10;
		
		do{ //최소 1회는 반드시 수행
			System.out.println("do while의 w 값: " + w);
			w++;
		}while(w <=5);
		
		System.out.println("w: " + w);
		
		
		System.out.println("\n\n");
		
		
		
		
		System.out.println("<반복 처리의 예>");
		
		Scanner all = new Scanner(System.in);
		while(true) { //무한루프에는 꼭 break가 있어야 돼
			System.out.print("\n\n숫자 입력: ");
			int num = all.nextInt();
			int n = 1, total = 0;
			while(n <= num) {
				total += n;
				n++;
			}
			System.out.println("total: " + total);
			System.out.print("\n계속 하시겠습니까? 계속하시려면 1, 아니면 0을 선택하세요: ");
			int c = all.nextInt();
			if(c != 1) {
				System.out.println("반복작업 종료");
				break;
			}
		}
		
		all.close();
		System.out.println("\n\n\n시스템 종료");
		
	}

}
