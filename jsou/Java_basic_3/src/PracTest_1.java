import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.StringTokenizer;

public class PracTest_1 {
	ArrayList<PracDto> list = new ArrayList<>();
	DecimalFormat format = new DecimalFormat("#,##0"); //#: 무효의 제로를 0으로 채워, 무효의 0는 공백 처리해 
														//소수점 표현 ("0.000")이런 식으로 0이 나오게 가능
	public void inputData(String[] args) {
		PracDto prac;
		
		for (int i = 0; i < args.length; i++) {
			
			StringTokenizer tok = new StringTokenizer(args[i],",");
			
			prac = new PracDto(); //초기화
			
			int sabun = Integer.parseInt(tok.nextToken());
			String irum = tok.nextToken();
			int basic = Integer.parseInt(tok.nextToken());
			int year = Integer.parseInt(tok.nextToken());
			
			prac.setSabun(sabun);
			prac.setBasic(basic);
			prac.setIrum(irum);
			prac.setYear(year);
			
			list.add(prac);
		}
	}

	public void printData(String[] args) {
		
		System.out.println("사번\t이름\t기본급\t근무년수\t근속수당\t공제액\t수령액");
		
		for (PracDto prac : list) {
			
			Calendar life = Calendar.getInstance(); 
			int y = life.get(Calendar.YEAR);
			int sudang;
			if((y - prac.getYear()) <= 3) {
				sudang = 150000;
			} else if ((y - prac.getYear()) >= 9) {
				sudang = 1000000;
			} else {
				sudang = 450000;
			}

			double gongje = 0;
			if ((prac.getBasic() + sudang) < 2000000) {
				gongje = (prac.getBasic() + sudang) *  0.15;
			} else if ((prac.getBasic() + sudang) >= 3000000) {
				gongje = (prac.getBasic() + sudang) * 0.5;
			} else {
				gongje = (prac.getBasic() + sudang) * 0.3;
			}

			System.out.println(prac.getSabun() +"\t"+ prac.getIrum() +"\t"+ prac.getBasic() +"\t"
			+ /* 근무년수 */(y - prac.getYear()) +"\t"+ /*근속수당*/sudang 
			+"\t" /*공제액 */+(int)gongje + "\t"/*수령액*/+(int)(prac.getBasic() + sudang - gongje));
		}
		System.out.println("처리건수: " + list.size() + "건");
	}
	
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("입력자료 없음");
			System.exit(0);
		}
		
		PracTest_1 abc = new PracTest_1();
		abc.inputData(args);
		abc.printData(args);
	}
}