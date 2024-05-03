package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigorous Test :-)
     */
    public void testApp()
    {
        University myUniversity = new University();
        Student s1 = new Student("Jonh Doe", "1");
        Course c1 = new Course("Yazılım İnşası", 55);

        myUniversity.addCourse(c1);
        assertTrue(myUniversity.courses.containsKey(c1.getCourseName()));

        myUniversity.registerStudentForCourse(s1, c1);
        assertTrue(c1.students.contains(s1));
    }
}
