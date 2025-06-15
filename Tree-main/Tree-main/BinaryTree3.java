class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTree3 {
    Node root;

    // Postorder Traversal: Left -> Right -> Root
    void postorder(Node node) {
        if (node == null)
            return;

        postorder(node.left);        // Visit left subtree
        postorder(node.right);       // Visit right subtree
        System.out.print(node.data + " ");  // Visit root
    }

    public static void main(String[] args) {
        BinaryTree3 tree = new BinaryTree3();

        // Creating binary tree manually
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Print Postorder Traversal
        System.out.print("Postorder traversal: ");
        tree.postorder(tree.root);
    }
}
