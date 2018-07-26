package pack6;

public class Volunm_Radio implements Volunm{ //볼륨 옆에 ,하고 여러개 쓸 수 있음 
											//인터페이스를 구현했다! new를 할 수 없다.	
	
	private int volLevel;
	
	public Volunm_Radio() {
		volLevel = 0;
	}
	
	@Override
	public void volunmUp(int level) {
		volLevel += level;
		System.out.println("라디오 볼륨 올리면 " + volLevel);
	}
	
	@Override
	public void volunmDown(int level) {
		volLevel -= level;
		System.out.println("라디오 볼륨 내리면 " + volLevel);
	}
	

}
