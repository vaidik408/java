/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Harryprac;

import java.util.Scanner;

public class Prac_marks_percentage {
    public static void main(String[] args){
        System.out.println("Marks of Students");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sub1 Marks");
        int a = sc.nextInt();
        System.out.println("Enter Sub2 Marks");
        int b = sc.nextInt();
        System.out.println("Enter Sub3 Marks");
        int c = sc.nextInt();
        System.out.println("Enter Sub4 Marks");
        int d = sc.nextInt();
        System.out.println("Enter Sub5 Marks");
        int e = sc.nextInt();
        int sum = a+b+c+d+e;
        int per=(sum/5);
        System.out.println(per);
        
    }
    
}
