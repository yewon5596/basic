package Test3;

import java.util.Scanner;

public class ExamKEM {
	public static void main(String[] args) {
		
		ExamProgram a;//����//�̸�ǥ����//���������δ°��� (��������)������ �������δ� �����̾��ٰ�
		a= new ExamProgram();//�����Ͱ��� ������ʱ�ȭ//�̸��� �������̰����Ѵ�
		                      //�Լ��� ������ ���ι� //�Լ������ ���ξ�
		ExamProgram b = new ExamProgram();
		//a.kor=3; -->�����߻� ĸ���� ������.
		//ExamProgram a =  new ExamProgram();
	//1. ������ �Է¹޴��Լ�
		ExamProgram.input(a);//-->������ �˷��ִ°ͻ� ���� �����ϴ°Ǿƴϴ�
		                     //
		                     //�ܺο� �ִ� �Լ��� �����ö��� �տ� ������ Ŭ�������� ���δ�.
		a.input();//�ν��Ͻ��Լ�//��ü���� ����ϴ��Լ�-�ǹ�//������Ȯ
		            
	//2.������ ��¹޴� �Լ�
		ExamProgram.print(a);
		
		
	
	}
//���� ������ �а�	

	
}


