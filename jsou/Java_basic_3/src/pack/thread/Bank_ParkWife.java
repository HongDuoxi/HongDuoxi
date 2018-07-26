package pack.thread;

public class Bank_ParkWife extends Thread{

	@Override
	public void run() {
		Bank_main.myBank.outMoney(2000);
		System.out.println("아내 출금 후 짠꼬: " + Bank_main.myBank.getMoney());
	}
	
}
