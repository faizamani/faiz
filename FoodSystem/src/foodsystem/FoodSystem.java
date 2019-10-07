/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodsystem;

/**
 *
 * @author My HP
 */
public class FoodSystem {

    /**
     * @param args the command line arguments
     */
   
    
    private String cafeName;
    private String customerType;
    private String foodName;
    
    FoodSystem(String cafeName,String customerType,String foodName){
        this.cafeName=cafeName;
        this.customerType=customerType;
        this.foodName=foodName;
    }
    
    String getCafe(){
        return cafeName;
    }
    String getCustomer(){
        return customerType;
    }
    
    String getFood(){
        return foodName;
    }
    
    void setType(String customerType){
        this.customerType = customerType;
    }
    void setFood (String foodName) {
        this.foodName = foodName;
    }








}
    
    
    
    

