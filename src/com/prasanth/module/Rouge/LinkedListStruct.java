package com.prasanth.module.Rouge;

import java.io.Serializable;


public class LinkedListStruct<T> implements Serializable, Cloneable {
	private static final long serialVersionUID = -8956337161364858688L;
    
	
	private Node<T> head;
	private Node<T> tail;
	private Integer length=0;
	
	
	public Node<T> getHead() {
		return head;
	}
	
	@SuppressWarnings({ "unchecked", "unused" })
	private LinkedListStruct<T> cloneLinkedListStruct()
	{
		  try {
			return (LinkedListStruct<T>) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
    public LinkedListStruct<T> clone()
    {
    	return this.cloneLinkedListStruct();
    }
	public void setHead(Node<T> head) {
		this.head = head;
	}

	public <T> Object getTail() {
		if(tail.data==null)
		{
			return null;
		}
		return tail.data;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public  Integer getLength() {
		return length;
	}

	public  void setLength(Integer length) {
		this.length = length;
	}

	@SuppressWarnings("unchecked")
	public <T> void add(Object data)
	{
		if(data==null)
		{
			return;
		}
		data.getClass();
		Node newElement=new Node<>();
		Node temp=new Node<>();

		newElement.setData(data);
		if(this.head==null)
		{
			head=newElement;
			
		}else{
			 temp =head;
			while (temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newElement;
            newElement.Prev=temp; 
		}
		tail=temp.next;
		length++;
	}
	//dispaly details
	public void getLinkedList()
	{
		Node temp=head;
		while(temp!=null){
		Node dataP=temp.getPrev();
		Node dataN=temp.getNext();
		Object prevData=null;
		Object nextData=null;
		if(dataP!=null)
		{
			 prevData=temp.getPrev().getData();
		}
		if(dataN!=null)
		{
			nextData=temp.getNext().getData();
		}
		System.out.println("current"+temp.getData()+"  prev"+prevData+"  next"+nextData);
		temp=temp.next;
		}
	}

	

	
	public void reverseLinkedList() {
		
              
		this.head=reverseLinkedList(this.head);
	}
	private Node reverseLinkedList(Node head) {
		
		Node temp=null;
		while(head!=null)
		{
			Node next=head.next;
			head.next=temp;
			temp=head;
			head=next;
		}
		
		System.out.println("done");
		return temp;
	}
	
	@SuppressWarnings("unchecked")
	public LinkedListStruct<T> insertAlternatev2(LinkedListStruct<?> data) {
		Node<Integer> l1 = (LinkedListStruct<T>.Node<Integer>) this.getHead();
		Node<Integer> l2 = (LinkedListStruct<T>.Node<Integer>) data.getHead();
		Node<Integer> hold = null;

//		Boolean flagSwitch = true;
		while (l1.getNext() != null && l2.getNext() != null) {
			hold = l1.next;
			l1.next = l2;
			l1 = l2;
			l2 = hold;

		}
		return this;
	}
	
	public void reverseListToKposition(int k)
	{
		  Node temp=this.head;
		  if(k==0)
		  {
			  reverseLinkedList();
			  return;
		  }
		  
		  try {
			  
		  while(temp.getNext()!=null && k>0)
		  {
			  temp=temp.getNext();
			  k--;
		  }
		  temp.next=reverseLinkedList(temp.next);
		  }catch(NullPointerException nulP)
		  {
			  nulP.printStackTrace();
			  System.out.println(k+"value is greater than length"+this.length);
		  }
		  
		
	}
	
	
	public LinkedListStruct<T> insertAlternate(LinkedListStruct<T> data)
	{
		Node<T> hold=this.getHead();
		Node<T> l1=hold;
		Node<T> l2=data.getHead();
		Boolean flagSwitch=true;
		while(l1.getNext()!=null && l2.getNext()!=null)
		{
			if(flagSwitch)
			{
				
				hold.setNext(l2.getNext());
				hold=l1.getNext();
			}else
			{
				hold.setNext(l1.getNext());
				hold=l2.getNext();
			}
			flagSwitch=!flagSwitch;
		}
		return null;
	}
	
	
	
/// do not touch	
	
	private class Node<T>
	{
		T data;
		Node next;
		Node Prev;
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public Node getPrev() {
			return Prev;
		}
		public void setPrev(Node prev) {
			Prev = prev;
		}
	}
	
}
