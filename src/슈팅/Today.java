package ����;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Today {

	
	public static void main(String[] args) {
	 //�迭...�� ��ü��..
	//�����͸� �ĺ��ϴ� ����� ���̸� �ΰ��ִ� �迭��//�ĺ��� :���� �������ִ� Ű
		//1.�����Ͱ� �� �ĺ��ڴ�=>Set �迭
		Set set = new HashSet();
		set.add("hello");
		set.add(37);
		set.add("ȣȣȣ");
		
		for(Object obj : set)
			System.out.println(obj);
		
		
		//2.�������� ������ �� �ĺ��ڴ� =>List �迭
		List list = new ArrayList();
		list.add("hello");
		list.add(37);
		list.add("ȣȣȣ");
		
		
		for(int i=0;i<list.size();i++) 
			System.out.println(list.get(i));
		
		for(Object obj : list)
			System.out.println(obj);
		
		//System.out.println(list.get(0));
		
		
		//3.�������� �ĺ��ڰ� ���� �ִ�. ==>Map�迭
		Map map =new HashMap();
		
		
		
		
		
		
		
	
	}

}
