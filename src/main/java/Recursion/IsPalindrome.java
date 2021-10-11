package Recursion;

/*    """
    Return True if input is palindrome, False otherwise.
    Args:
       input(str): input to be checked if it is palindrome
    """*/
public class IsPalindrome {

	public static boolean isPalindrome(String s) {
		if (s.length() == 1 || s.length() == 0)
			return true;
		else if (s.length() == 2) {
			return s.charAt(0) == s.charAt(1);
		} else {
			boolean output = (s.charAt(0) == s.charAt(s.length() - 1)) & (isPalindrome(s.substring(1, s.length() - 1)));
			return output;
		}
	}

	public static void main(String[] args) {
		System.out.println("abc:"+isPalindrome("abc"));
		System.out.println("madam:"+isPalindrome("madam"));
		System.out.println("abba:"+isPalindrome("abba"));
		System.out.println("a:"+isPalindrome("a"));

	}

}
