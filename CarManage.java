/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vehicle;

import java.util.Scanner;
/**
 *
 * @author evtin
 */
public class CarManage {
       
        Scanner scanner = new Scanner(System.in);        
        Car[] cars = new Car[10];  //to store car data
                
                
    public CarManage(){   
        Car car1 = new Car("Honda", 2015 ,"MBT1234");       
        Car car2 = new Car("Proton", 2016 ,"MCJ5678");        
        Car car3 = new Car("Toyota", 2017 ,"MBJ7890");
        
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
    }   
    
    public void Menu(){
        boolean start = true;
        System.out.println("Vehicle Management System");
    do{
        start = true;
        System.out.println("1.Menu 2.AddCar 3.DeleteCar 4.FindCar 5.Cancel");
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();
        
        switch(choice){
        case 1:
            this.Menu();
            break;
        case 2:
            this.addCar();
            break;
        case 3:
            this.deleteCar();
            break;
        case 4:
            this.findCar();
            break;
        case 5:
            start = false;
            break;
        default:
            System.out.println("Key in again");
            break;
        }
    } while(start);
    System.out.println("Cancelled");   
    }
    
    
    //the way to find car
    private void findCar(){
        System.out.println("Enter car number that you need to find:");
        String findcarNumber = scanner.next();
        Car car = this.getcarDetails(findcarNumber);
        if (car == null){
            System.out.println("No Info");
        } else {
            car.displayDetails();
    }
    }
    
    //find car by using car number
    private Car getcarDetails(String findcarNumber){
        Car carDetails=null;
        for (Car car : cars){
            if (car != null){
                if (findcarNumber.equals(car.getCarNumber())){
                    carDetails = car;
            }
        }
    }
     return carDetails;
    }
    
    //show CarDetails
    private void showDetails(){
        for (Car car : cars) {
            if (car != null){
                car.displayDetails();
            }
        }
    }
    
    //Delete Car
    private void deleteCar(){
        System.out.println("Enter car number that need to delete:");
        String deletecarNumber = scanner.next();
        if (this.deletecarDetails(deletecarNumber)){
            System.out.println("Success");
            this.showDetails();      
        }else {
            System.out.println("Failed");
        }   
    }   
     
    private boolean deletecarDetails(String deletecarNumber){
        int index = -1;
        for (int i = 0; i < this.cars.length; i++){
            if (cars[i].getCarNumber() != null && cars[i].getCarNumber().equals(deletecarNumber)){
                index = i; //find the place that need to delete
                break;           
        }   
    }
        if (index == -1){
            System.out.println("Sorry car not found");
            return false;
        } else {
            for (int i = index; i < cars.length -1; i++){
                cars[i] = cars[i+1];
            }
            cars[cars.length -1] = null;
            return true;
        }
    }
       
    
     //Add Car
    private void addCar(){
           
        System.out.println("Enter car model:");
        String model = scanner.next();
        System.out.println("Enter car yearmade:");
        int yearMade = scanner.nextInt();
        System.out.println("Enter car number:");
        String carNumber = scanner.next();    

        Car carDetails = new Car (model, yearMade, carNumber);
        if (this.addcarDetails(carDetails)){
            System.out.println("Success");
            this.showDetails();      
        }else {
            System.out.println("Failed");
        }                
    }    
    
    private boolean addcarDetails(Car carDetails){
        for (int i = 0; i < cars.length; i++ ){
            if (cars[i] == null){
                cars[i] = carDetails;
                return true;
            }
        }
        return false;
    }
    
public static void main(String[] args) {    
    
    CarManage a = new CarManage();
    a.Menu();
}    
}

