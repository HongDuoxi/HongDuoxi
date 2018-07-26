package pack.thread;

public class BreadPlate {
	private int breadCount = 0;

	public BreadPlate() {
		// TODO Auto-generated constructor stub
	}
	
	//두개 이상의 Thread를 가동시키면 가능하면 공평하게 실행이 되게끔 스케쥴링 된다.
	
	public synchronized void makeBread() {// synchronized: 동기화..가 뭐지?
		if (breadCount >= 10) {
			try {
				System.out.println("빵 생산량 초과");
				System.out.println();
				wait(); //스레드 작업을 비활성화. 예외처리하라고 try 안에 집어 넣은 것. sleep도 그랬던 것 처럼
						//아래서 다시 활성화 시켜줘야 함. notify();를 통해
			} catch (Exception e) {
			}
		}
		breadCount++;
		System.out.println("빵 생산 총량: " + breadCount + "개");
		notify(); //비활성화 되었던 스레드를 다시 활성화 시켜주는 방법
	}

	public synchronized void eatBread() {
		if (breadCount < 1) {
			try {
				System.out.println("빵 소비 불가");
				System.out.println();
				wait(); //스레드 작업을 비활성화
			} catch (Exception e) {
			}
		}
		breadCount--;
		System.out.println("빵 소비 총량: " + breadCount + "개");
		notify(); //비활성화 되었던 스레드를 다시 활성화 시켜주는 방법
	} 
}
