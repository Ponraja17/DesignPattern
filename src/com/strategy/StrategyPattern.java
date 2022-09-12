package com.strategy;

import java.util.Scanner;

public class StrategyPattern {
	 public static void main(String[] args) throws NumberFormatException {  
         
         Scanner input = new Scanner(System.in);
		 System.out.print("Enter the first value: ");  
		 int value1= input.nextInt();
         System.out.print("Enter the second value: ");  
		 int value2= input.nextInt();
         Executor Execute = new Executor(new Addition());          
         System.out.println("Addition = " + Execute.executeStrategy(value1, value2));  
 
         Execute = new Executor(new Substraction());       
         System.out.println("Subtraction = " + Execute.executeStrategy(value1, value2));  
 
      }  
}
