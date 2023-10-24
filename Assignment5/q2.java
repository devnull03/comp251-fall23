package Assignment5;

import java.util.ArrayList;

public class q2 {

	public static void main(String[] args) {

		int capacity = 17;

		ArrayList<Integer> arr = new ArrayList<>(capacity);

		for (int i = 0; i < capacity; i++) {
			arr.add(i, i + 2);
		}

		System.out.println("The contents of ArrayList before filtering: " + arr.toString());

		ArrayList<Integer> even_arr = new ArrayList<>();

		for (Integer i : arr) {
			if (i % 2 != 0) {
				even_arr.add(i);
			}
		}

		System.out.println("The contents of ArrayList after filtering: " + even_arr.toString());

	}

}
