package �����迭;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		//ObjectList list = new ObjectList();
		Gist<Exam> Gist = new Gist<>();
		//������ ��� ����? �����ϼ� �մ�.
		list.add("hello");
		list.add(30);
		list.add(new Exam());
		
		//���� �Լ��� ����Ϸ���? ������ ��ȯ�ؾ� �Ѵ�.
		//((Exam)list.get(2)).input();
		 Gist.get(2).input();
		//list.get(2).input();
		
		
		
		
		
		
		
		//ObjectList list;
	
		//Object[] data = new Object[3];//Objec[]data 3���� �׸��� ��Ҵ� ����
		//int index = 0;
		//int exit=0;//for���� �ݺ��ϱ����� �������
		
		//Scanner scan = new Scanner(System.in);
		//list= new ObjectList();
		
		//do {
		     //input(data,index);//input �Լ� date ��������(����)��ü���˷��ش�, index ������
		   // input(list); 
			//index++;
			// print(list);
			
			//System.out.println("go?(1or0):");
			//exit=scan.nextInt();
		//}while(exit !=1);//()���� true�� �ݺ�  
		
		//ObjectList list2;
		//list2= new ObjectList();
		
	}// main �żҵ峡

	private static void print(ObjectList list ) {
		for(int i=0;i<list.size();i++)
			
			System.out.printf("kor:%d,",list.get(i));
		
	}

	private static void input(ObjectList list) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kor:");
		
		list.add(scan.nextInt());
	}

}// Program Ŭ������
