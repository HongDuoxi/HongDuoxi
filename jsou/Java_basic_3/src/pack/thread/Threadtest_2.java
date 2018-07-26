package pack.thread;

public class Threadtest_2 implements Runnable{ // extends Thread하기 곤란할때는 러너블을 임플리먼트하자.
	
	public Threadtest_2() {
		
	}
	
	public Threadtest_2(String name) {
		Thread tt = new Thread(this, name);
		tt.start();
	}
	
	@Override
	public void run() {
		for(int i = 1; i < 50; i++) {
			System.out.println(i + ":" + Thread.currentThread().getName());
			try {
				Thread.sleep(300); //2초 비활성, 잠시 쉬어가는 텀을 주는 것
			} catch (Exception e) {
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Threadtest_2("하나");
		new Threadtest_2("두울");
		
		System.out.println();
		System.out.println("시스템 종료");
	}

}
