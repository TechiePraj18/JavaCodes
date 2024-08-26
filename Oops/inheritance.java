
// Parent class or super class
class vehicle{
    double mileage;
    String model;
    double price;

    void display(){
        System.out.println(mileage);
        System.out.println(model);
        System.out.println(price);
    }
}
// child class or base class
class car extends vehicle{
    String color;
    String ftype;
    String brand;

    void show(){
        System.out.println(color);
        System.out.println(ftype);
        System.out.println(brand);
    }

}
public class inheritance {
    public static void main(String[] args) {
        car car1 = new car();
        car1.mileage = 20;
        car1.brand = "Maruti suzuki";
        car1.model = "Wagonr";
        car1.price = 400000;
        car1.ftype = "Petrol";
        car1.display();
        car1.show();
    }

    
}
