package 가변배열;

import org.omg.CORBA.portable.ValueBase;

public class ObjectList {
	private Object[] data;
	private int index;
	private int max;
	
	
	public ObjectList() {
		max = 3;
		this.data =new Object[max];
		this.index = 0;
	}


	public int size() {
	
		return index;
		
	}


	public void add(Object value) {
		
		if(index>=max) {
			//공간 늘려주기;
			//1.이주할 Object형식배열을 max+5 크기로 temp를 생성.
			Object[] temp;
			temp= new Object[max+5];
		
			//2.data배열의 값들을 temp배열로 옮긴다
			for(int i=0;i<max;i++)
				temp[i]=data[i];
			//3.temp배열의 이름을 data라는 이름으로 변경한다.
			data=temp;
			//4. max의 값을 max+5로 증가시킨다.
			max +=5;
			
			
			
		}
			System.out.println("ObjectList.add()");
		
		
		data[index]=value;
		index++;
		
		
	}
	
	public Object get(int i){
		return data[i];
	}


}
