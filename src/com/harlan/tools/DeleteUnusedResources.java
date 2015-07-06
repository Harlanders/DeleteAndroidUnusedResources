package com.harlan.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DeleteUnusedResources {

	public static void main(String[] args) {
		delete(args);

	}

	private static void delete(String[] args) {
		System.out.println(args[0]);

		String path = args[0];
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(path));
			String line;
			while ((line = reader.readLine()) != null) {
				if (line.contains("drawable")) {
					String[] split = line.split(":");
					for (String s : split) {
						File file = new File(args[0].split(":")[0] + ":" + s);
						if (file.isFile()) {
							System.out.println("---" + file.toString());
							file.delete();
						} else {
							// System.out.println("///" + file.toString());
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace(System.out);
			}
		}
	}

}
