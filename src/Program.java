import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

//Program class s.
public class Program {
    //main method s
	public static void main(String[] args) throws IOException {
		//10개의 배열 만들기 
		int[] nums = new int[10];

		// InputStream/OutputStream

		

		//파일인풋스크림 객체의 fin이름 생성하기
		FileInputStream fin = new FileInputStream("C:\\eclipse\\workspace\\basic\\src\\Test1\\data.txt");
		//입력에서 공백까지를 가져오는 스캐너 fin 생성
		Scanner fscan = new Scanner(fin);
		//num이라는 공간 생성,0으로 초기화
		int num = 0;
		// int num= fscan.nextInt();

//		System.out.println(num);
//		
//		int num2= fscan.nextInt();
//		System.out.println(num2);
//		
//		int num3=fscan.nextInt();
//		System.out.println(num3);
//		
//	    int num4=fscan.nextInt();
//	    System.out.println(num4);
//	    
//	    int num5=fscan.nextInt();
//	    System.out.println(num5);
//	    
//	    int num6=fscan.nextInt();
//	    System.out.println(num6);
		//sum이라는 공간생성,0으로 초기화
		int sum = 0;
		//cnt라는 공간생성, 0으로 초기화
		int cnt=0;
		//avg라는 공간생성,0으로 초기화
		float avg = 0;
        //while 반복문사용 시작
		while (fscan.hasNext()) {
			//num에 nextInt값 저장
			num = fscan.nextInt();
			//System.out.println("n: "+num);
			//cnt에 cnt+1값 저장
			cnt= cnt+1;
			//System.out.println("cnt : "+cnt);
			//sum에 num+sum값대입
			sum = num + sum;
			
		}
		//avg에 형변형값에 개수나눠 값대입
		avg= (float)sum/cnt;
		

		System.out.println(sum);
		System.out.println(avg);
		

		fscan.close();
		fin.close();

	}

}
