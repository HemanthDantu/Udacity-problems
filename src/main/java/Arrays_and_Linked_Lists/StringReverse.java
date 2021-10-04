package Arrays_and_Linked_Lists;

import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println(reverseString("tester String"));

		System.out.println(isAnagram("rat", "art"));
		System.out.println(isAnagram("slot machines", "cash lost in me"));
		System.out.println(isAnagram("slots machines", "cash lost in me"));

		System.out.println("All the best : " + reverseWordsInString("All the best"));
		System.out.println("A1l?l !th5e :be@st : " + reverseWordsInString("A1l?l !th5e :be@st"));
		
		System.out.println("s1 : geeksforgeeks, s2 : geeksforgeeks :" + hammingDistance("geeksforgeeks", "geeksandgeeks"));
		System.out.println("s1 : ACTTGACCGGG, s2 : GATCCGGTACA : " + hammingDistance("ACTTGACCGGG", "GATCCGGTACA"));

	}

//	# Reverse Strings
//	# In this first exercise, the goal is to write a function that takes a string as input and then returns the reversed string.
//	#
//	# For example, if the input is the string "water", then the output should be "retaw".

	private static String reverseString(String string) {
		String reversedString = "";
		int len = string.length() - 1;
		while (len >= 0) {
			reversedString = reversedString + string.charAt(len);
			len--;
		}
		return reversedString;
	}

//	# Anagrams
//	# The goal of this exercise is to write some code to determine if two strings are anagrams of each other.
//	#
//	# An anagram is a word (or phrase) that is formed by rearranging the letters of another word (or phrase).
//	#
//	# For example:
//	#
//	# "rat" is an anagram of "art"
//	# "alert" is an anagram of "alter"
//	# "Slot machines" is an anagram of "Cash lost in me"
//	# Your function should take two strings as input and return True if the two words are anagrams and False if they are not.
//	#
//	# You can assume the following about the input strings:
//	#
//	# No punctuation
//	# No numbers
//	# No special characters

	private static Boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			s1 = s1.replaceAll(" ", "");
			s2 = s2.replaceAll("\\s+", "");
		}

		char[] s1ToCharArray = s1.toLowerCase().toCharArray();
		char[] s2ToCharArray = s2.toLowerCase().toCharArray();
		Arrays.sort(s1ToCharArray);
		Arrays.sort(s2ToCharArray);

		if (String.valueOf(s1ToCharArray).equals(String.valueOf(s2ToCharArray)))
			return true;
		return false;
	}

//	# Reverse the words in sentence
//	# Given a sentence, reverse each word in the sentence while keeping the order the same!

	private static String reverseWordsInString(String s) {
		String[] stringArray = s.split(" ");
		String reversedString = "";
		for (int i = 0; i < stringArray.length; i++) {
			int len = stringArray[i].length() - 1;
			while (len >= 0) {
				reversedString += stringArray[i].charAt(len);
				len--;
			}
			if (i != stringArray.length - 1)
				reversedString += " ";
		}
		return reversedString;
	}

//	# Hamming Distance
//	# In information theory, the Hamming distance between two strings of equal length is the number of positions at which the corresponding symbols are different.
//	Calculate the Hamming distace for the following test cases.
//	Input : str1[] = "geeksforgeeks", str2[] = "geeksandgeeks"
//			Output : 3
//			Explanation : The corresponding character mismatch are highlighted.
//			"geeksforgeeks" and "geeksandgeeks"
//
//			Input : str1[] = "1011101", str2[] = "1001001"
//			Output : 2
//			Explanation : The corresponding character mismatch are highlighted.
//			"1011101" and "1001001"
	
	private static int hammingDistance(String s1, String s2) {
		if(s1.length()!=s2.length())
			return 0;
		int result = 0;
		
		for(int i=0; i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i))
				result++;
		}
		
		return result;
	}

}
