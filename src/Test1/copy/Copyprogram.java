package Test1.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copyprogram {
public static void main(String[] args) throws IOException {
	
	FileInputStream fin = new FileInputStream("src/res/�ڿ�.bmp");
	FileOutputStream fos = new FileOutputStream("src/res/�ڿ�_copy.bmp");
	
	byte[]buf=new byte[1024];
//�Է½�Ʈ�����κ��� ����Ʈ�� ���� �����ٸ� read()�żҵ�� -1������
    int size =0;
	while((size=fin.read(buf))!=-1)
		fos.write(buf,0,size);
		//read���絿�̿��� size�� 1024�ȵǴ¾翡 ������ϴµ�..�Լ��� �����ġ���� �����������÷��ϴ��Լ������ִ�
	    //�迭�� �ѿ��� �迭�� ũ�⸸ŭ�� �絿�̿���--->read

//	while(b!=-1) {
//		fos.write(b);
//		b= fin.read();
//		
//	}
	fin.close();
	fos.close();

	System.out.println("����Ϸ�");
	
	

			
}
}
