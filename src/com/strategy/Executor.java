package com.strategy;

public class Executor {
	  private Strategy strategy;  
      
      public Executor(Strategy strategy){  
         this.strategy = strategy;  
      }  
 
      public int executeStrategy(int num1, int num2){  
         return strategy.Calculation(num1, num2);  
      }  

}
