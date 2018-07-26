package pack1;

public class Test13_array {

	public static void main(String[] args) {
		// 배열: 성격과 크기가 일치하는 복수 기억장소를 
		// 대표명 하나를 주고 첨자(index)로 각 기억장소를 구분
		// 반복처리가 효과적
		
		//int[] ar;
		//int ar[];
		//ar = new int[5]; //기억장소 확보
		
	    int ar[] = new int[5];//1차원 배열
		System.out.println("ar의 배열크기: " + ar.length);
		ar[0] = 10;
		ar[1] = 20;
		ar[4] = ar[0] + ar[1];
		
		int k = 4, kbs = 2;
		System.out.println("ar[4] = " + ar[4]);
		System.out.println("ar[k] = "+ ar[k]);
		System.out.println("ar[kbs + 2] = "+ ar[kbs + 2]);
		
		// ar[-2] = 30; err
		// ar[5] = 30; err
		
		// 선언과 함께 초기값을 줄 수도 있음
		
		int[] ar1 = {1,2,3,4,5};
		
		System.out.println(ar1[0] + " " + ar1[1]);
		
		for(int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + " ");
		}
		
		//배열 나오면 for야!
		
		System.out.println("\n\n<향상된 for : 배열, 컬렉션에서 사용>\n"); 
		//cf. 컬렉션은 객체를 담고 있는 그릇, 다발
		
		for(int i:ar1) { //0번부터 순서대로 내보내는 명령. 편하니까 익혀두기!
			System.out.print(i + " ");
		}
		
		
		System.out.println();
		String city[] = {"서울", "대전", "대구", "부산", "울산", "광주"};
		System.out.println(city);
		
		for (String c: city) {
			System.out.println("도시명은 " + c);
		}
		
		System.out.println();
		int [] ar2 = new int[5]; // 기억장소들의 초기치는 0으로 설정되어 있음
		
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = i + 1;
		}
		
		for (int i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i] + " ");
		}
		
		int hap = 0;
		
		for(int i = 0; i < ar2.length; i++) {
			hap += ar2[i];
		}
		
		System.out.println("\n합 " + Integer.toString(hap));
		
		
		System.out.println("\n<배열자료로 분산 구하기>\n");
		
		int arr[] = {1, 3, -2, 4, 12, -53, 55};
		
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println("\n\n합은 " + sum);
		double avg = sum / arr.length;
		System.out.println("평균은 " + avg);
		
		double tot = 0.0;
		for (int su = 0; su < arr.length; su++) {
			tot += Math.pow(arr[su] - avg, 2);
		}
		double veri = tot / arr.length;
		System.out.println("분산은 " + veri);
		
		double sd = Math.sqrt(veri);
		System.out.println("표준편차는 " + sd);
		
		//class는 명령 덩어리. 명령의 사전
		
	}

}
