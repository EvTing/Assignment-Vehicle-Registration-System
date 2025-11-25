

package com.vehicle;

public class Car {
    
    private String model; //attributes
    private int yearMade; //attributes
    private String carNumber; //attributes
    
    //constructor
    public Car(String model,int yearMade){
        this.model=model;
        this.yearMade=yearMade;
    }
   
    public Car(String model,int yearMade, String carNumber){
        this.model=model;
        this.yearMade=yearMade;
        this.carNumber=carNumber;
    }
      
    
    //getters
    public String getmodel(){
        return model;
    }
    
    public int getyearMade(){
        return yearMade;
    }
    
    public String getcarNumber(){
        return carNumber;
    }
    
    //setters
    public void setcarNumber(String carNumber){
        this.carNumber=carNumber;
    }

    
    public void displayDetails(){
        System.out.println("Model:" +this.model);
        System.out.println("Year Made:" +this.yearMade);
        System.out.println("Car Number:" +this.carNumber);

    }        
}
