package com.how;

public class Winner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] maria = { 2, 1, 3 };
		int[] andria = { 1, 2, 3 };

		System.out.println(winner(andria, maria, "Odd"));
	}

	public static String winner(int[] andria, int[] maria, String s) {
		if(andria.length != maria.length)
			return "Two arrays not lengths are not equal";
		int factor = (s == "Even") ? 0 : 1;
		int mariaTotal = 0;
		int andriaTotal = 0;
		for (int i = 0; i < andria.length; i++) {
			if (i % 2 == factor) {
				mariaTotal += maria[i] - andria[i];
				andriaTotal += andria[i] - maria[i];
			}
		}

		return (mariaTotal == andriaTotal) ? "Tie" : (andriaTotal > mariaTotal) ? "Andria" : "Maria";
	}
}
