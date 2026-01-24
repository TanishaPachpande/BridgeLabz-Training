package com.exception;

import java.util.Scanner;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int[] arr = {10, 23, 21, 9, 7};
			int index=-1;
			
			if(checkPresence(index, arr)) {
				System.out.println("Value at index "+index+": "+arr[index]);
			}else {
				throw new ArrayIndexOutOfBoundsException("Array is not initialized!");
			}
		}catch(NullPointerException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index!");
		}
	}
	
	public static boolean checkPresence(int index, int[] arr) {
		if(index>=0 && index<=arr.length-1) {
			return true;
		}
		return false;
	}
}
