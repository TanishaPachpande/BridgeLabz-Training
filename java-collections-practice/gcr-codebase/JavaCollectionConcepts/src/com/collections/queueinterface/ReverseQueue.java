package com.collections.queueinterface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		Stack<Integer> stk = new Stack<>();
		stk.add(10);
		stk.add(20);
		stk.add(30);
	
		int n=stk.size();
		for(int i=0; i<n;i++) {
			q.add(stk.pop());
		}
		
		System.out.println("Reversed Queue: "+ q);
	}
}
