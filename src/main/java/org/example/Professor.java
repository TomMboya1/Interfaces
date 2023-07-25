package org.example;

public class Professor extends CollegePerson implements TeachingPerson {
    private String teachingSubject;

    public Professor(String name, String surname, int id, String subject) {
        super(name, surname, id);
        this.teachingSubject = subject;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println(name + " is teaching " + teachingSubject + " to students.");
    }
}
