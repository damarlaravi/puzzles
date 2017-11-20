package com.string;

public class MaxSubstring {

	static String[] finalizedStr = {};

	public static void main(String[] args) {
		//String str = "ritikisagoodboy";
		String str = "ritiki";
		candidateCode(str, 4);
	}

	private static int candidateCode(String input1, int input2) {
		finalizedStr = new String[input1.length() + 1];
		if (!isMatchCretiria(input1, input2)) {
			System.out.print(" asdfj "+isMatchCretiria(input1, input2));
			return -1;
		} else {
			getFinalizedStr(0, input1, input2);
			int index = findLargestIndex(finalizedStr);
			System.out.print("Index is :: " + index + " String is :: " + finalizedStr[index] + " Length is "
					+ finalizedStr[index].length());
			return finalizedStr[index].length();
		}
	}

	private static void getFinalizedStr(int val, String str, int k) {
		int count = 0;
		String resultStr = "";
		char[] arr = str.toLowerCase().toCharArray();
		for (int i = val; i < arr.length; i++) {
			if (!isVowel(arr[i]) || count == k) {
				if (count == k)
					break;
				else {
					resultStr += arr[i];
					count++;
				}

			} else {
				resultStr += arr[i];
			}
		}
		finalizedStr[val] = resultStr;
		// System.out.println("Restult String is :: " + resultStr);
		if (val < arr.length - 1) {
			val++;
			getFinalizedStr(val, str, k);
		}
	}

	static boolean isMatchCretiria(String str, int k) {
		int count = 0;
		char[] array = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (!isVowel(array[i])) {
				count++;
			}
		}

		return count >= k;
	}

	static int findLargestIndex(String[] array) {
		int index = 0;
		int elementLength = array[0].length();
		//System.out.println("elementLength String is ::  " + array[1].length());
		for (int i = 1; i < array.length - 1; i++) {
			if (array[i].length() > elementLength) {
				index = i;
				elementLength = array[i].length();
			}
		}
		return index;
	}

	static boolean isVowel(char c) {
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	}

}
