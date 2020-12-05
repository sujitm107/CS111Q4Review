public class Racecar{

    // In the beginning, the car has a full tank of gas and is going 0 MPH.public 
    public Racecar(int capacity){
        
    }
    
    // Gets the current speed of the car
    public int getCurrentSpeed(){

    }
    
    // Attempts to accelerate the car.
    // If there isn’t enough fuel, this function should return false
    // If there is enough fuel, you should decrease the amount of fuel by 1 and increase thespeed by 10.
    public boolean accelerate(){

    }
    
    // This function should return true if the car is out of fuel, and false otherwise.
    public boolean isOutOfFuel(){

    }
    
    // This function is meant to refuel the car.
    // Given the costPerGallon, compute and return how much the total bill to refuel the tankis, and then refill the tank to capacity.
    public double refuel(double costPerGallon){

    }

    public static void main(String[] args){
        Racecar r = new Racecar(2);
        r.isOutOfFuel();
        r.accelerate();
        r.refuel(3.10);
        r.getCurrentSpeed();
        r.accelerate();
        r.getCurrentSpeed();
        r.accelerate();
        r.getCurrentSpeed();
        r.accelerate();
        r.getCurrentSpeed();
        r.isOutOfFuel();
        r.refuel(3.20);
    }
}
    
    