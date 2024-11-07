/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizgame;

/**
 *
 * @author RC_Student_lab
 */
public class Student extends Person {
    private int score;
    
    public Student(String name) {
        super(name);
        this.score = 0; // Initialize score to 0
    }
    
    @Override
    public String getName() {
        return super.getName();
    }
    
    public void increaseScore(int points) {
        this.score += points;
    }
    
    public int getScore() {
        return score;
    }
}
