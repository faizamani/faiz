/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodsystem;

import java.util.Scanner;

/**
 *
 * @author My HP
 */

public class FoodCafe {
    
public static void main(String[] args) {
        // TODO code application logic here
  Scanner scan =new Scanner(System.in);
  Scanner scanstr = new Scanner(System.in);
  
  System.out.print("Where the place do you want to eat");
  
  int num = scan.nextInt();
    Food food [] = new Food (num);
   
  
    for (int i =0 ; i <num; i++) {
      System.out.print("Enter Cafe Name");
      String cafeName = scanstr.nextLine();
      System.out.print("Enter Customer Type");
      String customerType =scanstr.nextLine();
      System.out.print("Enter Food Name");
      String foodName= scanstr.nextLine();
      food[i] = new Food ( cafeName,customerType,food);
      
  }
    
    System.out.println("Please Insert Cafe Name");
    System.out.println("Please select your type");
    
    for (int i =0 ; i <num; i++) {
        System.out.print(food[i].getcustomer()+ "\t");
        System.out.println(food[i].getFood());
        
    
        
        
    }
  
  
  
  
  

}
}
