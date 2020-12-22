package com.prasanth.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContinuesTuple {

	public  static int getMyTupleArraylength(int[] A) {

		// solution remmove Non repeted corners
        int size=0;
        int leftFix=0,rightvar=0;
        boolean leftFixFound=false;
		ArrayList<Integer> data=new ArrayList<Integer>();
		for(int i=0;i<A.length;i++)
		{
			data.add(A[i]);
		}
		System.out.println(data.size());
           for(int i=0;i<data.size();i++)
           {
        	   int lastIndex=data.lastIndexOf(data.get(i));
        	   if(!leftFixFound && lastIndex!=leftFix)
        	   {
        		   leftFix=i;
        		   rightvar=lastIndex;
        		   leftFixFound=true;
        	   }else if(lastIndex!=i && rightvar<lastIndex)
        	   {
        		   rightvar=lastIndex;
        	   }
        	 
           }
		return rightvar-leftFix+1;
	}
	
	
	public static void main(String[] args) {
		
//		 int A[]= new int[]{0,5,4,4,5,12};
		int A[]= new int[]{4,2,2,4,2};
		System.out.println(getMyTupleArraylength(A));
	}
}
