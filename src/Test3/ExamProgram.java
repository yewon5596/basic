package Test3;

import java.util.Scanner;

public class ExamProgram {
	private int kor;
	private int eng;
	private int meth;
	
	public static void input(ExamProgram a){
		Scanner scan = new Scanner(System.in);
		System.out.println("kor:");
		a.kor=scan.nextInt();
		

	}
	public  void input(){
		Scanner scan = new Scanner(System.in);
		System.out.println("kor:");
		this.kor=scan.nextInt();
		

	}

	public static void print(ExamProgram a) {
		System.out.println("kor:"+a.kor);
		
	}
	
	


}

