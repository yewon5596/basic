package Test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BmpProgram {
	public static void main(String[] args) throws IOException {
//=================로드 ==========
		FileInputStream fin = new FileInputStream("src/res/자연.bmp");

		byte[] buf = new byte[10];
		fin.read(buf);
		fin.close();
		
//	buf[2]~buf[5]
//파일크기 ====================================
		int size = ((int) buf[2] & 0xff) << 0 | 
				   ((int) buf[3] & 0xff) << 8 | 
				   ((int) buf[4] & 0xff) << 16|
				   ((int) buf[5] & 0xff) << 24;

//	int size = (int)buf[2]<<0 |
//			
//	           (int)buf[3]<<8 |
//	           (int)buf[4]<<16|
//	           (int)buf[5]<<24;

		// (int)buf[2] & 0x000000ff <<0 //0xff로 쓸수도있다.
//파일크기출력==============================================
		System.out.printf("size:%d\n", size);
		
		//입출력 숫자출력하는법


	}

}
