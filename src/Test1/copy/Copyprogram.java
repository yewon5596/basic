package Test1.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copyprogram {
public static void main(String[] args) throws IOException {
	
	FileInputStream fin = new FileInputStream("src/res/자연.bmp");
	FileOutputStream fos = new FileOutputStream("src/res/자연_copy.bmp");
	
	byte[]buf=new byte[1024];
//입력스트림으로부터 바이트를 읽을 수없다면 read()매소드는 -1을리턴
    int size =0;
	while((size=fin.read(buf))!=-1)
		fos.write(buf,0,size);
		//read가양동이역할 size가 1024안되는양에 멈춰야하는데..함수중 어느위치에서 어디까지가져올래하는함수쓸수있다
	    //배열의 한에서 배열의 크기만큼만 양동이역할--->read

//	while(b!=-1) {
//		fos.write(b);
//		b= fin.read();
//		
//	}
	fin.close();
	fos.close();

	System.out.println("복사완료");
	
	

			
}
}
