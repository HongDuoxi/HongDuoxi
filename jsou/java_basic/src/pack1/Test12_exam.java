package pack1;

public class Test12_exam {

	public static void main(String[] args) {
		// whlie 연습문제
		
		//문제 1) 1~100 사이의 정수 중 3의 배수이지만 2의배수가 아닌
		//수를 출력하고, 그 합과 갯수를 출력

		
		int a = 1;
		int count = 0;
		int sum = 0;
		
		while(a <= 100) {
			
			if(a % 3 == 0 && a % 2 != 0) {
				System.out.print(a + " ");
				count += 1;
				sum += a;
			}
			
			a++;
			
		}
		
		System.out.println("\n");
		System.out.println("수의 갯수는 " + count + "이다.");
		System.out.println("수의 합은 " + sum + "이다.");
		
		
		System.out.println("\n");
		
		
		//문제 2) -1, 3, -5, 7, -9, 11 ~ 99 까지의 합 출력
		
/*
 		int count1 = 1;
		int result = 1;
		int hap = 1;
		
		while(result <= 99) {
			
			System.out.print(result + " ");
			result = 1 + (2 * count1);
			count1++;
			
			if(count1 % 2 == 0) {
				result = result * -1;
			}
			
			hap +=result;
			
			if(count1 == 99) break;
		}
		
		System.out.println("\n");
		System.out.println("수의 합은 " + hap + "이다.");
	*/
		int i = 1, some = 0, cnt = 1;
		
		while(i < 100) {
		
			if(cnt % 2 == 0) { //짝수지점
				System.out.print(i + " ");
				some += i;
			}else { //홀수지점
				int k = i *-1;
			 	System.out.print(k + " ");
			 	some += k;
			}
		
			i +=2;
			cnt++;
		}
		
		System.out.println("\n\n합출력: " + some);
		
		System.out.println("\n");
		//문제 3) 1 ~ 1000 사이의 소수와 그 갯수를 출력하고 그 합을 구하라
		//		  * 소수: 1보다 크고, 자신 이외의 다른 수로는 나누어 떨어지지 않는 수
		
/*		
		int num = 1;
		int count3 =1;
		int i = 1;
		
		
		for(num =2; num <= 1000; num++) {
			count3 = 0;
			for(i = 2;i < num;i++) 
				if(num % i != 0)
					count3++;
				if(count==0)
					System.out.println(num);
			
		}
*/		
		
		int aa = 2, ccount = 0;
		
		while(aa <= 1000) {
			
			boolean imsi = false;
			int bb = 2;
			
			while(bb <= aa-1) {
				if(aa % bb == 0) {
					imsi = true;
				}
				bb++;
			}
			
			if(imsi == false) {
				System.out.print(aa + " ");
				ccount++;
			}
			
			aa++;
		}
		System.out.print("\n\n갯수출력: " + ccount);
		System.out.println("\n\n");
		System.out.println("시스템 종료");
	}

}

