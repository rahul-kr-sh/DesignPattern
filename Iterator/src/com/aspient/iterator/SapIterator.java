package com.aspient.iterator;

public interface SapIterator {

	Object getFirst();
	Object getLast();
	Object getPre();
	Object getNext();
	Object get(int index);
	void beforeFirst();
	void afterLast();
	
}
