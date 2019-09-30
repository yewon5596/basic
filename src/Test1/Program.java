  package Test1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	
	

	public static void main(String[] args) throws IOException {
		int [] nums =new int[10];
		
		//InputStream/OutputStream
		
		//C:\eclipse\workspace\basic\src\java\data.txt
		
		FileInputStream fin = new FileInputStream("C:\\eclipse\\workspace\\basic\\src\\res\\data.txt");
		Scanner fscan= new Scanner(fin);
		int num= fscan.nextInt();
		

	    
		
	    while(fscan.hasNext()) {
	    	num = fscan.nextInt();
	    	
	    
	    	System.out.println(num);
	    }
	   
	   fscan.close();
	    fin.close();
		
		
		
		
		
		
		

	}

}
