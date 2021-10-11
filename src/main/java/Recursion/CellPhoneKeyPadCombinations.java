package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. 
 * Return the answer in any order.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

*/
public class CellPhoneKeyPadCombinations {

	private static List<String> result = new ArrayList<String>();
	private static Map<Character, String> numberLetterMap = Map.of('2', "abc", '3', "def", '4', "ghi", '5', "jkl", '6', "mno",
			'7', "pqrs", '8', "tuv", '9', "wxyz");
	private static String phoneDigits;
	
	public static List<String> getStringCombinationsOfKeys(String num){
		if(num.length() == 0)
			return result;
		
		phoneDigits = num;
		helper(0, new StringBuilder());
		return result;
	}

	private static void helper(int index, StringBuilder tempResult) {
		if(tempResult.length() == phoneDigits.length()) {
			result.add(tempResult.toString());
			return;
		}
		
		String possibleLetters = numberLetterMap.get(phoneDigits.charAt(index));
		for(char ch : possibleLetters.toCharArray()) {
			tempResult.append(ch);
			helper(index+1, tempResult);
			tempResult.deleteCharAt(tempResult.length()-1);
		}
	}

	public static void main(String[] args) {
		System.out.println(getStringCombinationsOfKeys("23456789"));
	}

}
