package 예외;

public class 너무커서반환할수없는예외 extends Exception {
@Override
public String getMessage() {
	
	return "10000을 넘어서 오류발생";
}
}
