class Node {
    int data;
    Node left, right;

    // Constructor
    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    // Inorder Traversal: Left -> Root -> Right
    void inorder(Node node) {
        if (node == null)
            return;

        inorder(node.left);         // Visit left subtree
        System.out.print(node.data + " ");  // Visit root
        inorder(node.right);        // Visit right subtree
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Creating the binary tree manually
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Print inorder traversal
        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);
    }
}
