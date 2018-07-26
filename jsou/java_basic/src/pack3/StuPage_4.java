package pack3;

public class StuPage_4 extends Student_4{
	
	String name = "페이지"; //protected가 없어? 자식이 없구나~
	int grade = 2;
	String gender = "Female";
	
	public StuPage_4() {
		System.out.println("StuPage_4 생성자");
	}
	
	@Override
	protected void study() {
		System.out.println("필수과목: 자바 + Python");
	}
	
	public void mySpec() {
		System.out.println("보유기술: 데이터분석 및 프로그래밍 전문");
	}
	
	public void print() {
		System.out.println();
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
		
		System.out.println();
		study();
		this.study();
		super.study();
		System.out.println();
		
	}
}
