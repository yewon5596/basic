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
		
		
		
		// 1. ���� �Է� ��Ʈ�� fin ��ü�� �����Ұ�.
		
		//2. ���Ͽ��� ù��° 1����Ʈ�� �о ����Ұ�.
		//3. ���� �Է� ��Ʈ���� ������ .
		
		//�����̿��ϴ�������Ʈ�������� ����
//		FileInputStream fin = new FileInputStream("src/res/�ڿ�.bmp");
//		int value = fin.read();
//		System.out.println(value);
//		
//		fin.close();
		
//		System.out.write(123);
//		System.out.write(51);
//		System.out.flush();
	    
		
		
		
		
		
		
		
		
		
		
		
	}

}
