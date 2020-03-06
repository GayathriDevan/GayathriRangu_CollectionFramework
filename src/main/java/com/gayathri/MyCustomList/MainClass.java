package com.gayathri.MyCustomList;

public class MainClass {
	public static void main(String[] args) {
CustomList1<Integer> list=new CustomList1<Integer>();
list.addElements(1);
list.addElements(2);
list.addElements(4);
System.out.println(list);
list.removeElement(2);
System.out.println(list);
System.out.println(list.getElement(2));
System.out.println(list.getElement(1));
System.out.println(list.sizeOfList());
	}

}
