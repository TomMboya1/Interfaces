package org.example;

public class Student extends CollegePerson implements LearningPerson {
    private int academicYear;

    public Student(String name, String surname, int id, int year) {
        super(name, surname, id);
        this.academicYear = year;
    }

    @Override
    public void studyAtHome() {
        System.out.println(name + " is studying at home.");
    }
}
