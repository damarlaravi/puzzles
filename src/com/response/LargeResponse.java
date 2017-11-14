package com.response;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LargeResponse {
	public static void main(String[] args) {
		try {
			InputStream res = LargeResponse.class.getResourceAsStream("/hosts_access_log_00.txt");
			BufferedReader in = new BufferedReader(new InputStreamReader(res));
			String line;
			List<String> lines = new ArrayList<String>();
			//String[] words = {};
			while ((line = in.readLine()) != null) {
				//words = line.split(" ");
				lines.add(line);
				System.out.println(line);
			}

			// System.out.print("Words are ::: "+ words);
			for (String w : lines) {
				System.out.println(w);
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
