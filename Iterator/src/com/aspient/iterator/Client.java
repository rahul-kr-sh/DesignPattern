package com.aspient.iterator;

public class Client {

	public static void main(String[] args) {
		String[] arr={"ram","tom","sam"};
		
		SapIterator it=new SapIteratorImpl(arr);
		
		System.out.println(it.get(22));
		System.out.println(it.getPre());
		System.out.println(it.getNext());
		System.out.println(it.getLast());
		
		
		System.out.println("ascending");
		String str=null;
		it.beforeFirst();
		while((str=(String)it.getNext()) !=null){
			System.out.println(str);
		}
		
		
		System.out.println("descending");
		 str=null;
		it.afterLast();
		while((str=(String)it.getPre()) !=null){
			System.out.println(str);
		}
		

	}

}
