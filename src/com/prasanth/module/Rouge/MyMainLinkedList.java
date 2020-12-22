package com.prasanth.module.Rouge;

public class MyMainLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListStruct<Integer> data=new LinkedListStruct<Integer>();
		
		data.add(1);
		data.add("ada");
		data.add(3);
		data.add(4);
		data.add(5);
		data.add(6);
		data.add(7);
		data.add(8);
		data.add(9);
		data.getLinkedList();
		System.out.println("last"+data.getTail());
		System.out.println("length"+data.getLength());
       System.out.println(data.clone().getTail());
	}

}
