public class OOPS {

    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setColor("blue");
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
}

class pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
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