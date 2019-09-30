package 가변배열;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		//ObjectList list = new ObjectList();
		Gist<Exam> Gist = new Gist<>();
		//모든것을 담는 것은? 단점일수 잇다.
		list.add("hello");
		list.add(30);
		list.add(new Exam());
		
		//서비스 함수를 사용하려면? 형식을 변환해야 한다.
		//((Exam)list.get(2)).input();
		 Gist.get(2).input();
		//list.get(2).input();
		
		
		
		
		
		
		
		//ObjectList list;
	
		//Object[] data = new Object[3];//Objec[]data 3개의 그릇을 담았다 참조
		//int index = 0;
		//int exit=0;//for문을 반복하기위해 만들었다
		
		//Scanner scan = new Scanner(System.in);
		//list= new ObjectList();
		
		//do {
		     //input(data,index);//input 함수 date 참조전달(공유)객체를알려준다, index 값전달
		   // input(list); 
			//index++;
			// print(list);
			
			//System.out.println("go?(1or0):");
			//exit=scan.nextInt();
		//}while(exit !=1);//()안이 true면 반복  
		
		//ObjectList list2;
		//list2= new ObjectList();
		
	}// main 매소드끝

	private static void print(ObjectList list ) {
		for(int i=0;i<list.size();i++)
			
			System.out.printf("kor:%d,",list.get(i));
		
	}

	private static void input(ObjectList list) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kor:");
		
		list.add(scan.nextInt());
	}

}// Program 클래스끝
