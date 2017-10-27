package net.ukr.jaroshov;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
	public static void newFile(String text, String address) {
		try (FileWriter writer = new FileWriter(address, false)) {
			writer.write(text);
			writer.flush();
		} catch (IOException e) {

			System.out.println(e.getMessage());
		}
	}

	public static String readerFile(String address) {
		StringBuilder stringBuilder = new StringBuilder();

		try (BufferedReader f = new BufferedReader(new FileReader(address))) {

			String str = "";
			for (; (str = f.readLine()) != null;)
				stringBuilder.append(str);
		}
		catch (

		IOException e) {
			System.out.println(e.getMessage());
		}
		return stringBuilder.toString();
	}

	public static boolean existsFile(String address) {
		File file = new File(address);
		return file.exists();
	}
}