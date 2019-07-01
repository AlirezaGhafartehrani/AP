package org.university.core;

public class Person {
    protected String firtName;
    protected  String lastName;
    protected String ID;
    protected int joiningYear;
    protected Department department;

    public String getFullName() {
        return firtName + lastName;
    }

    public String getID() {
        return ID;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    public Department getDepartment() {
        return department;
    }
}
