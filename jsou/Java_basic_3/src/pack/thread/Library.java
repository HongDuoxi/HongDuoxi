package pack.thread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Library {

	public static void main(String[] args) throws Exception {

		File file = new File("c:\\work\\전국도서관표준데이터.csv"); //컴퓨터에 있는 파일을 불러와줘
		FileReader fr = new FileReader(file); //컴퓨터 언어로 읽어줘
		BufferedReader br = new BufferedReader(fr); //속도가 너무 차이나니까 버퍼를 끼워줘

		while (true) {
			String ss = br.readLine(); //띄어쓰기를 기준으로 한줄씩 읽어줘

			if (ss == null) { //만약 값이 없으면 멈춰
				break;
			}

			StringTokenizer tok = new StringTokenizer(ss, ","); //한줄씩 읽어진 자료를 ,를 기준으로 하나하나 나눠줘

			String name1 = tok.nextToken(); // 시설종류
			String name2 = tok.nextToken(); // 대상시설명
			String name3 = tok.nextToken(); // 소재지도로명주소
			String name4 = tok.nextToken();

			System.out.println("도서관명:" + "\t" + name1);
			System.out.println("소재지명:" + "\t" + name2 + " " + name3);
			System.out.println("도서관류:  " + name4);
			System.out.println("-----------------------");
			//System.out.println(ss);
		}
		br.close();
		fr.close();

	}

}
