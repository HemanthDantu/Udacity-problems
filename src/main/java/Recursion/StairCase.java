package Recursion;

/*Problem Statement
Suppose there is a staircase that you can climb in either 1 step, 2 steps, or 3 steps. 
In how many possible ways can you climb the staircase if the staircase has n steps? Write a recursive function to solve the problem.

Example:

n = 3
output = 4
The output is 4 because there are four ways we can climb the staircase:

1. 1 step +  1 step + 1 step
2. 1 step + 2 steps 
3. 2 steps + 1 step
4. 3 steps*/

public class StairCase {

	public static int stairCase(int n) {

		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else if (n == 2)
			return 2;
		else if (n == 3)
			return 4;

		int output = stairCase(n - 1) + stairCase(n - 2) + stairCase(n - 3);
		return output;

	}

	// nonrecursive
	public static int getStairCaseCombo(int n) {
		if (n == 1)
			return 1;
		int first = 1;
		int second = 2;
		int third = 4;
		for (int i = 4; i <= n; i++) {
			int forth = first + second + third;
			first = second;
			second = third;
			third = forth;
		}
		return third;
	}

	public static void main(String[] args) {
		System.out.println(stairCase(35));
		System.out.println(getStairCaseCombo(35));
	}

}
