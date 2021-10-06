package Arrays_and_Linked_Lists;

public class FindDuplicate {
//	# Problem Statement
//	# You have been given an array of length = n. The array contains integers from 0 to n - 2. 
	//Each number in the array is present exactly once except for one number which is present twice.
	//Find and return this duplicate number present in the array
//	#
//	# Example:
//	#
//	# arr = [0, 2, 3, 1, 4, 5, 3]
//	# output = 3 (because 3 is present twice)
	
	public static int duplicate(int arr[]) {
		int currSum = 0;
		int expSum = 0;
		
		for(int i : arr) {
			currSum = currSum+i;
		}
		
		for(int i=0; i<arr.length-1;i++) {
			expSum = expSum+i;
		}
		
		return currSum-expSum;
	}
	
	public static void main(String args[]) {
		System.out.println(duplicate(new int[] {0, 2, 3, 1, 4, 5, 3}));
		System.out.println(duplicate(new int[] {0, 0}));
		System.out.println(duplicate(new int[] {0, 1, 5, 5, 3, 2, 4}));
		System.out.println(duplicate(new int[] {0, 1, 5, 4, 3, 2, 0}));
		System.out.println(duplicate(new int[] {}));


	}
	
}
