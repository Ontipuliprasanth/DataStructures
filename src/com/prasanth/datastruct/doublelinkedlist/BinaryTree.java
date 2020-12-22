package com.prasanth.datastruct.doublelinkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {

	private Node<?> root;
	private int height;
	
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}

	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}


	@SuppressWarnings("unchecked")
	public void insert(T data) {

		if (root == null) {
			root = new Node<T>(data);
			return;
		}
		
		Node<T> temp = new Node<T>(data);
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while (!q.isEmpty()) {
			temp = q.peek();
			q.remove();

			if (temp.left == null) {
				temp.left = new Node(data);
				break;
			} else
				q.add(temp.left);

			if (temp.right == null) {
				temp.right = new Node(data);
				break;
			} else
				q.add(temp.right);
		}
	}

  private  boolean isGreater(T data,T dataInput) {
		if(data  instanceof String) {
			
		}

		return false;
	}




	private class Node<T>{
		private T data;
		private Node<?> left;
		private Node<?> right;
		public Node(T data) {
			super();
			this.data=data;
		}
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public Node<?> getLeft() {
			return left;
		}
		public void setLeft(Node<?> left) {
			this.left = left;
		}
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			this.right = right;
		}
	
	}
}
