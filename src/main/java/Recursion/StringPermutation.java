package Recursion;

import java.util.ArrayList;
import java.util.List;

/*Problem Statement
Given an input string, return all permutations of the string in an array.

Example 1:

string = 'ab'
output = ['ab', 'ba']
Example 2:

string = 'abc'
output = ['abc', 'bac', 'bca', 'acb', 'cab', 'cba']*/
public class StringPermutation {

	public static List<String> getPermutationsOfString(String s) {
		if (s.length() == 0) {
			List<String> result = new ArrayList<>();
			result.add("");
			return result;
		}
		
		char ch = s.charAt(0);
		String rem = s.substring(1);
		
		List<String> remRes = getPermutationsOfString(rem);
		List<String> result = new ArrayList<String>();
		
		for(int i= 0; i<remRes.size(); i++) {
			String str = remRes.get(i);
			for(int j = 0; j<= str.length(); j++) {
				String resString = str.substring(0, j)+ch+str.substring(j);
				result.add(resString);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(getPermutationsOfString("hemanth"));
	}

}
