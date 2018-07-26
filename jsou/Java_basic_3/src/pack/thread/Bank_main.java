package pack.thread;

public class Bank_main {
	public static Bank myBank = new Bank();

	public static void main(String[] args) {
		System.out.println("잔고: " + myBank.getMoney());
		
		Bank_Park park = new Bank_Park();
		Bank_ParkWife wife = new Bank_ParkWife();
		
		park.start();
		wife.start();
	}

}
