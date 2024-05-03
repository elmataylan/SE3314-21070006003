package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a university that manages courses and student enrollments.
 */
public class University {
    final Map<String, Course> courses = new HashMap<>();

    /**
     * Adds a course to the university.
     * @param course The course to add.
     */
    public void addCourse(Course course) {
        if (course != null && !courses.containsKey(course.getCourseName()))
            courses.put(course.getCourseName(), course);
    }

    /**
     * Registers a student for a course in the university.
     * @param student The student to register.
     * @param course The course to register the student for.
     */
    public void registerStudentForCourse(Student student, Course course) {
        if (courses.containsKey(course.getCourseName())) {
            courses.get(course.getCourseName()).addStudent(student);
        }
    }

    /**
     * Prints the enrollments of students in courses.
     */
    public void printEnrollments() {
        for (Course course : courses.values()) {
            System.out.println("Course: " + course.getCourseName());
            for (Student student : course.students) {
                System.out.println("Student: " + student.getName());
            }
        }
    }
}