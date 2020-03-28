/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {
   Node front, rear;

    public MyCircularQueue() {
        rear = front = null;
    }

    public void insert(Student student) {
        if (student.getAppearing() > 2)
            System.out.println("CANNOT INSERT THIS STUDENT --> " + student.getName());
        else {
            Node n = new Node(student);
            if (front == null) {
                front = n;
            } else
                rear.setNext(n);
            rear = n;
            rear.setNext(front);

        }
    }

    public Student remove() {
        if (front == null)
            System.out.println("EMPTY QUEUE");
        Student s = null;
        if (front == rear) {
            s = front.getStudent();
            front = rear = null;
        } else {
            Node temp = front;
            s = temp.getStudent();
            front = front.getNext();
            rear.setNext(front);
        }
        if (s.getBacklogcount() == 0)
            return s;
        else {
            insert(s);
            return null;
        }
    }

    public void display() {
        Node temp = front;
        System.out.print("\nStudent present in queue are: ");
        while (temp.getNext() != front) {
            System.out.print(temp.getStudent().getName() + "  ");
            temp = temp.getNext();
        }
        System.out.print(temp.getStudent().getName() + "  ");
        System.out.println();
    }
}
