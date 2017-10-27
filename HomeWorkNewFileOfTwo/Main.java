package net.ukr.jaroshov;

public class Main {

	public static void main(String[] args) {

		String f1 = "a.txt";
		String f2 = "b.txt";
		String f3 = "c.txt";

		FileOperation.newFile("ïåðâûé ïðîñòî òåêñò êàêîé òî", f1);
		FileOperation.newFile("åùå êàêîé òî òåêñò ïðîñòî òåñò", f2);

		String text1 = FileOperation.readerFile(f1);
		String text2 = FileOperation.readerFile(f2);

		findTextAddFile(text1, text2, f3);
	}

	static void findTextAddFile(String text1, String text2, String f3) {
		String newText = "";
		String[] t1 = text1.split("[ ,;]");
		String[] t2 = text2.split("[ ,;]");
		
		for (int i = 0; i < t1.length; i++) {
			String temp = findText(t1[i], t2);
			newText = newText + temp;
		}		
		FileOperation.newFile(newText, f3);	
	}

	static String findText(String t, String[] str) {
		String temp = "";
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(t)) {			
				temp = t + " ";
				break;
			}
		}		
		return temp;
	}
} 
