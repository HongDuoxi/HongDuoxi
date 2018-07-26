package etc;

import pack2.Bank; //패키지가 다를 경우(2)
//import pack2.Animal;
//import pack2.*; //패키지가 다를 경우(3) 팩2의 모든 클래스를 가져올게
import java.lang.System;
//import java.util.Scanner;
import java.lang.String;

public class Bank_main_2 {

	public static void main(String[] args) {
		//pack2.Bank mary = new pack2.Bank(); //패키지가 다를 경우(1)
		Bank mary = new Bank();
		//Animal bat = new Animal();
		
		System.out.println("public member는 project내에서 참조 가능");
		System.out.println(mary.imsi2); //같은 패키지에서는 모두 참조가능하지만 (public 접근지정자)
		//System.out.println(mary.imsi);  다른 패키지에서는 public만! 참조가능 (default 접근지정자)
		

	}

}
