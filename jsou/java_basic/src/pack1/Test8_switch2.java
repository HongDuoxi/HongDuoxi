package pack1;

import java.util.Scanner;

public class Test8_switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*		
		String jik = "전무";
		String msg = "기타";
		
		switch (jik) {
		case "사원":
			msg = "열심히";
			break;
		case "대리":
			//아무것도 안 쓰면 아래에 있는 우수해 나옴
		case "과장":
			msg = "우수해";
			break;
		default:
			System.out.println("그 외 직급");
			break;
		}
		
		System.out.println(msg);
		
*/
		
		
		System.out.println();
		//키보드로부터 년과 월을 입력받아 해당년월의 날 수를 출력
		//윤년식 4의 배수 && 100의 배수가 아님 || 400의 배수
		
		String aa = "평년";
		int year, month, day = 28; //초기값 설정해두면 깔끔해

		Scanner input = new Scanner(System.in);
		System.out.print("년도: ");
		year = input.nextInt();
		System.out.print("월: ");
		month = input.nextInt();
		input.close();
		
		System.out.println();
		
		if(month < 1 || month > 12) {
			System.out.println("월은 1~12 사이값만 허용");
			System.exit(0); //프로그램 의도적으로 종료
		} 							//입력자료 오류 검사 과정
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { //% 나머지연산. 0으로 떨어지면 배수값
			day = 29;
			aa = "윤년";
		} 

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			break;
		}
		
		System.out.println(year + "년, " + month + "월, " + day + "일, " + aa);
		
		
	}

}
