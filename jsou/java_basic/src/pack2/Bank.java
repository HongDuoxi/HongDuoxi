package pack2;

public class Bank {
	
	private int money = 1000;
	int imsi = 1;
	public int imsi2 = 2;
	
	//----------------------------------
	
	public Bank() {
		// 생성자 오버로딩을 해놨으면 생성자가 내용이 없더라도 적어놔야 돼.
		// 객체에서 안부를거면 안적어도 상관없긴 해
	}
	
	public Bank(int money) {
		this.money += money;
	}
	
	public void dePosit(int amount) { //입금
		if(amount > 0) money += amount;
	}
	
	public void withDraw(int amount) { //출금
		if((amount > 0) && (money - amount >= 0)) {
			money -= amount;
		} else {
			System.out.println("잔액이 부족합니다");
		}
		
	}
		
	//----------------------------------
	
	public int getMoney() { //잔금확인
		return money; //getMoney가 왜 잔금이지?
	}
	
	
}
