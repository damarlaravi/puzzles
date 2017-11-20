package com.techgig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMerge {

	private static String manipulatedString = "";
	private static List<String> listStrings = new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output = orignial("abfcde");
		System.out.println(output);

	}

	public static String orignial(String input1) {

		String returnStr = "";
		listStrings.add(input1);
		String alterString = recursive(input1);

		manipulatedString = "";
		System.out.println(" Original String " + alterString);
		if (listStrings.get(0).equals(alterString)) {
			System.out.println(" Coming Here " + alterString);
			returnStr = alterString;
		} else {
			orignial(alterString);
		}

		return returnStr;
	}

	public static String recursive(String input1) {
		StringBuilder sb = new StringBuilder(input1);
		if (input1.length() > 1) {
			manipulatedString += middle(sb.toString());
			sb.deleteCharAt(middleIndex(sb.toString()));
			// System.out.println(" Original String " + manipulatedString );
			// System.out.println("Manipulated String is " + sb.toString());
			recursive(sb.toString());
		} else {
			manipulatedString += sb.toString();
		}

		// return sortString(manipulatedString);
		return manipulatedString;
	}

	public static String sortString(String inputString) {
		// convert input string to char array
		char tempArray[] = inputString.toCharArray();

		// sort tempArray
		Arrays.sort(tempArray);

		// return new sorted string
		return new String(tempArray);
	}

	public static String middle(String str) {
		int position;
		int length;
		if (str.length() == 1)
			return str;

		if (str.length() % 2 == 0) {
			position = str.length() / 2 - 1;
			length = 1;
		} else {
			position = str.length() / 2;
			length = 1;
		}

		// System.out.println(" Position String " + str.substring(position,
		// position + length));
		return str.substring(position, position + length);
	}

	public static int middleIndex(String str) {
		int position;
		if (str.length() == 1)
			return 1;

		if (str.length() % 2 == 0) {
			position = str.length() / 2 - 1;
		} else {
			position = str.length() / 2;
		}

		// System.out.println("Incoming String is ::: "+str+" String Index " +
		// position);
		return position;
	}

}
