package �����迭;

import org.omg.CORBA.portable.ValueBase;
//oo
public class Gist<����> {
	private ����[] data;
	private int index;
	
	private int max;
	
	
	public Gist() {
		max = 3;
		this.data = (����[])new Object[max];
		this.index = 0;
	}


	public int size() {
	
		return index;
		
	}


	public void add(Object value) {
		
		if(index>=max) {
			//���� �÷��ֱ�;
			//1.������ Object���Ĺ迭�� max+5 ũ��� temp�� ����.
			����[] temp;
			temp= (����[]) new Object[max+5];
		
			//2.data�迭�� ������ temp�迭�� �ű��
			for(int i=0;i<max;i++)
				temp[i]=data[i];
			//3.temp�迭�� �̸��� data��� �̸����� �����Ѵ�.
			data=temp;
			//4. max�� ���� max+5�� ������Ų��.
			max +=5;
			
			
			
		}
			System.out.println("ObjectList.add()");
		
		
		data[index]=(����) value;
		index++;
		
		
	}
	
	public Object get(int i){
		return data[i];
	}


}
