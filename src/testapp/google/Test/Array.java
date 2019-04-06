package testapp.google.Test;

import java.util.ArrayList;
import java.util.List;

public class Array {
	public static void main(String[] args) {
		int[] b=new int[3];
		int ab;
		List<Integer> li=new ArrayList<Integer>();
		li.add(98); li.add(11);
		li.add(11);
		li.add(246);
		li.add(534);
		for (Integer i : li)
			System.out.println(i);
	}
}
