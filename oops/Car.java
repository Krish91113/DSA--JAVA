package oops;

public class Car {
    private String color;
    private String model;
    private int speed;
    private int price;

    // public Car(String color, String model, int speed, int price) {
    //     this.color = color;
    //     this.model = model;
    //     this.speed = speed;
    //     this.price = price;
    // }
    // public void DisplayCar(){
    //     System.out.println("c " + color + " m " + model + " p " + price + " s " + speed );
    // }
    // public void Setcolor(String color){
    //     this.color = color;
    //     System.out.println(color);
    // }
    // public String Setcolor(){
    //     return this.color;
    // }

    public void price (int price)throws Exception{
        if(price < 0){
            throw new Exception("Price kabhi negative nai hota mitra");
        }
        this.price = price;
        System.out.println(price);
    }
}


