package org.example;

/**
 * This class simulates the operation of a university.
 */
public class App
{
    /**
     * The entry point of the program.
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {

        University my_university = new University();
        Student stud1 = new Student("Jane Doe", "001");
        Student student2 = new Student("John Smith", "002");
        Course course1 = new Course("Software Engineering", 30);
        Course course2 = new Course("Data Structures", 40);


        my_university.addCourse(course1);
        my_university.addCourse(course2);


        my_university.registerStudentForCourse(stud1, course1);
        my_university.registerStudentForCourse(student2, course2);

        System.out.println("Total courses offered: " + Course.getTotalCourses());
        my_university.printEnrollments();
    }
}