package com.factory;
import java.util.Scanner;

public class FactoryMain {
	  public static void main(String args[]){  
		  
	      GetPlanFactory planFactory = new GetPlanFactory();  
	      
	        Scanner input = new Scanner(System.in);
	        
	      System.out.print("Enter the name of plan for which the bill will be generated: ");  
	      String planName = input.nextLine();
	      int units = 100;
	    
	       Plan p = planFactory.getPlan(planName);  	  
	       System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
	           p.getRate();  
	           p.calculateBill(units);  
	            }  

}
