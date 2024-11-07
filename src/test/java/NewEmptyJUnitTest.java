/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.quizgame.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class NewEmptyJUnitTest {
    
    @Test
    public void testGetName() {
        Student student = new Student("Alice");
        assertEquals("Alice", student.getName());
    }
    @Test
    public void testIncreaseScore() {
        Student student = new Student("Alice");
        student.increaseScore(10);
        assertEquals(10, student.getScore());
        
        student.increaseScore(5);
        assertEquals(15, student.getScore());
    }
    
    @Test
    public void testInitialScore() {
        Student student = new Student("Bob");
        assertEquals(0, student.getScore());  // Score should be 0 initially
    }

    @Test
    public void testMultipleStudents() {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.increaseScore(20);
        student2.increaseScore(15);

        assertEquals(20, student1.getScore());
        assertEquals(15, student2.getScore());
    }
}
