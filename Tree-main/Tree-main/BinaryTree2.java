class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTree2 {
    Node root;

    // Preorder Traversal: Root -> Left -> Right
    void preorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");  // Visit root
        preorder(node.left);                // Visit left subtree
        preorder(node.right);               // Visit right subtree
    }

    public static void main(String[] args) {
        BinaryTree2 tree = new BinaryTree2();

        // Manually creating a tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Print Preorder Traversal
        System.out.print("Preorder traversal: ");
        tree.preorder(tree.root);
    }
}
