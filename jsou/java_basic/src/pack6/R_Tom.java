package pack6;

public class R_Tom implements Resume{
	
	private String irum, phone, juso;
	
	public R_Tom() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setIrum(String irum) {
		this.irum = irum;
	}
	
	@Override
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setJuso(String juso) {
		this.juso = juso;
	}
	
	@Override
	public void print() {
		//Resume.SIZE = "b5"; 	//err: fimal이므로
		System.out.println("용지 규격 " + Resume.SIZE);
		System.out.println("이름: " + irum + ", 전화: " + phone + ", 주소: " + juso);
		
		playJava(false);
		Resume.changeData();
	}
	

}
