package pack.thread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

import javax.annotation.processing.Filer;

public class IoTesat_2 {

	public static void main(String[] args) throws Exception{
		//표준 console을 통한 입력
		/*
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.print("이름입력: ");
		String irum = br.readLine();
		System.out.print("나이입력: ");
		String nai = br.readLine();
		System.out.println("이름은 " + irum + ", 나이는 " + nai);
		br.close();
		in.close(); //in을 먼저 넣었으면 마지막에 닫아줌
		*/
		
		/*Scanner sc = new Scanner(System.in);
		System.out.print("이름입력: ");
		//String name = sc.next(); //띄어쓰기 들어가면 err남
		String name = sc.nextLine();
		System.out.print("나이입력: ");
		//int age = sc.nextInt();
		double age = sc.nextDouble();
		System.out.println("이름은 " + name + ", 나이는 " + age);
		*/
		
		System.out.println("\n----파일 읽기----"); //메모장 파일 불러오기
		File f = new File("c:\\work\\iotest.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		while(true) { //while문을 돌려서 문서 쥬르르 읽기
			String ss = br.readLine(); //
			//if(ss.equals(null)) break;
			if(ss == null) break;
			System.out.println(ss);
		}
		br.close();
		fr.close();
	}

}
