package com.couting.groups;

import java.util.*;

public class CoutingGroups {

	public static void main(String[] args) {
		System.out.println(" Please enter the input groups :");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			set.add(in.nextInt());
		}
		System.out.println(" groups :"+set.size());
		findPairs(set, k);
		in.close();
	}
 
	private static void findPairs(Set<Integer> set, int k) {
		int pairs = 0;
		for(Integer i: set){
			pairs += set.contains(i+k) ? 1:0;
		}
		
		System.out.println(pairs);
	}
}
