public class OOPS {

    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setColor("blue");
        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }
}

class pen {
    private String color;
    private int tip;

    int getTip(){
        return this.tip;
    }
    String getColor(){
        return this.color;
    }
    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
}

class Student {
    String name;
    int age;
    int roll;

    void setName(String newName){
        name = newName;
    }

    void setAge(int newAge){
        age = newAge;
    }

    void setRoll(int newRoll){
        roll = newRoll;
    }
}