import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setTest {

	public static void main(String[] args) {
		HashSet<Object> list = new HashSet<>();//<Object> 이 안에 String을 쓰면 글이 아닌 숫자나 변수는 못 들어감 
		list.add("hong");
		list.add(12);
		TryTest test = new TryTest();
		list.add(test);
		System.out.println(list.size());
		
		list.clear(); //컬렉션 내 모든 내용 지우기
		System.out.println(list.size());
		list.add("lee");
		list.add("kim");
		list.add("choi");
		list.add("han");
		list.add("han"); //set 타입 클래스는 중복을 허용하지 않음. 
						 //중복을 제외하고 싶을 때는 list를 쓰면 돼.
		System.out.println(list.size());
		
		list.remove("kim");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.toArray());
		
		myprint(list);
		System.out.println();
		myprint(list.toArray());
	}
	
	public static void myprint(Set set) {
		StringBuffer sb = new StringBuffer(); //이걸 지키지 않으면 속도가 떨어진다.
		String imsi = null;
		Iterator<Object> iter = set.iterator();
		while(iter.hasNext()) {
			String ss = (String)iter.next();
			System.out.println(ss);
			
			//imsi += ss+ " ";
			sb.append(ss);
			sb.append(" ");
		}
		//System.out.println("imsi");
		System.out.println(sb.toString());
	}
	
	public static void myprint(Object[] obj) {
		for(int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}
	
}
