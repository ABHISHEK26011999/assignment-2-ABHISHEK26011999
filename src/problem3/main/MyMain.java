/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
   public static void main(String[] args) {
        MyPriorityQueue pq = new MyPriorityQueue();
        pq.push("a", 1);
        pq.push("b", 2);
        pq.push("c", 3);

        pq.display();


    }
}
