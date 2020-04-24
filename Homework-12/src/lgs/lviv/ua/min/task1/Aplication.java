package lgs.lviv.ua.min.task1;

import java.util.Random;
import java.util.ArrayList;

public class Aplication {

	public static void main(String[] args) {

		Random r = new Random();
		int count = r.nextInt(5) + 1;

		ArrayList<Auto> list = new ArrayList<Auto>();

		while (count > 0) {
			list.add(new Auto((randomNumber(50, 300)), (randomNumber(1970, 2020)),
					new Wheel((10 + r.nextInt(5)), getRandomMaterial()), new Engine(1 + r.nextInt(11))));

			count--;
		}

		System.out.println(list);

		fillArray(list);
		System.out.println(list);

	}

	static int randomNumber(int min, int max) {
		Random r = new Random();
		int number = r.nextInt(max - min + 1) + min;
		return number;
	}

	static String getRandomMaterial() {
		Random random = new Random();
		String[] arr = { "leather", "alcantara" };
		String material = arr[random.nextInt(2)];
		return material;
	}

	static ArrayList<Auto> fillArray(ArrayList<Auto> list) {
		Random r = new Random();
		Auto auto = new Auto((randomNumber(50, 300)), (randomNumber(1970, 2020)),
				new Wheel((10 + r.nextInt(5)), getRandomMaterial()), new Engine(1 + r.nextInt(11)));
		for (int counter = 0; counter < list.size(); counter++) {
			list.set(counter, auto);
		}
		return list;
	}

}
