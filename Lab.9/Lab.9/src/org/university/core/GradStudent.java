package org.university.core;

public class GradStudent extends Student {
    private Publication[] publications;
    private Professor advisor;
    private int counter = 0;

    public Publication[] getPublications() {
        return publications;
    }

    public void addPublication (Publication p){
        publications [counter] = p;
        counter++;
    }
}
