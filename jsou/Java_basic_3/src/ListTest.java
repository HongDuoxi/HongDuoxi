import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		//List 타입의 ArrayList: 순서가 있고 중복 허용 
		ArrayList<String> list = new ArrayList<>();
		list.add("Kim");
		list.clear();
		list.add("Hong");
		list.add("Yoo");
		list.add("Hong");
		list.add("Lee");
		list.add("Hoi");
		System.out.println(list.size()); //중복을 허용
		System.out.println(list.get(1));
//		list.remove(1);
//		list.remove("Hong");
		System.out.println(list.contains("Kim"));
		System.out.println(list.indexOf("Hong"));
		
		System.out.println();
		pr1(list);
		System.out.println();
		pr2(list);
	}
	
	public static void pr1(List<String> list) {
		
		for(int a = 0; a < list.size(); a++) {
			System.out.print(list.get(a) + " ");
		}
		
		System.out.println();
		
		for(String b:list) {
			System.out.print(b + " ");
		}
	}

	public static void pr2(ArrayList<String> list) {

	}

}
