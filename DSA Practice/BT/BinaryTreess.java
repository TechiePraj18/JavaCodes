
package BT;

import java.util.*;

//1. Make Node class
public class BinaryTreess {
    static class Node {
        int data;
        Node left;
        Node right;

        // Constructor which represent single nodes of tree
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    // 2. Binarytree class contains method which will return root of tree as output

    static class BinaryTree {

        // initialize from -1 to visit every node
        static int idx = -1;

        // Method
        public static Node buildTree(int nodes[]) {
            idx++; // increment -1 to 0

            if (nodes[idx] == -1) {
                return null;
            }

            // Make newNode for other data
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
    }

}
