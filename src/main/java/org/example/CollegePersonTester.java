package org.example;

public class CollegePersonTester {
    public static void main(String[] args) {
        // Creating objects for each subclass type
        Student student = new Student("joan", "wambo", 12345, 3);
        Professor professor = new Professor("betty", "nyavuke", 67890, "bio tech");
        Assistant assistant = new Assistant("Tom", "mboya", 98765, true);

        // Invoking the goToCollege() method for each object
        System.out.println("Student:");
        student.goToCollege();
        System.out.println("\nProfessor:");
        professor.goToCollege();
        System.out.println("\nAssistant:");
        assistant.goToCollege();

        // Invoking the implemented methods from interfaces for Student, Professor, and Assistant
        System.out.println("\nStudent is learning:");
        student.studyAtHome();

        System.out.println("\nProfessor is teaching:");
        professor.teachToOtherPeople();

        System.out.println("\nAssistant is learning:");
        assistant.studyAtHome();

        System.out.println("\nAssistant is teaching:");
        assistant.teachToOtherPeople();
    }
}
