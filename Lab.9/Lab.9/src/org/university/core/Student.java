package org.university.core;

public class Student extends Person {

    protected Course[] courses;
    protected int counter = 0;

    public Course[] getCourses() {
        return courses;
    }

    public void addCourse (Course c) {
        courses [counter] = c;
        counter ++;
    }

}
