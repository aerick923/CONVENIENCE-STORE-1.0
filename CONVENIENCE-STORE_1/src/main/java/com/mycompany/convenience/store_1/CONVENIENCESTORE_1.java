/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.convenience.store_1;

/**
 *
 * @author USER
 */

// FEBRUARY 8, 2026: STARTING POINT

// FEBRUARY 9, 2026: 
// FEATURES ADDED:
// scanner
// variable
// user input

// FEBRUARY 11, 2026:
// FEATURES ADDED:
// switch

// ERROR/S FIXED: parsing error
// SOLUTION: watched a youtube tutorial regarding curly bracket placements

// FEBRUARY 12, 2026:
// FEATURES ADDED: 
// input statements under case 1
// input statements under case 2
// farewell message to customer when exiting the program

// FEBRUARY 13, 2026:
// FEATURES ADDED: 
// variables
// input statements under case 3

import java.util.Scanner;

public class CONVENIENCESTORE_1 
{
    public static void main(String[] args) 
    {
        Scanner myObj = new Scanner(System.in);
        int choice = 0;
        String name;
        char gender; 
        
        System.out.println("===== WELCOME TO THE CONVINIENCE STORE! =====");
        System.out.println("[1] CREATE ACCOUNT");
        System.out.println("[2] MENU");
        System.out.println("[3] ATM");
        System.out.println("[4] EXIT PROGRAM");
        System.out.println("ENTER YOUR CHOICE: ");
        choice = myObj.nextInt();
        
            switch (choice)
            {
            case 1:
                System.out.println("===== CREATE ACCOUNT =====");
                System.out.println("[1] ENTER NAME: ");
                System.out.println("[2] ENTER GENDER (M/F/OTHER): ");
                System.out.println("[3] ENTER AGE: ");             
                break; 
            
            case 2:
                System.out.println("===== MENU =====");
                System.out.println("[1] CHECK STOCK "); 
                System.out.println("[2] PICK MENU ");                
                break; 
                
            case 3:
                System.out.println("===== ATM =====");
                System.out.println("[1] WITHDRAW "); 
                System.out.println("[2] DEPOSIT "); 
                break; 
                
            case 4:
                System.out.println("THANK YOU FOR USING THE CONVENIENCE STORE! PLEASE VISIT US AGAIN!");
                break;
                
                default:
                System.out.println("Looking forward to the Weekend");
           }          
    }     
}
