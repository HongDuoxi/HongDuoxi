package samples;

import java.util.Scanner;

public class Machine {
	
	private int cupCount;
	//private int coffee = 20;
	//private int sugar = 10;
	CoinIn nick = new CoinIn();
	
	public Machine() {
		
	}
	
	public void showData() {
		
		System.out.println("\n\n----| 맥심 화이트 골드 |----\n");
		System.out.println("- 카페라떼 한 잔 1500원");
		
		Scanner red = new Scanner(System.in);
		
		System.out.print("\n금액을 입력하십시오: ");
		int coin = red.nextInt();
		nick.setCoin(coin);
		
		System.out.print("몇 잔의 커피를 원하십니까: ");
		cupCount = red.nextInt();
		nick.calc(cupCount);
	}


}

