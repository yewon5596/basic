package 예외;

public class Program {

	public static void main(String[] args) {

		try {
			Thread.sleep(1000);
			int sum = Calculator.add(10004, 3);
			System.out.print("sum:" + sum);
		}

		catch (너무커서반환할수없는예외 e) {
				System.out.println("aaa"+e.getMessage());
				//파일을 닫아야 하는 코드 

			} 

		catch (Exception aaa) {
			System.out.println("죄송");
			//파일을 닫아야 하는 코드 

		}
		finally {
			//파일을 닫아야 하는 코드 
			System.out.println("finally....");
		}

		System.out.println("종료되었나?");

	}

}
