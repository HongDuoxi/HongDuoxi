package samples;

import java.util.Scanner;

public class Practice_CoinIn {
	
	private int coin, jandon;
	private String coffee;
	
	public void calc(int cupCount) {
		
		System.out.println();
		if(coffee.equals("아메리카노")) {
			
			System.out.println(4000 * cupCount + "을 넣어주세요.");
			
			gg();
			
			if(coin < 4000*cupCount) {
				System.out.println("\n오류코드 2: 요금이 부족합니다");
				System.out.println("커피 " + cupCount + "잔은 " + 1500*cupCount + "원 입니다.");
			} else{
				jandon = coin - (4000*cupCount);
				System.out.println("\n커피 " + cupCount + "잔과 잔돈 " + jandon + "원 입니다.");
			}
			
		}else if(coffee.equals("카페라떼")) {
			
			System.out.println(5500 * cupCount + "을 넣어주세요.");
			
			gg();
			
			if(coin < 5500*cupCount) {
				System.out.println("\n오류코드 2: 요금이 부족합니다");
				System.out.println("커피 " + cupCount + "잔은 " + 5500*cupCount + "원 입니다.");
			} else{
				jandon = coin - (5500*cupCount);
				System.out.println("\n커피 " + cupCount + "잔과 잔돈 " + jandon + "원 입니다.");
			}
		}
		
		
	}
	
	public void gg() {
		
		Scanner red = new Scanner(System.in);
		System.out.println();
		System.out.print("금액을 입력하세요: ");
		coin = red.nextInt();
	}
	
	public void setCoin(int coin) {
		this.coin = coin;
	}
	
	public void setCoffee(String coffee) {
		this.coffee = coffee;
	}

}
