package Sorting;

import java.util.Arrays;

/*Given a string consisting of uppercase and lowercase ASCII characters, write a function, case_sort, 
 * that sorts uppercase and lowercase letters separately, such that if the $i$th place in the original string had an 
 * uppercase character then it should not have a lowercase character after being sorted and vice versa.

For example:
Input: fedRTSersUXJ
Output: deeJRSfrsTUX*/
public class CaseSpecificSortingOfStrings {

	public static void main(String[] args) {
		System.out.println(caseSort("fedRTSersUXJ"));
	}

	private static String caseSort(String str) {
		int upperCaseIndex = 0;
		int lowerCaseIndex = 0;
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		StringBuilder sb = new StringBuilder();
		for (int k = 0; k < ch.length; k++) {
			int asciiCode = (int) ch[k];
			if (97 <= asciiCode && asciiCode <= 122) {
				lowerCaseIndex = k;
				break;
			}
		}

		for (int i = 0; i < str.length(); i++) {
			int asciiCode = (int) str.charAt(i);
			if (97 <= asciiCode && asciiCode <= 122) {
				sb.append(ch[lowerCaseIndex]);
				lowerCaseIndex++;
			} else {
				sb.append(ch[upperCaseIndex]);
				upperCaseIndex++;
			}
		}

		return sb.toString();
	}
}
