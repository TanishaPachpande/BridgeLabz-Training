package com;
import java.util.Stack;
import java.util.Scanner;

public class ValidParenthesis {
	public static boolean isValid(String s) {
        boolean ans=true;
        Stack<Character> stk =new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){
                stk.push(ch);
            }else if(ch==')' || ch=='}' || ch==']'){
                if(stk.isEmpty()){
                    return false;
                }

                char top=stk.pop();
                if((ch==')' && top!='(') || (ch=='}' && top!='{') || (ch==']' && top!='[')){
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(isValid(s));
	}
}
