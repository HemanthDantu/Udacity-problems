package StacksAndQueues;

import java.util.List;
import java.util.Stack;

/*# Reverse Polish notation, also referred to as Polish postfix notation is a way of laying out operators and operands.
#
# When making mathematical expressions, we typically put arithmetic operators (like +, -, *, and /) between operands. 
For example: 5 + 7 - 3 * 8
#
# However, in Reverse Polish Notation, the operators come after the operands. For example: 3 1 + 4 *
#
# The above expression would be evaluated as (3 + 1) * 4 = 16
#
# The goal of this exercise is to create a function that does the following:
#
# Given a postfix expression as input, evaluate and return the correct final answer.
 * */
public class PolishNotation {

	public static int polishNotation(String[] input) {
		Stack<Integer> stack = new Stack<>();
		int second, first;
		for (String s : input) {
			if (s.equals("*")) {
				second = stack.pop();
				first = stack.pop();
				int output = first * second;
				stack.push(output);
			} else if (s.equals("/")) {
				second = stack.pop();
				first = stack.pop();
				int output = first / second;
				stack.push(output);
			} else if (s.equals("+")) {
				second = stack.pop();
				first = stack.pop();
				int output = first + second;
				stack.push(output);
			} else if (s.equals("-")) {
				second = stack.pop();
				first = stack.pop();
				int output = first - second;
				stack.push(output);
			} else {
				stack.push(Integer.parseInt(s));
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		System.out.println(polishNotation(new String[] {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
	}

}
