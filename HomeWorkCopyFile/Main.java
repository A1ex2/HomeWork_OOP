package net.ukr.jaroshov;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String folderSource = enterAddress("источник");
		if (!(FileOperation.existsFile(folderSource))) {
			return;
		}
		String folderRecipient = enterAddress("приемник");
		if (!(FileOperation.existsFile(folderRecipient))) {
			return;
		}
		String expansion = "png";

		try {
			FileOperation.copyFiles(folderSource, folderRecipient, expansion);
			JOptionPane.showMessageDialog(null, "Файлы скопированы");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	static String enterAddress(String type) {
		String address = String.valueOf(JOptionPane.showInputDialog("Введите каталог " + type));
		return address;
	}
}
