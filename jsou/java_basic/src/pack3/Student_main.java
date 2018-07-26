package pack3;

public class Student_main {

	public static void main(String[] args) {
		
		StuTom_4 tom = new StuTom_4();
		System.out.println(tom.name);
		System.out.println(tom.grade + "학년");
		System.out.println(tom.gender);
		tom.study();
		
		System.out.println();
		StuPage_4 page = new StuPage_4();
		System.out.println(page.name);
		System.out.println(page.grade + "학년");
		System.out.println(page.gender);
		page.study();
		page.mySpec();
		page.print();
		
	}

}
