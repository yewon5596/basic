package 슈팅;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Today {

	
	public static void main(String[] args) {
	 //배열...의 대체제..
	//데이터를 식별하는 방법에 차이를 두고있는 계열들//식별자 :값을 넣을수있는 키
		//1.데이터가 곧 식별자다=>Set 계열
		Set set = new HashSet();
		set.add("hello");
		set.add(37);
		set.add("호호호");
		
		for(Object obj : set)
			System.out.println(obj);
		
		
		//2.데이터의 순서가 곧 식별자다 =>List 계열
		List list = new ArrayList();
		list.add("hello");
		list.add(37);
		list.add("호호호");
		
		
		for(int i=0;i<list.size();i++) 
			System.out.println(list.get(i));
		
		for(Object obj : list)
			System.out.println(obj);
		
		//System.out.println(list.get(0));
		
		
		//3.데이터의 식별자가 따로 있다. ==>Map계열
		Map map =new HashMap();
		
		
		
		
		
		
		
	
	}

}
