package Recursion;

/*Given an array arr and a target element target, find the last index of occurence of target in arr using recursion.
 *  If target is not present in arr, return -1.

For example:

For arr = [1, 2, 5, 5, 4] and target = 5, output = 3

For arr = [1, 2, 5, 5, 4] and target = 7, output = -1*/
public class LastIndexRecursion {

	public static int lastIndexRecursion(int[] arr, int target) {
		int output = lastIndexRecursion(arr, target, arr.length - 1);
		return output;
	}

	private static int lastIndexRecursion(int[] arr, int target, int i) {
		if (i < 0)
			return -1;
		if (arr[i] == target)
			return i;
		int output = lastIndexRecursion(arr, target, i - 1);
		return output;
	}

	public static void main(String args[]) {
		System.out.println(lastIndexRecursion(new int[] { 1, 3, 5, 8, 4, 6 }, 5));
	}
}
