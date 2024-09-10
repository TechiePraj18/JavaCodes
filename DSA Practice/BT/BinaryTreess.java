
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
//Preorder function
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    //Inorder function
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder( root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //PostOrder
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        inorder( root.left);
        inorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        System.out.println("Preorder : ");
        preorder(root);

        System.out.println("\nInorder : ");
        inorder(root);

        System.out.println("\nPostorder : ");
        postorder(root);
    }
    

}
