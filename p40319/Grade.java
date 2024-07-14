/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082009.p40319;

import java.util.Scanner;

/**
 *
 * @author N I P
 */
public class Grade {
    public static void main(String[] args){
        double grade;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        grade = input.nextInt();
        
        if( grade >= 90){
            System.out.println("Excellent!");
        }
        else if((grade < 90) && (grade >= 80)){
            System.out.println("Good Job!");
        }
        else if((grade < 80) && (grade >= 60)){
            System.out.println("Study harder!");
        }
        else{
            System.out.println("Sorry, you failed.");
        }
    }
    
}
