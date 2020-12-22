package com.prasanth.datastruct.doublelinkedlist;

import java.util.Arrays;

public class BinaryMainCheck {

	
	public static void main(String[] args) {
		
		BinaryTree<Object> data=new BinaryTree<Object>();
		data.insert("3");
		data.insert("5");
		data.insert(4);
		data.insert(2.3);
		data.insert("l");
		data.insert("e");
		data.insert("y");
		System.out.println(data);
		String str="ABC123";
		System.out.println(Integer.parseInt(str));
		String[] sum = new String[12];
		sum[2]="e";
		sum[3]="r";
		sum[5]="3";
		sum[4]="4";
		sum[6]="4";
		sum[7]="6";
		sum[8]="11";
		sum[9]="23";
		sum[10]="r";
		sum[11]="p";
		sum[1]="h";
		sum[0]="a";
		Arrays.sort(sum);
		for(int i=0;i<sum.length;i++)
		{
			System.out.print( " "+sum[i]+" ");
		}
		System.out.println(sum.toString());
		
	}
}

