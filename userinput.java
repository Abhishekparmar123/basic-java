/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author abhis
 */
import java.util.Scanner;

public class userinput 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int age;
        System.out.println("enter your name : ");
        String name = obj.nextLine();
        System.out.println("enter your age : ");
        age = obj.nextInt();
        System.out.println("user name : "+name);
        if(age>=18)
        {
            System.out.println("You are eligible to vote....");
            
        }
        else
        {
            System.out.println("You are not eligible .....");
        }
    }
}
