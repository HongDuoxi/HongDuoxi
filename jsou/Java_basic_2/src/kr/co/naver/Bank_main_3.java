package kr.co.naver;

import pack2.Bank;

public class Bank_main_3 {

	public static void main(String[] args) {
		
		Bank kukmin = new Bank();
		kukmin.dePosit(2800);
		kukmin.withDraw(1500);
		System.out.println(kukmin.getMoney());
		
		//왜 초기값 1000이 없어?
		
	}

}
