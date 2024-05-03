package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A test class for the Course class.
 */
public class CourseTest {
    /**
     * Test method for adding a student to the course.
     */
    @Test
    public void testAddStudent() {
        Course c1 = new Course("Yazılım İnşası", 55);
        Student s1 = new Student("Jonh Doe", "5");
        c1.addStudent(s1);
        assertTrue(c1.students.contains(s1));
    }
}