package pack.thread;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.Buffer;

public class IoTest_1 {
	
	public static void main(String[] args) throws IOException{
		//1byte 단위의 입출력
		
		/*System.out.print("1바이트 입력: ");
		int a = System.in.read(); //외부장치를 쓸 수 있으니까 예외처리를 해요.
		System.out.println("입력값a: " + a + " " + (char)a);
		
		//문자열 출력
		OutputStreamWriter os = new OutputStreamWriter(System.out); //여기서 out은 PrintStream
		byte b = 97;
		os.write(b); //출력하는 명령어
		os.flush(); //비워주는 명령어
		
		//Buffer 사용: 입출력 성능 향상
		BufferedWriter bw = new BufferedWriter(os, 1024); //1byte = 1024
		PrintWriter out = new PrintWriter(bw);
		out.println(123);
		out.println("오늘은 금요일");
		out.close();
		bw.close(); //자원 해제: 메모리 반납 - GC
		*/
		
		System.out.println("\n----파일 출력----"); //메모장 파일로 내보내기. 저장하기
		File f = new File("c:/work/iotest.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw2 = new BufferedWriter(fw, 1024); //안주면 자동으로 1byte = 1024
		PrintWriter out2 = new PrintWriter(bw2); //내용은 아래에 있는 내용으로 해 줘.
		out2.println(1234);
		out2.println("문자열이 출력됨");
		out2.println("Stream을 사용함");
		out2.close();
		fw.close();
		bw2.close();
		
		System.out.println("파일 출력 성공");
	}

}
