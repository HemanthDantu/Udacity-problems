package StacksAndQueues;

import java.util.Stack;

/*# In this exercise you are going to apply what you learned about stacks with a real world problem. 
 * We will be using stacks to make sure the parentheses are balanced in mathematical expressions such as: ((32+8)∗(5/2))/(2+6). 
 * In real life you can see this extend to many things such as text editor plugins and interactive development environments for 
 * all sorts of bracket completion checks.
#
# Take a string as an input and return True if it's parentheses are balanced or False if it is not.*/
public class BalancedParanthesis {

	public static boolean isBalancedParanthesis(String s) {
		Stack<Character> charStack = new Stack<Character>();
		char[] chArray = s.toCharArray();
		for(char ch: chArray) {
			if((ch == ')' && !charStack.isEmpty()) && charStack.peek() == '(')
				charStack.pop();
			else if((ch == '}' && !charStack.isEmpty()) && charStack.peek() == '{')
				charStack.pop();
			else if((ch == ']' && !charStack.isEmpty()) && charStack.peek() == '[')
				charStack.pop();
			else 
				charStack.push(ch);
		}
		return charStack.empty();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
