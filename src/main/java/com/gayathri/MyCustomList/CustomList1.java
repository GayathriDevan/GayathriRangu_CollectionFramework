package com.gayathri.MyCustomList;

import java.util.Arrays;

public class CustomList1<E> {
	private Object elementList[];
	private int sizeOfList=0;
	private static final int capacityOfList=10;
	public CustomList1()
	{
		elementList=new Object[capacityOfList];
	}
	public void addElements(E e)
	{
		if(sizeOfList==elementList.length) {
			increaseCapacity();
		}
		elementList[sizeOfList++]=e;
		}
	@SuppressWarnings("unchecked")
	public E getElement(int i)
	{
		if(i>=sizeOfList||i<0)
		{
			throw new IndexOutOfBoundsException("Index:" +i+",Size"+i);
		}
	return (E) elementList[i];
	}

	@SuppressWarnings("unchecked")
	public E removeElement(int i) {
	    if (i >= sizeOfList || i < 0) {
	        throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	    }
	    Object item = elementList[i];
	    int numberOfRemainingElements = sizeOfList - ( i + 1 ) ;
	    System.arraycopy( elementList, i + 1, elementList, i, numberOfRemainingElements ) ;
	    sizeOfList--;
	    return (E) item;
	}
	public int sizeOfList() {
	    return sizeOfList;
	}
	public String toString() 
	{
	     StringBuilder sb = new StringBuilder();
	     sb.append('[');
	     for(int i = 0; i < sizeOfList ;i++) {
	         sb.append(elementList[i].toString());
	         if(i<sizeOfList-1){
	             sb.append(",");
	         }
	     }
	     sb.append(']');
	     return sb.toString();
	}
	public void  increaseCapacity() {
	    int newSize = elementList.length * 2;
	    elementList = Arrays.copyOf(elementList, newSize);
	}
	 
	 

	}


