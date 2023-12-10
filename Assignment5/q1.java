package Assignment5;

import java.util.ArrayList;

public class q1 {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			arr.add(i * 10);
		}

		System.out.println("The contents of ArrayList are: " + arr.toString());

	}

}
