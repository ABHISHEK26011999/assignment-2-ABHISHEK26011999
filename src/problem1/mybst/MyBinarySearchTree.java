package problem1.mybst;

import problem1.node.TreeNode;

public class MyBinarySearchTree {
    TreeNode root;
    int mlevel = 0, c = 0;

    public MyBinarySearchTree() {
        this.root = root;
    }

    public void insert(int data) {
        TreeNode newnode = new TreeNode(data);
        if (root == null) {
            root = newnode;
        } else {
            TreeNode temp = root;
            TreeNode parent = null;
            while (temp != null) {
                parent = temp;
                if (newnode.getData() >= temp.getData())
                    temp = temp.getRight();
                else
                    temp = temp.getLeft();
            }
            if (newnode.getData() <= parent.getData())
                parent.setLeft(newnode);
            else
                parent.setRight(newnode);
        }
    }

    public int getMlevel() {
        return mlevel;
    }

    public void diaplay(TreeNode node, int level) {
        if (node != null) {
            if (node.getLeft() == null)
                c++;
            if (mlevel < level) {
                System.out.println("Data --> " + node.getData());
                mlevel = level;
            }
            diaplay(node.getLeft(), level + 1);
            diaplay(node.getRight(), level + 1);
        }
    }

    public void d2() {
        System.out.println("Number Of Empty Left Child --> " + c);
    }

    public TreeNode getRoot() {
        return root;
    }
}
