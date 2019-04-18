package testing;

import java.util.ArrayList;
import java.util.List;

import classes.ListCut;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListCut lc = new ListCut();
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(7);l.add(0);l.add(2);l.add(5);l.add(9);l.add(5);l.add(8);l.add(100);l.add(7);l.add(0);l.add(2);l.add(5);l.add(9);l.add(5);l.add(8);l.add(100);
		System.out.println(l);
		System.out.println(lc.partition(l, 8));
		
		
		
		
		

	}

}
