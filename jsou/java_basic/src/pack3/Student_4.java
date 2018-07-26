package pack3;

public class Student_4 {
	
	protected String name = "학생"; //protected를 썼어?! 그럼 상속 하겠구나~
	protected int grade;
	protected String gender = "Male";
	
	public Student_4() {
		System.out.println("Student_4 생성자");
	}
	
	protected void study() {
		System.out.println("필수과목: 자바");
	}

}
