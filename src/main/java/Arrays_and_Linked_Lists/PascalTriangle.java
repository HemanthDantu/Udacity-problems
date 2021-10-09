package Arrays_and_Linked_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

//	# Problem Statement
//	# Find and return the nth row of Pascal's triangle in the form a list. n is 0-based.
//	#
//	# For exmaple, if n = 4, then output = [1, 4, 6, 4, 1].

	public static List<Integer> getRow(int rowIndex) {
		Integer[] row = new Integer[rowIndex + 1];
		Arrays.fill(row, 0);
		row[0] = 1;

		for (int i = 1; i <= rowIndex; i++) {
			for (int j = i; j >= 1; j--) {
				row[j] = row[j] + row[j - 1];
				System.out.println(row[j]);
			}
		}
		return Arrays.asList(row);
	}

	public static List<List<Integer>> getPascalTriangle(int n) {
		List<List<Integer>> result = new ArrayList<>();
		result.add(new ArrayList<>());
		result.get(0).add(1);

		for (int i = 1; i < n; i++) {
			List<Integer> row = new ArrayList<>();
			List<Integer> prevRow = result.get(i - 1);

			row.add(1);

			for (int j = 1; j < i; j++) {
				row.add(prevRow.get(j - 1) + prevRow.get(j));
			}
			row.add(1);
			result.add(row);
		}
		return result;
	}

	public static void main(String args[]) {
		System.out.println(getPascalTriangle(5));
		System.out.println(getRow(5));

	}
}
