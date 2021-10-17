package Sorting;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 16, 49, 3, 12, 56, 49, 55, 22, 13, 46, 19, 55, 46, 13, 25, 56, 9, 48, 45 };
		int[] result = bubbleSort(arr);
		for (int i : result) {
			System.out.print(i + " ");
		}

		List<List<Integer>> sleepTimes = new ArrayList<List<Integer>>();
		List<Integer> innerList = new ArrayList<>();
		innerList.add(24);
		innerList.add(13);
		List<Integer> innerList1 = new ArrayList<>();
		innerList1.add(21);
		innerList1.add(55);
		List<Integer> innerList2 = new ArrayList<>();
		innerList2.add(23);
		innerList2.add(20);
		List<Integer> innerList3 = new ArrayList<>();
		innerList3.add(22);
		innerList3.add(5);
		sleepTimes.add(innerList);
		sleepTimes.add(innerList1);
		sleepTimes.add(innerList2);
		sleepTimes.add(innerList3);

		System.out.println(bubbleSort2(sleepTimes));
	}

	private static int[] bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	private static List<List<Integer>> bubbleSort2(List<List<Integer>> input) {

		for (int i = 0; i < input.size(); i++) {
			for (int j = 0; j < input.size() - 1; j++) {
				if (input.get(j).get(0) > input.get(j + 1).get(0) || (input.get(j).get(0) == input.get(j + 1).get(0)
						&& input.get(j).get(1) > input.get(j + 1).get(1)))
					continue;
				List<Integer> temp = new ArrayList<>();
				temp = input.get(j);
				input.remove(j);
				input.add(j + 1,temp);
			}
		}
		return input;
	}

}
