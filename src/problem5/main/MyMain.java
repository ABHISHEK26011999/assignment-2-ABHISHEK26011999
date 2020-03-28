/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

//executable class
public class MyMain {
  public static void main(String[] args) {
        MyCircularQueue q = new MyCircularQueue();
        Student s1 = new Student("a", 0, 1);
        q.insert(s1);
        Student s2 = new Student("b", 2, 2);
        q.insert(s2);
        Student s3 = new Student("c", 3, 4);
        q.insert(s3);
        Student s4 = new Student("d", 0, 1);
        q.insert(s4);
        Student remove = q.remove();
        if (remove != null)
            System.out.println("Student remove \nName --> " + remove.getName());
        remove = q.remove();
        if (remove != null)
            System.out.println("Student remove \nName --> " + remove.getName());
        remove = q.remove();
        if (remove != null)
            System.out.println("Student remove \nName --> " + remove.getName());
        remove = q.remove();
        if (remove != null)
            System.out.println("Student remove \nName --> " + remove.getName());
        q.display();
    }
}
