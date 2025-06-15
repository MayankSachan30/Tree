✅ 1. Inorder Traversal
Definition:
Visit Left → Root → Right

Use Case:
Retrieves nodes in sorted order for Binary Search Trees.

Example:

For this tree:

markdown
Copy
Edit
        1
       / \
      2   3
     / \
    4   5
Inorder Output:
4 2 5 1 3

✅ 2. Preorder Traversal
Definition:
Visit Root → Left → Right

Use Case:
Used to copy or serialize a tree.

Example Output:
1 2 4 5 3

✅ 3. Postorder Traversal
Definition:
Visit Left → Right → Root

Use Case:
Used to delete a tree or evaluate expressions.

Example Output:
4 5 2 3 1

✅ 4. Maximum Depth of Binary Tree
Definition:
The number of nodes along the longest path from the root down to the farthest leaf node.

Approach:
Use recursion:

text
Copy
Edit
depth = 1 + max(left subtree depth, right subtree depth)
Example Tree:

markdown
Copy
Edit
        1
       / \
      2   3
     / \
    4   5
   /
  6
Maximum Depth = 4

Path: 1 → 2 → 4 → 6


