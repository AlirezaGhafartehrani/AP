package org.university.core;

import java.util.ArrayList;


public class Course {
    private String name;
    private Professor instructor;
    private ArrayList<Student> students = new ArrayList<Student>();
    private GradStudent teacherAssistance;


    public GradStudent getTeacherAssistance() {
        return teacherAssistance;
    }

    public void setTeacherAssistance(GradStudent teacherAssistance) {
        this.teacherAssistance = teacherAssistance;
    }

    public Course(String name, Professor instructor) {
        this.name = name;
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public Professor getInstructor() {
        return instructor;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }
}
