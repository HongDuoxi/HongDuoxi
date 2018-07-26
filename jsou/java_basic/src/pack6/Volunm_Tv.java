package pack6;

public class Volunm_Tv implements Volunm{
	
	private int vol;
	
	public Volunm_Tv() {
		vol = 0;
	}
	
	@Override
	public void volunmUp(int level) {
		System.out.println("TV 소리를 " + level + " 키워줘");
	}
	
	@Override
	public void volunmDown(int level) {
		System.out.println("TV 소리를 " + level + " 줄여줘");
	}
	
	public void kbs() {
		System.out.println("9번 국영방송");
	}

}
