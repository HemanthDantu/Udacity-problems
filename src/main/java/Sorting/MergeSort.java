package Sorting;

public class MergeSort {

	public static void mergeSort(int[] arr, int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;

			mergeSort(arr, l, mid);
			mergeSort(arr, mid + 1, r);

			merge(arr, l, mid, r);
		}
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		int sizeOfArr1 = mid - l + 1;
		int sizeOfArr2 = r - mid;

		int left[] = new int[sizeOfArr1];
		int right[] = new int[sizeOfArr2];

		for (int i = 0; i < sizeOfArr1; i++) {
			left[i] = arr[l + i];
		}
		for (int i = 0; i < sizeOfArr2; i++) {
			right[i] = arr[mid + 1 + i];
		}

		int i = 0, j = 0, k = l;

		while (i < sizeOfArr1 && j < sizeOfArr2) {
			if (left[i] < right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}

		while (i < sizeOfArr1) {
			arr[k] = left[i];
			i++;
			k++;
		}

		while (j < sizeOfArr2) {
			arr[k] = right[j];
			j++;
			k++;
		}

	}

	public static void main(String args[]) {
		int[] arr = new int[] { 8, 3, 1, 7, 0, 10, 2 };
		mergeSort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
