package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Problem Statement
Define a procedure, deep_reverse, that takes as input a list, and returns a new list that is the deep reverse of the input list.
This means it reverses all the elements in the list, and if any of those elements are lists themselves, reverses all the elements 
in the inner list, all the way down.

arr =  [1, [2,3], 4, [5,6]]
solution = [ [6,5], 4, [3, 2], 1]*/
public class DeepReverse {

	@SuppressWarnings("unchecked")
	public static <T> List<T> getDeepReverse(List<T> list) {

		List<T> result = new ArrayList<T>();
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i) instanceof List) {
				System.out.println("entered");
				result.add((T) getDeepReverse((List<T>) list.get(i)));
			} else
				result.add(list.get(i));
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(getDeepReverse(Arrays.asList(1, 2, Arrays.asList(5, 6, Arrays.asList(7, 8)))));
	}

}
