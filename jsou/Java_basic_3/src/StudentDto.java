
public class StudentDto {
	//record단위의 기억장소 선언
	//""""POJO""""라고 부름
	
	private String hakbun, irum;
	private int jumsu; //순서는 중요하지 않다. public으로 잡을 수도 있지만 캡슐화를 위해 게터세터를 이용하자.
	
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getIrum() {
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
	}
	public int getJumsu() {
		return jumsu;
	}
	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}
	
	//이렇게 쓰는게 바로 레코드 타입의 DTO다!
	
	
	
	

}
