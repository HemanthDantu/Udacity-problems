package Recursion;

/*    """
    Return reversed input string
    Examples:
       reverse_string("abc") returns "cba"
    Args:
      input(str): string to be reversed
    Returns:
      a string that is the reverse of input
    """*/
public class ReverseString {
	public static String reverseString(String s) {
		if (s.length() <= 1)
			return s;
		return s.substring(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
	}

	public static void main(String[] args) {
		System.out.println(reverseString("abc"));
	}

}

