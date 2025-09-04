package oops;

public class Car {
    String color;
    String model;
    int speed;
    int price;

    public Car(String color, String model, int speed, int price) {
        this.color = color;
        this.model = model;
        this.speed = speed;
        this.price = price;
    }
    public void DisplayCar(){
        System.out.println("c " + color + " m " + model + " p " + price + " s " + speed );
    }
}


