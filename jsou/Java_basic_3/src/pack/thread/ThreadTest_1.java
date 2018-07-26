package pack.thread;

public class ThreadTest_1 extends Thread{
	
	public ThreadTest_1() {
		
	}
	
	public ThreadTest_1(String name) {
		super(name);
	}
	
	public void run() { //extends Thread하자마자 run이 오버라이드
		for(int i = 1; i < 50; i++) {
			//System.out.print(i + " ");
			System.out.print(i + " : " + super.getName());
		}
	}
	
	public static void main(String[] args) {
		try {
//			Process p1 = Runtime.getRuntime().exec("calc.exe");
//			Process p2 = Runtime.getRuntime().exec("notepad.exe");
//			p1.waitFor();
//			p2.destroy();
//			System.out.println("p1: " + p1.exitValue());
//			System.out.println("p2: " + p2.exitValue());
			
//			ThreadTest_1 t1 = new ThreadTest_1();
//			ThreadTest_1 t2 = new ThreadTest_1();
//			t1.run();
//			System.out.println();
//			t2.run();
			
//			ThreadTest_1 t1 = new ThreadTest_1();
//			ThreadTest_1 t2 = new ThreadTest_1();
			ThreadTest_1 t1 = new ThreadTest_1("one ");
			ThreadTest_1 t2 = new ThreadTest_1("two ");
			t1.start(); //run() 이 자동으로 호출됨.
			t2.start(); //동시에 수행되는 것이 아니라 유효시간이 발생했을 때 또 다른 변수가 치고들어오는 프로세스
			t2.setPriority(MAX_PRIORITY); //우선순위변경요청
			
			t1.join(); //일반 스레드의 수행이 끝날 떄까지 메인 스레드 대기
			t2.join();
			
			t1.yield(); //***다른스레드의 수행이 요청되면 현재 스레드의 수행을 일시정지...
			//t1.stop(); depricate. 이제 안써
			
			
			System.out.println("프로그램 종료");
		} catch(Exception e) {
			System.out.println("err: " + e);
		}
	}

}
