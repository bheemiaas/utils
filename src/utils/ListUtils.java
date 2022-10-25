package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListUtils<T extends Comparable<T>> {
	List<T> list;
	ArrayUtils<T> au=new ArrayUtils<>();
	
	public void createList(T... x) {
		list=Arrays.asList(x);
		au.createArray(x);
	}
	
	public T[] toArray() {
		return au.array();
	}
	
	public List<T> desc(){
		Collections.sort(list);
		Collections.reverse(list);
		return list;
	}
	
	public List<T> getUnique() {
		List<T> list2=new ArrayList<>();
		for(T x:list) {
			if(!list2.contains(x))
				list2.add(x);
		}
		return list2;
	}
	
	public int count(T x) {
		int c=0;
		for(T i:list)
			if(i==x)
				c++;
		return c;
	}
	
	
}
