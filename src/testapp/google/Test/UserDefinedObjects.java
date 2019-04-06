package testapp.google.Test;

import java.util.ArrayList;
import java.util.List;

public class UserDefinedObjects {
	int a;
	public UserDefinedObjects(int a){
		this.a=a;
	}
	
	public int getValue(){
		return a;
	}
	
	public static void main(String[] args) {
		UserDefinedObjects o=new UserDefinedObjects(34);
		UserDefinedObjects o2=new UserDefinedObjects(45);
		List<UserDefinedObjects> li=new ArrayList<UserDefinedObjects>();
		li.add(o);
		li.add(o2);
		System.out.println("size is "+li.size());
//		for (UserDefinedObjects pp : li)
//			System.out.println(pp.getValue());
	
	for (int x=0; x<li.size(); x++){
		System.out.println(li.get(x).getValue());
	}
	}

}
