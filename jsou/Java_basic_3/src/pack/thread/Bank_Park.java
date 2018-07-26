package pack.thread;

public class Bank_Park extends Thread{

	@Override
	public void run() {
		Bank_main.myBank.saveMoney(5000);
		System.out.println("남편 예끔 후 짠꼬: " + Bank_main.myBank.getMoney());
	}
	
}
