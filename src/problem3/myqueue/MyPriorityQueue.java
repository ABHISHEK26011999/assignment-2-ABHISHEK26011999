/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue {
   Node front;

    public MyPriorityQueue() {
        this.front = null;
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }


    public void push(String name, int roll) {
        Node n = new Node(name, roll);
        Node temp = front;
        Node prev = null;
        if (front == null)
            front = n;

        else {
            if (front.getRoll_no() > roll) {
                n.setNext(front);
                front = n;
            } else {
                while (temp.getNext() != null && temp.getRoll_no() < roll) {
                    //prev = temp;
                    temp = temp.getNext();
                }
                //prev.setNext(n);
                n.setNext(temp.getNext());
                temp.setNext(n);

            }
        }
    }

    public void display() {
        Node n = front;
        while (n != null) {
            System.out.println("Name --> " + n.getName() + "\nRoll no --> " + n.getRoll_no() + "\n");
            n = n.getNext();
        }
    }
}
}
