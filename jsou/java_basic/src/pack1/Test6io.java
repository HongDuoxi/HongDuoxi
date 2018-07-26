package pack1;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class Test6io {

	public static void main(String[] args) throws Exception{
		// 프로그램 진행 중 외부에서 값 얻기
		//외부에서 args 값 가져오기
		
		
		
		if(args.length == 0) {
			System.out.println("외부에서 값 받기 실패");
			System.exit(1);		//응용프로그램 강제 종료(1) 정상종료는(0)
		}
		
		
		System.out.println(args[0]); //string, 프로그램은 0부터 시작. R만 빼고(1부터).

/*
		
		System.out.println("\n키보드로 값 얻기");
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이름입력: ");
		String name = buf.readLine();  //buf.readLine()에 빨간 줄이 생긴다면 외부장치가 멀쩡하지 않을 경우를 염려하는고야.
		System.out.print("나이입력: ");
		String age = buf.readLine();
		System.out.print("좋아하는 색: ");
		String color = buf.readLine();
		System.out.println("내 이름은 " + name + ", 나이는 " + age + ", 좋아하는 색은 " + color);
		buf.close();  //자원해제
		
*/
		
		System.out.println("\n키보드로 값 얻기 최신버전");
		Scanner sc = new Scanner(System.in); //Scanner는 위 명령어 덩어리를 만들어주니까 반드시 불러오기로 해.
		System.out.print("상품명: ");
		String product = sc.next();
		System.out.print("가격: ");
		int price = sc.nextInt();
		System.out.println("상품명은 " + product + ", 가격은 " + price);
		sc.close();
		
		System.out.println("프로그램 정상 종료");
		
		
		
		
	}

}
