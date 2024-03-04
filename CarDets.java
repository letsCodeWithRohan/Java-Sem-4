/** Experiment - 18 - Write a program in Java which has a class Car having two instance
variables topSpeed and name. Override toString() method in Car
class. Create 5 instances of Car class and print the instances. */

public class CarDets {
    public static void main(String[] args) 
	{
        Car car1 = new Car("Toyota", 180);
        Car car2 = new Car("Honda", 200);
        Car car3 = new Car("Ford", 220);
        Car car4 = new Car("BMW", 240);
        Car car5 = new Car("Mercedes", 250);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}

class Car 
{
    private int topSpeed;
    private String name;

    public Car(String name, int topSpeed) 
	{
        this.name = name;
        this.topSpeed = topSpeed;
    }
	
	public String toString() 
	{
        return "Car { " +
                "name= '" + name + '\'' +
                ", topSpeed=" + topSpeed +
                '}';
    }
}