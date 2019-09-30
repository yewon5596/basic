package Test3;

import java.util.Scanner;

public class ExamKEM {
	public static void main(String[] args) {
		
		ExamProgram a;//선언//이름표딱지//물리적으로는공간 (참조변수)있지만 논리적으로는 공간이없다고봄
		a= new ExamProgram();//데이터공간 만드는초기화//이름과 공간같이가야한다
		                      //함수를 선언은 메인밖 //함수사용은 메인안
		ExamProgram b = new ExamProgram();
		//a.kor=3; -->오류발생 캡슐이 깨졋다.
		//ExamProgram a =  new ExamProgram();
	//1. 성적을 입력받는함수
		ExamProgram.input(a);//-->공간을 알려주는것뿐 값을 저장하는건아니다
		                     //
		                     //외부에 있는 함수를 가져올때는 앞에 가져올 클래스명을 붙인다.
		a.input();//인스턴스함수//객체에서 사용하는함수-실물//좀더명확
		            
	//2.성적을 출력받는 함수
		ExamProgram.print(a);
		
		
	
	}
//별개 집에서 분가	

	
}


