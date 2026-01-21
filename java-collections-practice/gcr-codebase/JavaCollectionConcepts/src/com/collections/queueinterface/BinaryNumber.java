package com.collections.queueinterface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		Queue<String> q = new LinkedList<>();
		
		for(int i=1; i<=n; i++) {
			q.offer(Integer.toBinaryString(i));
		}
		System.out.println(q);
	}
}
