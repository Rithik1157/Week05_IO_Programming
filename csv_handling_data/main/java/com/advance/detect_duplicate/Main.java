package com.advance.detect_duplicate;

import java.util.Set;

public class Main {

	public static void main(String[] args) {
		DuplicateFinder df = new DuplicateFinder();
		String filePath = "file.csv";
		Set<String> li = df.getDuplicate(filePath);
		for(String records: li) {
			System.out.println(records);
		}
	}

}
