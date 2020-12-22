package com.prasanth.basicProgs;

public class HighestOfGivenProducts {

	
	
	public static void main(String[] args) {
		int[] arr1={4,1,7,3,9,11,5};
		int[] arr2={6,11,23,5,7,1,0};
		int[] arr3={12,3,6,2,3,8,10};
		
		System.out.println("max income of arr1 \t"+findMaxIncome(arr1));
		System.out.println("max income of arr2 \t"+findMaxIncome(arr2));
		System.out.println("max income of arr3 \t"+findMaxIncome(arr3));
	}

	private static int findMaxIncome(int[] arr) {
		int a=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>a)
			{
				a=arr[i];
			}
		}
		return a;
	}
}
