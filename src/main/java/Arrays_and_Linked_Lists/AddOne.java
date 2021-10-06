package Arrays_and_Linked_Lists;

public class AddOne {

//# Problem Statement
//# You are given a non-negative number in the form of list elements. For example, the number 123 would be provided as arr = [1, 2, 3]. Add one to the number and return the output in the form of a new list.
//#
//# Example 1:
//#
//# input = [1, 2, 3]
//# output = [1, 2, 4]
//# Example 2:
//#
//# input = [9, 9, 9]
//# output = [1, 0, 0, 0]

	public static int[] addOne(int arr[]) {
		int len = arr.length;
		for (int i = len - 1; i >= 0; i--) {
			if (arr[i] < 9) {
				arr[i] = arr[i] + 1;
				return arr;
			} else {
				arr[i] = 0;
			}
		}

		int[] newArr = new int[len + 1];
		newArr[0] = 1;
		return newArr;
	}

	public static void main(String args[]) {
//		int[] result = addOne(new int[] { 9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9 });
		int[] result = addOne(new int[] { 1,2,9});


		for (int i : result) {
			System.out.print(i + " ");
		}

	}
}
