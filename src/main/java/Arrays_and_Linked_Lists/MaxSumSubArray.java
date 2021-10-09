package Arrays_and_Linked_Lists;

public class MaxSumSubArray {

	public static int maxSumOfSubArray(int[] arr) {
		if (arr.length == 0)
			return 0;
		int maxSum = arr[0];
		int currSum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			currSum = Integer.max(arr[i], currSum + arr[i]);
			maxSum = Integer.max(maxSum, currSum);
		}

		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(maxSumOfSubArray(new int[] { 1, 2, 3, -4, 6 }));
		System.out.println(maxSumOfSubArray(new int[] { 1, 2, -5, -4, 1, 6 }));
		System.out.println(maxSumOfSubArray(new int[] { -12, 15, -13, 14, -1, 2, 1, -5, 4 }));

	}

}
