package org.university.core;

public class Professor extends AbstractEmployee {

    private Course[] courses;
    private String group;
    private int essay;

    @Override
    public Double calCurrentIncome() {
        return null;
    }

    @Override
    public boolean isPromotable() {
        return false;
    }

    public int getEssay() {
        return essay;
    }

    public void setEssay(int essay) {
        this.essay = essay;
    }

    public String getGroup() {
        return group;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void addCourse (Course c){

    }
}
