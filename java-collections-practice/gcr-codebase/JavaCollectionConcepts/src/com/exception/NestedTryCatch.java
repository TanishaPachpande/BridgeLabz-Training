package com.exception;

public class NestedTryCatch {
	public static void main(String[] args) {
		try {
			int[] arr = {2, 89, 12, 10, 72};
			int divisor=2;
			int index=3;
			
			if(index<0 && index>=arr.length) {
				throw new ArrayIndexOutOfBoundsException("Invalid Array Index!");
			}
			
			if(divisor==0) {
				throw new ArithmeticException("Cannot divide by Zero!");
			}
			
			if(arr[index]%divisor==0) {
				System.out.println(arr[index]/divisor);
			}
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
