/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Harryprac;
import java.util.Scanner;
public class Prac_scanner {
    public static void main(String[] args){
        System.out.println("taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        /*******for int scanning*******/
        //int a = sc.nextInt();
         /*******for float scanning*******/
        //float a = sc.nextFloat();
        System.out.println("enter number 2");
       // int b = sc.nextInt();
       //float b = sc.nextFloat();
        //int sum=a + b;
        //float sum = a+b;
        //System.out.println("answer is "+sum);
         /*******for int checking is it int or not *******/
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
         
    }
        
}
