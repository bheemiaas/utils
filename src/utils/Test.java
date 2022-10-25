package utils;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ArrayUtils<Integer> ia=new ArrayUtils<>();
		ia.createArray(12,34,23,12,55,99);
		System.out.println(ia.getArray());
		System.out.println(ia.indexOf(50));
		System.out.println(ia.getArrayType());
		
		ArrayUtils<String> sa=new ArrayUtils<>();
		sa.createArray("vinay","kiran");
		System.out.println(sa.getArrayType());
		
		ListUtils<Integer> il=new ListUtils<>();
		il.createList(12,23,34,21,23,12,12,21,55);
		Integer ar[]=il.toArray();
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
		System.out.println(il.desc());
		System.out.println(il.getUnique());
		System.out.println(il.count(12));*/
		
		Array<Stud> iv=new Array<>();
		System.out.println(iv.getLength());
		/*iv.loadValue(25);
		for(int x:iv.array)
			System.out.println(x);*/
		System.out.println(iv.type);
	}

}
