package Sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	private static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int p = partition(arr, low, high);
			quickSort(arr, low, p - 1);
			quickSort(arr, p + 1, high);
		}
	}

	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	private static int getPivot(int low, int high) {
		Random rand = new Random();
		return rand.nextInt((high - low) + 1) + low;
	}

	private static int partition(int[] arr, int low, int high) {
		swap(arr, low, getPivot(low, high));
		int border = low + 1;
		for (int i = border; i <= high; i++) {
			if (arr[i] < arr[low]) {
				swap(arr, i, border++);
			}
		}
		swap(arr, low, border - 1);
		return border - 1;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 8, 3, 1, 7, 0, 10, 2 };
		System.out.println(Arrays.toString(arr));

		quickSort(arr);
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
