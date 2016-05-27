package cn.ucai.day14;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestComparator {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length()==o2.length()){
					return o1.compareTo(o2);
				}
				return o1.length()-o2.length();
			}
		});
		
		set.add("oneabc");
		set.add("onedef");
		set.add("two");
		set.add("twoa");
		set.add("twod");
		set.add("three");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
