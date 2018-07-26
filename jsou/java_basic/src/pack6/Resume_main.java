package pack6;

public class Resume_main {

	public static void main(String[] args) {
		
		R_Tom tom = new R_Tom();
		tom.setIrum("다희");
		tom.setPhone("010-5549-1842");
		tom.setJuso("강남구 테헤란로");
		tom.print();
		
		System.out.println();
		tom.playJava(false);
		//tom.changeData();
		Resume.changeData();
		
		System.out.println();
		R_James james = new R_James();
		james.setIrum("성진");
		james.setPhone("010-2628-1842");
		james.setSkill("웹디자인");
		james.print();
		
		System.out.println("\n\n----이력서 평가----\n");
		
		Resume[] resBox = new Resume[2];
		resBox[0] = tom;
		resBox[1] = james;
		
		for(Resume kbs: resBox) {
			kbs.print();
			System.out.println("\n다음 지원자 정보\n");
		}
	}

}
