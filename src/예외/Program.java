package ����;

public class Program {

	public static void main(String[] args) {

		try {
			Thread.sleep(1000);
			int sum = Calculator.add(10004, 3);
			System.out.print("sum:" + sum);
		}

		catch (�ʹ�Ŀ����ȯ�Ҽ����¿��� e) {
				System.out.println("aaa"+e.getMessage());
				//������ �ݾƾ� �ϴ� �ڵ� 

			} 

		catch (Exception aaa) {
			System.out.println("�˼�");
			//������ �ݾƾ� �ϴ� �ڵ� 

		}
		finally {
			//������ �ݾƾ� �ϴ� �ڵ� 
			System.out.println("finally....");
		}

		System.out.println("����Ǿ���?");

	}

}
