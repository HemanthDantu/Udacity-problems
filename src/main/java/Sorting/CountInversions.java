package Sorting;

public class CountInversions {

	public static void main(String[] args) {
		System.out.println(countInversions(new int[] { 7, 5, 3, 1 }));
		System.out.println(countInversionsUsingMergeSort(new int[] { 7, 5, 3, 1 }));
	}

	// O(n^2)
	private static int countInversions(int[] arr) {
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j])
					result++;
			}
		}
		return result;
	}

	// Using mergesort to countInversions
	private static int countInversionsUsingMergeSort(int[] arr) {
		return countInversionsUsingMergeSort(arr, 0, arr.length - 1);
	}

	private static int countInversionsUsingMergeSort(int[] arr, int l, int r) {
		if (l >= r)
			return 0;
		int mid = (l + r) / 2;
		int leftCount = countInversionsUsingMergeSort(arr, l, mid);
		int rightCount = countInversionsUsingMergeSort(arr, mid + 1, r);

		int result = leftCount + rightCount;
		result += mergeTwoSortedHalves(arr, l, mid, mid + 1, r);
		return result;
	}

	private static int mergeTwoSortedHalves(int[] arr, int l, int endLeft, int startRight, int r) {
		int count = 0;
		int leftIndex = l;
		int rightIndex = startRight;

		int sizeOfOutput = (endLeft - l + 1) + (r - startRight + 1);
		int[] output = new int[sizeOfOutput];
		int index = 0;

		while (index < sizeOfOutput) {
			if (arr[leftIndex] <= arr[rightIndex]) {
				output[index] = arr[leftIndex];
				leftIndex++;
			} else {
				count += count + (endLeft - leftIndex + 1);
				output[index] = arr[rightIndex];
				rightIndex++;
			}

			index++;

			if (leftIndex > endLeft) {
				for (int i = rightIndex; i < r + 1; i++) {
					output[index] = arr[i];
					index++;
				}
				break;
			} else if (rightIndex > r) {
				for (int i = leftIndex; i < endLeft + 1; i++) {
					output[index] = arr[i];
					index++;
				}
				break;
			}
		}
		index = l;
		for (int i = 0; i < sizeOfOutput; i++) {
			arr[index] = output[i];
			index++;
		}

		return count;
	}
}
