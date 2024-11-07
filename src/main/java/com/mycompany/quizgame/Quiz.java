/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizgame;

/**
 *
 * @author RC_Student_lab
 */
public class Quiz {
    private String question;
    private String[] options;
    private int correctOption;
    
    public Quiz(String question, String[] options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }
    
    public boolean askQuestion() {
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ": " + options[i]);
        }
        System.out.print("Your answer: ");
        
        // Take user input for answer
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int answer = scanner.nextInt();
        
        return (answer - 1) == correctOption;
    }
}
