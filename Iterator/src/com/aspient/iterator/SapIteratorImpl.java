package com.aspient.iterator;

public class SapIteratorImpl implements SapIterator {

	private Object[] arr;
	private int idx;
	public SapIteratorImpl(Object[] arr) {
		super();
		if(arr == null)
			this.arr=new Object[]{};
		this.arr = arr;
	}
	@Override
	public Object getFirst() {
		if(arr.length >0)
			return arr[0];
		return null;
	}
	@Override
	public Object getLast() {
		if(arr.length >0)
			return arr[arr.length-1];
		return null;
	}
	@Override
	public Object getPre() {
		if(idx > 0){
			Object obj=arr[--idx];
			return obj;
		}
		
		return null;
	}
	@Override
	public Object getNext() {
		if(idx < arr.length-1){
			Object obj=arr[++idx];
			return obj;
		}
			
		return null;
	}
	@Override
	public Object get(int index) {
		this.idx=index;
		if(index >= 0 && index < arr.length)
			return arr[index];
		return null;
	}
	@Override
	public void beforeFirst() {
		this.idx=-1;
		
	}
	@Override
	public void afterLast() {
		this.idx=arr.length;
		
	}

	

}
