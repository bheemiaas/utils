package utils;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class Array<T> {
	T[] array;
	String type;
	
	Array(){
		if(array instanceof Integer[]) {
			type="Integer";
			array=(T[]) new Integer[0];
		}
		else if(array instanceof Float[]) {
			type="Float";
			array=(T[]) new Float[0];
		}
		else if(array instanceof String[]) {
			type="String";
			array=(T[]) new String[0];
		}
		else {
			array=(T[]) new Object[0];
			
		}
			
	}
	
	public int getLength() {
		return array.length;
	}
	
	public void loadValue(T x) {
		List<T> list=Arrays.asList(array);
		System.out.println(list);
		list.add(x);
		array=list.toArray(array);
	}

}
