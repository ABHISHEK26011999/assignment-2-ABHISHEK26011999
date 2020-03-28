/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain
{
   public static void main(String[] args)
   {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(85);
        bst.insert(25);
        bst.insert(45);
        bst.insert(15);
        bst.insert(17);
        bst.insert(15);
        bst.insert(10);
        bst.insert(1);
        bst.diaplay(bst.getRoot(), bst.getMlevel());
        bst.d2();
    }
}
