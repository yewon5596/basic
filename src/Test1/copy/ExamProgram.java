package Test1.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExamProgram {// ExamProgram class ����
	public static void main(String[] args) throws IOException {// main method ����

		FileInputStream fin = new FileInputStream("src/res/data.txt");
		// �ܺ� ���ϰ������� FileInputStream ���� fin ��ü����
		Scanner fscan = new Scanner(fin);
		// data.txt������ �������ִ� ������(����)�� ������������ ��ĳ�ʻ��

		int[] nums = new int[100];
		// �迭 nums�� 100������

		// ������ �ϰ� �ε�(load)
		// nums[0] = fscan.nextInt();
		// nums[1] = fscan.nextInt();

//		int i=0;
//		while(fscan.hasNext()) {
//			nums[i]=fscan.nextInt();
//		    i++;}

		for (int i = 0; fscan.hasNext(); i++) {
			//t�� ������   hasNext�� booleanŸ������ ��t/f ���������ð��������� t �����ð��̾����� f 
			//i�� 0�϶� fscan��ü�� ���������ð��� ������ i�� �����ϰ� {}�ݺ��Ѵ�
		
			
			nums[i] = fscan.nextInt();
			//�迭 nums�� fscan���� ���� �ҷ��ö� 
			nums[i + 1] = -1;
		}

		fin.close();
		// �����ʹ� �α� �Ǿ���.
		// �迭�� ����ϸ� �ϰ��ε��Ͽ� ����Ҽ��ִ�.
		

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
//		System.out.printf("avg:%f\n", avg);--->�̹���� �ӵ��� ������ ��������������� �����ڵ�� �ƴϴ�
		//�����Ͱ���============================================
		int count = 0;
		for (int i = 0; nums[i] != -1; i++) {
			count++;
			
		}
		//�������� ��===========================================
		
		int sum = sum(nums);
		
	
	
		//���������===========================================
		
		printSumAndAvg(sum,count);
		
		
		//����� ��������ϴ¹��
		
		
		
		

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

