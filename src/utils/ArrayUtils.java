package utils;

import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class ArrayUtils<T>{
	private T array[];
	
	public T[] array() {
		return array;
	}
	
	public void createArray(T... x) {
		array=x;
	}
	
	public List<T> getArray() {
		return Arrays.asList(array);
	}
	
	public int indexOf(T x) {
		for(int i=0;i<array.length;i++)
			if(array[i]==x)
				return i;
		return -1;
	}
	
	public String getArrayType() {
		if(array instanceof Integer[])
			return "integer";
		else if(array instanceof Float[]) 
			return "float";
		else if(array instanceof String[])
			return "String";
		else
			return "other";
	}
	
	
	
	

}
