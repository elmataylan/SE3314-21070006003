package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A test class for the University class.
 */
public class UniversityTest {
    /**
     * Test method for adding a course to the university.
     */
    @Test
    public void testAddCourse() {
        University u1 = new University();
        Course c1 = new Course("Yazılım İnşası", 55);
        u1.addCourse(c1);
        assertEquals(1, u1.courses.size());
    }

    /**
     * Test method for registering a student for a course in the university.
     */
    @Test
    public void testRegisterStudentForCourse() {
        University university = new University();
        Student s1 = new Student("John Doe", "4");
        Course c1 = new Course("Yazılım İnşası", 55);
        university.addCourse(c1);
        university.registerStudentForCourse(s1, c1);
        assertTrue(c1.students.contains(s1));
    }
}
