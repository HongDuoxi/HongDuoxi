import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> list = new HashMap<>();
		
		list.put("0", "lee");
		list.clear();
		
		list.put("0", "hong0");
		list.put("1", "hong1");
		list.put("2", "hong2");
		list.put("3", "hong3");
		list.put("4", "hong4");
		list.put("5", "hong5");
		list.put("2", "park"); //2번 키의 데이터 값 수정
		System.out.println(list.size());
		System.out.println(list.containsKey("1")); //자리에 있냐없냐
		System.out.println(list.containsKey("park"));
		System.out.println(list.containsKey("hong2")); //hong2는 park에 덮어쓰기 당해서 사라졌다.
		list.remove("0");
		
		display(list); 
	}
	
	public static void display(Map map) {
		Set set = map.keySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			String key = (String)iter.next();
			//System.out.println(key);
			System.out.println(key + " " + map.get(key));
		}
		
	}
}
