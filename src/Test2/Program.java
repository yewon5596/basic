package Test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("src/test-bi.txt");
		
		fout.write(12);
		//fout.write('2');
		fout.flush();
		
		
		
		fout.close();
		
		
		
		// 1. 파일 입력 스트림 fin 객체를 생성할것.
		
		//2. 파일에서 첫벌째 1바이트를 읽어서 출력할것.
		//3. 파일 입력 스트림을 닫을것 .
		
		//현재이용하는프로젝트기준으로 접근
//		FileInputStream fin = new FileInputStream("src/res/자연.bmp");
//		int value = fin.read();
//		System.out.println(value);
//		
//		fin.close();
		
//		System.out.write(123);
//		System.out.write(51);
//		System.out.flush();
	    
		
		
		
		
		
		
		
		
		
		
		
	}

}
