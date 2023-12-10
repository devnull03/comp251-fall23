package Activity1;

public class ArrayListDemo {
	

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0, 1);
		list.add(1, 2);
		list.add(2, 3);
		list.add(3, 4);
		list.add(4, 5);

		System.out.print("(");
		for (int i = 0; i < list.size() - 1; i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.print(list.get(list.size() - 1) + ") \n");
		
	}


}
