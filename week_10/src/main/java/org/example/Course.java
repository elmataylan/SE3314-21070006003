package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a course in a university.
 */
public class Course {
    private static int total_Courses = 0;
    private final String CourseName;
    private final int Capacity;
    final List<Student> students = new ArrayList<>();

    /**
     * Constructs a course with a given name and capacity.
     * @param name The name of the course.
     * @param capacity The maximum number of students that can enroll in the course.
     */
    public Course(String name, int capacity) {
        CourseName = name;
        Capacity = capacity;
        total_Courses++;
    }

    /**
     * Adds student to course if there is available space.
     * @param student The student to add to the course.
     */
    public void addStudent(Student student) {
        if (students.size() < Capacity)
            students.add(student);
    }

    /**
     * Getter for the name of the course.
     * @return The name of the course.
     */
    public String getCourseName() {
        return CourseName;
    }

    /**
     * Getter for the total number of courses created.
     * @return The total number of courses.
     */
    public static int getTotalCourses() { return total_Courses; }
}