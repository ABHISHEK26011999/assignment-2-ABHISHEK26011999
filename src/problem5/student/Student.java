/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
   String name;
    int backlogcount;
    int appearing;

    public Student(String name, int backlogcount, int appearing) {
        this.name = name;
        this.backlogcount = backlogcount;
        this.appearing = appearing;
    }

    public int getAppearing() {
        return appearing;
    }

    public void setAppearing(int appearing) {
        this.appearing = appearing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBacklogcount() {
        return backlogcount;
    }

    public void setBacklogcount(int backlogcount) {
        this.backlogcount = backlogcount;
    }
}
