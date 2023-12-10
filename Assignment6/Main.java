package Assignment6;

public class Main {

	public static void main(String[] args) {

		LinkedBinaryTree<Integer> binaryTree = new LinkedBinaryTree<Integer>();
		Position<Integer> root = binaryTree.addRoot(1);

		Position<Integer> leftChild = binaryTree.addLeft(root, 2);
		Position<Integer> rightChild = binaryTree.addRight(root, 3);

		Position<Integer> leftChildLeftChild = binaryTree.addLeft(leftChild, 4);
		Position<Integer> leftChildRightChild = binaryTree.addRight(leftChild, 5);

		Position<Integer> leftChildLeftChildLeftChild = binaryTree.addLeft(leftChildRightChild, 6);
		Position<Integer> leftChildLeftChildRightChild = binaryTree.addRight(leftChildRightChild, 7);

		System.out.println("Inorder traversal of the tree: ");
		inorderTraversal(binaryTree, root);
		System.out.println();

	}

	// make an inorder traversal of the tree method
	public static void inorderTraversal(LinkedBinaryTree<Integer> binaryTree, Position<Integer> root) {
		if (binaryTree.left(root) != null) {
			inorderTraversal(binaryTree, binaryTree.left(root));
		}
		System.out.print(root.getElement() + " ");
		if (binaryTree.right(root) != null) {
			inorderTraversal(binaryTree, binaryTree.right(root));
		}
	}

}
