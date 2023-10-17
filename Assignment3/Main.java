package Assignment3;

public class Main {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			question3();
			System.out.println();
		}

	}

	public static void question3() {

		int[] A = getRandomArr();

		for (int i = 0; i <= A.length; i++) {

			// assuming the unique numbers are in order
			if (A[i] != i) {
				System.out.println("Missing number: " + i);
				break;
			}

			// another solution, but didn't work if the skipped number was 0
			// if (A[i] - A[i-1] > 1) {
			// 	System.out.println("Missing number: " + i);
			// 	break;
			// }

		}

	}

	public static int[] getRandomArr() {
		int[] arr = new int[(int) (Math.random() * 100)];
		boolean skipped = false;
		int current = 0;
		for (int i = 0; i <= arr.length; i++) {
			boolean skip = (Math.random() * 30 < 5);
			if (skip && !skipped) {
				System.out.println("Skipped: " + i);
				skipped = true;
				continue;
			}
			if ((current == arr.length) && !skipped) {
				System.out.println("Skipped: " + i);
				break;
			}
			arr[current] = i;
			current++;
		}
		return arr;
	}
}
