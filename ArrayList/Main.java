package net.ukr.jaroshov;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> listTest = generateList();
		metodOne(listTest);

		listTest = generateList();
		metodTwo(listTest);
	}

	static List<Integer> generateList() {
		List<Integer> listTest = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			listTest.add(i);
		}
		outList(listTest);
		return listTest;
	}

	static void metodOne(List<Integer> listTest) {
		listTest.remove(10);
		listTest.remove(1);
		listTest.remove(0);
		outList(listTest);
	}

	static void metodTwo(List<Integer> listTest) {
		Iterator<Integer> iterator = listTest.iterator();
		int count = 0;
		for (; iterator.hasNext();) {
			iterator.next();
			if ((count < 2) || (count == 10)) {
				iterator.remove();
			}
			count++;
		}
		outList(listTest);
	}

	static void outList(List<Integer> listTest) {
		System.out.println(listTest);
	}
} 
