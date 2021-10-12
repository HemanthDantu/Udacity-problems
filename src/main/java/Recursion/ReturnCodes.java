package Recursion;

import java.util.ArrayList;
import java.util.List;

public class ReturnCodes {

	public static char getAlphabet(int num) {
		return (char) (num + 96);
	}

	public static List<String> getCodes(int num) {
		if (num == 0) {
			List<String> res = new ArrayList<>();
			res.add("");
			return res;
		}
		
		int remainder = num%100;
		return new ArrayList<>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getCodes(1);
	}

}
