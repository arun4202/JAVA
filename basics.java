public class Car {
    String color;
    int year;
    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }
    public void drive() {
        System.out.println("The car is driving.");
    }
    public int getCarAge(int currentYear) {
        return currentYear - year;
    }
}

//creating objects and calling methods
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Red", 2018);
        myCar.drive();
        int age = myCar.getCarAge(2025);
        System.out.println("Car age: " + age);
    }
}
