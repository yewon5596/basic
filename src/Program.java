import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

//Program class s.
public class Program {
    //main method s
	public static void main(String[] args) throws IOException {
		//10���� �迭 ����� 
		int[] nums = new int[10];

		// InputStream/OutputStream

		

		//������ǲ��ũ�� ��ü�� fin�̸� �����ϱ�
		FileInputStream fin = new FileInputStream("C:\\eclipse\\workspace\\basic\\src\\Test1\\data.txt");
		//�Է¿��� ��������� �������� ��ĳ�� fin ����
		Scanner fscan = new Scanner(fin);
		//num�̶�� ���� ����,0���� �ʱ�ȭ
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
		//sum�̶�� ��������,0���� �ʱ�ȭ
		int sum = 0;
		//cnt��� ��������, 0���� �ʱ�ȭ
		int cnt=0;
		//avg��� ��������,0���� �ʱ�ȭ
		float avg = 0;
        //while �ݺ������ ����
		while (fscan.hasNext()) {
			//num�� nextInt�� ����
			num = fscan.nextInt();
			//System.out.println("n: "+num);
			//cnt�� cnt+1�� ����
			cnt= cnt+1;
			//System.out.println("cnt : "+cnt);
			//sum�� num+sum������
			sum = num + sum;
			
		}
		//avg�� ���������� �������� ������
		avg= (float)sum/cnt;
		

		System.out.println(sum);
		System.out.println(avg);
		

		fscan.close();
		fin.close();

	}

}
