package net.ukr.jaroshov;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String folderSource = enterAddress("��������");
		if (!(FileOperation.existsFile(folderSource))) {
			return;
		}
		String folderRecipient = enterAddress("��������");
		if (!(FileOperation.existsFile(folderRecipient))) {
			return;
		}
		String expansion = "png";

		try {
			FileOperation.copyFiles(folderSource, folderRecipient, expansion);
			JOptionPane.showMessageDialog(null, "����� �����������");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	static String enterAddress(String type) {
		String address = String.valueOf(JOptionPane.showInputDialog("������� ������� " + type));
		return address;
	}
}