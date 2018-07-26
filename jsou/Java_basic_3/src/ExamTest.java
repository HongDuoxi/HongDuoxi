import java.util.ArrayList;
import java.util.Scanner;

public class ExamTest {
	
	ArrayList<Exam> list = new ArrayList<>();
	
	public void Typing() { //DAO
		
		Exam exam = null;
		Scanner ex = new Scanner(System.in);
		
	while(true) { //무한 루프에 빠뜨리는 방법이야.
		
		exam = new Exam();
		
		System.out.print("이름입력: ");
		exam.setName(ex.next());
		
		System.out.print("국어점수: ");
		exam.setKor(ex.nextInt());
		
		System.out.print("영어점수: ");
		exam.setEng(ex.nextInt());
		
		list.add(exam);
		
		System.out.print("계속하시겠습니까?(y/n): ");
		String anwser = ex.next();
		
		if(anwser.equals("n")) break;
		else if(anwser.equals("y")) continue;
		else {
			System.out.println("시스템 에러");
			System.exit(0);
		}
	}
	
	}
	
	public void dispalyData() {
		System.out.println("이름    국어    영어   총점");
		for(int i =0; i < list.size(); i++) {
			Exam exam = list.get(i);
			System.out.println(exam.getName() + " " + 
			exam.getKor() + " " + exam.getEng() + "   " + (exam.getKor()+exam.getEng()));
		}
		System.out.println("응시인원: " + list.size() + "명");
	}
	

	public static void main(String[] args) {
		
		ExamTest test = new ExamTest();
		test.Typing();
		
		System.out.println();
		test.dispalyData();

	}

}