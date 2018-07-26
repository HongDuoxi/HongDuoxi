package pack4;

public class PolyTv extends PolyProduct{
	
	@Override
	public void volumnControl() {
		System.out.println("TV 사운드 조절 후: " + getVolumn());
	}
	
	public void TvShow() {
		System.out.println("TV만의 고유 메소드");
	}

}
