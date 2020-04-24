package lgs.lviv.ua.max.task3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAplication {

	public static void main(String[] args) {

		List testList = new ArrayList();

		testList.add(32);
		testList.add("Corona");
		testList.add('v');
		testList.add(3.32);
		testList.add(36.6f);
		testList.add(true);
		testList.add(false);

		System.out.println(testList);
		System.out.println(testList.size());
		System.out.println("Removing 1 and 4 index");

		testList.remove(1);
		testList.remove(4);

		System.out.println(testList);
		System.out.println(testList.size());

	}

}
