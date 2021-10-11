package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPermutations {

	/*
	 * # Given a list of items, the goal is to find all of the permutations of that
	 * list. For example, if given a list like: ["apple", "water"], you could create
	 * two permutations from it. One in the form of the original input and one in
	 * the reversed order like so: ["water","apple"]
	 * 
	 * Return a list of permutations Examples: permute([0, 1]) returns [ [0, 1], [1,
	 * 0] ] Args: l(list): list of items to be permuted Returns: list of permutation
	 * with each permuted item be represented by a list
	 */

	public static <T> List<List<T>> getPermutationsOfDistinctItems(List<T> nums) {
		List<List<T>> result = new ArrayList<>();

		getPermutations(nums, result, new ArrayList<>());

		return result;
	}

	private static <T> void getPermutations(List<T> nums, List<List<T>> result, List<T> arr) {

		if (arr.size() == nums.size()) {
			result.add(new ArrayList<>(arr));
			return;
		}
		for (int i = 0; i < nums.size(); i++) {
			if (arr.contains(nums.get(i))) {
				continue;
			}
			arr.add(nums.get(i));
			getPermutations(nums, result, arr);
			arr.remove(arr.size() - 1);
		}

	}

	public static void main(String[] args) {
		System.out.println(getPermutationsOfDistinctItems(Arrays.asList(1, 2, 3)));
		System.out.println(getPermutationsOfDistinctItems(Arrays.asList("Apple", "Banana", "Grapes")));
		System.out.println(getPermutationsOfDistinctItems(Arrays.asList(1)));
		System.out.println(getPermutationsOfDistinctItems(Arrays.asList()));
		System.out.println(getPermutationsOfDistinctItems(Arrays.asList(1, "abc", Arrays.asList(2, 3))));

	}

}
