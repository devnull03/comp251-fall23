package Assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class q3 {

	public static boolean contains(ArrayList<Integer> arr, Integer o) {

		for (Integer i : arr) {
			if (i.equals(o)) {
				return true;
			}
		}

		return false;

	}

	public static void main(String[] args) {

		int capacity = 17;

		ArrayList<Integer> arr = new ArrayList<>(capacity);

		for (int i = 0; i < capacity; i++) {
			arr.add(i, i + 2);
		}

		System.out.println("The contents of the List: \n" + arr.toString());

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number to find: ");
		Integer to_find = sc.nextInt();

		System.out.println(
				"The number " + to_find + " is " + (contains(arr, to_find) ? "" : "not ") + "present.");

		sc.close();
	}
}
