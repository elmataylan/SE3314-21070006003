package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A test class for the Student class.
 */
public class StudentTest {
    /**
     * Test method for getting the name of a student.
     */
    @Test
    public void testGetName() {
        Student s1 = new Student("Jonh Doe", "5");
        assertEquals("Jonh Doe", s1.getName());
    }
}