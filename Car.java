

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
    public String getModel(){
        return model;
    }
    
    public int getYearMade(){
        return yearMade;
    }
    
    public String getCarNumber(){
        return carNumber;
    }
    
    //setters
    public void setCarNumber(String carNumber){
        this.carNumber=carNumber;
    }

    
    public void displayDetails(){
        System.out.println("Model:" +this.model);
        System.out.println("Year Made:" +this.yearMade);
        System.out.println("Car Number:" +this.carNumber);

    }
    
    // Compare this car's number with another car
    public void compareCarNumber(Car otherCar) {
        if (this.carNumber != null && this.carNumber.equals(otherCar.getCarNumber())) {
            System.out.println("Car numbers are the same.");
        } else {
            System.out.println("Car numbers are different.");
        }
    }
}

