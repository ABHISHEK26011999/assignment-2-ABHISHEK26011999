/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

public class MyMain {
   public static void main(String[] args) {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(85);
        bst.insert(25);
        bst.insert(45);
        bst.insert(15);
        bst.insert(17);
        bst.insert(15);
        bst.insert(10);
        System.out.println("Root of the tree --> " + bst.getRoot().getData());
        System.out.println("PreOrder Traversal");
        MyMain m = new MyMain();
        m.pre(bst.getRoot());
        System.out.println();
        System.out.println("PostOrder Traversal --> ");
        m.post(bst.getRoot());
        System.out.println("\n\nANSWER A IS YES ");
        System.out.println("ANSWER FOR THE B IS NO ");

    }

    public void pre(TreeNode node) {
        if (node != null) {
            System.out.print(node.getData() + " --> ");
            pre(node.getLeft());
            pre(node.getRight());
        }
    }

    public void post(TreeNode node) {
        if (node != null) {
            post(node.getLeft());
            post(node.getRight());
            System.out.print(node.getData() + " --> ");
        }
    }
}
