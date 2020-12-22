package com.prasanth.basicProgs;

public class BasicLogicProgs {

	static String strInput = "jim cary is Awsome actor";

	public static boolean ispalindrome(String input) {
		int size = input.length() - 1;
		for (int i = 0; i < size; i++) {
			if (input.charAt(i) != input.charAt(size - i)) {
				return false;
			}
		}
		return true;
	}

	public static int reverseANumber(int data) {
		if (data < 10) {
			return data;
		}
		int temp = 0;
		while (data > 0) {
			temp = temp * 10 + data % 10;
			data = data / 10;
		}
		return temp;
	}

	public static String reverseString(String str) {
		char[] arr = str.toCharArray();
		int size = str.length() - 1;
		char temp;

		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[size - i];
			arr[size - i] = temp;
		}
		return new String(arr);
	}

	private static boolean isPrime(int num) {
		if (num % 2 == 0) {
			return false;
		}
		for (int i = 3; i < num; i = i + 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static void printFibbnociSeries(int n) {
		int a = 0;
		int b = 0;
		int c = 1;
		while (a < n) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a + "");
		}

	}

	private static String reverseWordsinString(String strInput2) {
		String[] data = strInput2.split(" ");
		strInput2 = "";
		for (int i = 0; i < data.length; i++) {
			strInput2 += reverseString(data[i]) + " ";
		}
		return strInput2;
	}

	public static Integer getPossibleIndex(int[] data, int index, int element) {
		while (data[index] < element && index++ < data.length - 1)
			;
		return index;
	}

	public static void main(String[] args) {

		int[] data = { 1, 3, 4, 5, 7, 9 };
		System.out.println(getPossibleIndex(data, 0, 11));
		for (int i = 2; i < 100; i++) {
			System.out.println("is " + i + " prime ::" + isPrime(i));
		}
		System.out.println(ispalindrome("Amrutha"));
		System.out.println(reverseString("TalkWise"));
		System.out.println(reverseANumber(1234));
		printFibbnociSeries(123);
		System.out.println(reverseWordsinString(strInput));
	}

}
