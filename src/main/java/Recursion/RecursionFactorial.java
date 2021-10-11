package Recursion;

/*Calculate n!
    Args:
       n(int): factorial to be computed
    Returns:
       n!*/
public class RecursionFactorial {

	public static int factorial(int n) {
		if (n == 1)
			return 1;
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(factorial(6));

	}

}