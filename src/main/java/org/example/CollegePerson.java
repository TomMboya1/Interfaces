package org.example;

public class CollegePerson {
    protected String name;
    protected String surname;
    protected int collegeId;

    public CollegePerson(String name, String surname, int collegeId) {
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }

    public void goToCollege() {
        System.out.println("Name: " + name + "\nSurname: " + surname + "\nCollege ID: " + collegeId);
    }
}
