package net.ukr.jaroshov;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileOperation {
	public static void copyFiles(String folderSource, String folderRecipient, String expansion) throws IOException {
		File[] listSource = fileList(folderSource, expansion);
		File[] listRecipient = fileList(folderRecipient, expansion);
		
		for (int i = 0; i < listSource.length; i++) {
			String nameFileOne = folderSource + "/" + listSource[i].getName();
			String nameFileTwo = folderRecipient + "/" + listSource[i].getName();
			File fileOne = new File(nameFileOne);
			File fileTwo = new File(nameFileTwo);			
			copyFile(fileOne, fileTwo);
		}	
	}

	public static boolean existsFile(String address) {
		File file = new File(address);
		return file.exists();
	}
	
	public static void copyFile(File fileIn, File fileOut) throws IOException {
		if (fileIn == null || fileOut == null) {
			throw new IllegalArgumentException("Null file piontter");
		}

		try (InputStream is = new FileInputStream(fileIn); OutputStream os = new FileOutputStream(fileOut)) {
			byte[] buffer = new byte[1024 * 1024];
			int byteCopy = 0;

			for (; (byteCopy = is.read(buffer)) > 0;) {
				os.write(buffer, 0, byteCopy);
			}

		} catch (IOException e) {
			throw e;
		}
	}

	private static File[] fileList(String folder, String expansion) throws IOException {
		File file = new File(folder);
		if (file.isDirectory()) {
			 MyFileFilter mFF = new MyFileFilter(expansion);
		     File[] fileList = file.listFiles(mFF);		
			return fileList;
		} else {
			throw new IllegalArgumentException("Выбран файл, а нужно каталог!");
		}
	}
}
