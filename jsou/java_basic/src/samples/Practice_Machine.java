package samples;

import java.util.Scanner;

public class Practice_Machine {
	
	private int cupCount;
	//private int cofee = 20, suger = 10;
	Practice_CoinIn judi = new Practice_CoinIn();
	
	public void showDate() {
		
		System.out.println("\n---세상에서 가장 작은 카페, KANU---\n");
		
		Scanner red = new Scanner(System.in);
		
		System.out.println("- 아메리카노 4000원");
		System.out.println("- 카페라떼 5500원");
		
		System.out.print("\n원하는 커피를 입력하시오: ");
		String coffee = red.next();
		judi.setCoffee(coffee);
		
		System.out.print("몇 잔의 커피를 원하십니까: ");
		cupCount = red.nextInt();
		judi.calc(cupCount);
		
		
		
	}

}
