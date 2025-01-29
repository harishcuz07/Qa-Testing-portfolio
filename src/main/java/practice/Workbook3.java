package practice;

import org.testng.annotations.Test;

public class Workbook3 {

    public class Car {
        private String model;
        private int speed;
        private int mileage;

        public Car(String model,int speed) {
            this.model = model;
            this.speed = speed;
         
        }

        public void displayDetails() {
            System.out.println("Model: " + this.model + ", Speed: " + this.speed);
        }
        public void car(int speed , int mileage) {
    	
    	}
    }
   

   @Test
    public void testCarDetails() {
        Car car1 = new Car("Tesla", 120);
        Car car2 = new Car("BMW", 150);
    
        car1.displayDetails();
        car2.displayDetails();
    }
}
