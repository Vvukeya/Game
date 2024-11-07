/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quizgame;

/**
 *
 * @author RC_Student_lab
 */
public class QUIZGAME {

    private Student[] students;
    private Quiz[] quizzes;
    
    public QUIZGAME(Student[] students, Quiz[] quizzes) {
        this.students = students;
        this.quizzes = quizzes;
    }
    
    public void startGame() {
        for (int i = 0; i < students.length; i++) {
            System.out.println("\n" + students[i].getName() + "'s turn!");
            for (int j = 0; j < quizzes.length; j++) {
                if (quizzes[j].askQuestion()) {
                    System.out.println("Correct!");
                    students[i].increaseScore(10); // Increase score by 10 for correct answer
                } else {
                    System.out.println("Wrong answer!");
                }
            }
        }
        
        displayScores();
    }
    
    private void displayScores() {
        System.out.println("\nFinal Scores:");
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getScore());
        }
    }
    
    public static void main(String[] args) {
        Student[] students = {
            new Student("Alice"),
            new Student("Bob"),
            new Student("Charlie")
        };
        
        Quiz[] quizzes = {
            new Quiz("What is the capital of France?", new String[] {"Paris", "London", "Rome", "Berlin"}, 0),
            new Quiz("What is 5 + 7?", new String[] {"10", "11", "12", "13"}, 2),
            new Quiz("What is the boiling point of water?", new String[] {"100°C", "90°C", "110°C", "120°C"}, 0)
        };
        
        QUIZGAME game = new QUIZGAME(students, quizzes);
        game.startGame();
    }
}