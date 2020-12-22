package com.prasanth.module.Rouge;



public class MyMainLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListStruct<Integer> data=new LinkedListStruct<Integer>();
		
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(4);
		data.add(5);
		data.add(6);
		data.add(7);
		data.add(8);
		data.add(9);
		data.reverseListToKposition(5);
		data.getLinkedList();
		System.out.println("done");
//		System.out.println("last"+data.getTail());
//		System.out.println("length"+data.getLength());
//        System.out.println(data.clone().getTail());
//		LinkedListStruct<Integer> data2=new LinkedListStruct<Integer>();
//		data2.add('a');
//		data2.add('b');
//		data2.add('c');
//		data2.add('d');
//		data2.add('e');
//		data2.add('f');
//		data2.add('g');
//		data2.add('h');
//       data.insertAlternatev2(data2);
////       data2.getLinkedList();
//       data.getLinkedList();
       
	}

} 
