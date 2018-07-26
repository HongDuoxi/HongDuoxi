package samples;

public class CoinIn {
	
	private int coin;
	private int jandon;

	public void calc(int cupCount) {
	
		if(coin < 1500) {
			System.out.println("\n오류코드 1: 요금이 부족합니다 " + "\n(커피 한 잔은 1500원 입니다)");
		} else if(coin < 1500*cupCount) {
			System.out.println("\n오류코드 2: 요금이 부족합니다");
			System.out.println("커피 " + cupCount + "잔은 " + 1500*cupCount + "원 입니다.");
		} else{
			jandon = coin - (1500*cupCount);
			System.out.println("\n커피 " + cupCount + "잔과 잔돈 " + jandon + "원 입니다.");
		}
	}
	
	
	public void setCoin(int coin) {
		this.coin = coin;
	}

}
