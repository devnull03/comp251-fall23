package Assignment6;

public class Main {

	public static void main(String[] args) {

		LinkedBinaryTree<Integer> binaryTree = new LinkedBinaryTree<Integer>();
		Position<Integer> root = binaryTree.addRoot(1);

		Position<Integer> leftChild = binaryTree.addLeft(root, 2);
		Position<Integer> rightChild = binaryTree.addRight(root, 3);

	}

}
