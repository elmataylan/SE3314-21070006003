package org.example;

/**
 * Represents a student in a university.
 */
public class Student {
    final String studentName;
    final String studentID;

    /**
     * Constructs a student with a given name and ID.
     * @param name The name of the student.
     * @param id The ID of the student.
     */
    public Student(String name, String id) {
        studentName = name;
        studentID = id;
    }

    /**
     * Gets name of the student.
     * @return The name of the student.
     */
    public String getName() {
        return studentName;
    }

    /**
     * Gets ID of the student.
     * @return The ID of the student.
     */
    public String getStudentID() {
        return studentID;
    }
}