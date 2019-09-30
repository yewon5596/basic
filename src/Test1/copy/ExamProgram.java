package Test1.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExamProgram {// ExamProgram class 시작
	public static void main(String[] args) throws IOException {// main method 시작

		FileInputStream fin = new FileInputStream("src/res/data.txt");
		// 외부 파일가져오는 FileInputStream 으로 fin 객체생성
		Scanner fscan = new Scanner(fin);
		// data.txt파일의 여백이있는 데이터(문자)를 가져오기위해 스캐너사용

		int[] nums = new int[100];
		// 배열 nums에 100을생성

		// 데이터 일괄 로드(load)
		// nums[0] = fscan.nextInt();
		// nums[1] = fscan.nextInt();

//		int i=0;
//		while(fscan.hasNext()) {
//			nums[i]=fscan.nextInt();
//		    i++;}

		for (int i = 0; fscan.hasNext(); i++) {
			//t가 전제로   hasNext는 boolean타입으로 값t/f 다음가져올것이있으면 t 가져올것이없으면 f 
			//i는 0일때 fscan객체가 다음가져올값이 있으면 i는 증가하고 {}반복한다
		
			
			nums[i] = fscan.nextInt();
			//배열 nums는 fscan에서 값을 불러올때 
			nums[i + 1] = -1;
		}

		fin.close();
		// 테이터는 로그 되었다.
		// 배열을 사용하면 일괄로드하여 계산할수있다.
		

//		int sum = 0;
//		int count = 0;
//		double avg = 0;
//
//		for (int i = 0; nums[i] != -1; i++) {
//			count++;
//			sum += nums[i];
//		}
//
//		avg = sum / count;
//
//		System.out.printf("sum:%d\n", sum);
//		System.out.printf("avg:%f\n", avg);--->이방식은 속도는 빠르나 유지보수가힘들어 좋은코드는 아니다
		//데이터개수============================================
		int count = 0;
		for (int i = 0; nums[i] != -1; i++) {
			count++;
			
		}
		//데이터의 합===========================================
		
		int sum = sum(nums);
		
	
	
		//데이터평균===========================================
		
		printSumAndAvg(sum,count);
		
		
		//입출력 문자출력하는방법
		
		
		
		

	}

public static void printSumAndAvg(int sum, int count) {
	double avg = 0;
	avg = sum / count;
	System.out.println(sum);
	System.out.println(avg);
	
	
}

public static int sum(int[] nums) {
	int sum=0;
	for (int i = 0; nums[i] != -1; i++) 
		sum += nums[i];
	
	return sum;
}

	
}

