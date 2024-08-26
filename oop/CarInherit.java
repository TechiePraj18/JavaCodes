 class CarInherit {
    String type;
    String model;    
    double mileage;

    void display(){
        System.out.println("Type: "+ type);
        System.out.println("Model: "+ model);
        System.out.println("Mileage: "+ mileage);
    }
}

//child class
class vehicle extends CarInherit{
    String color;
    double price;

    public static void main(String[]args){

        //make object of child class
        vehicle v1 = new vehicle();
        v1.model = "Swift";
        v1.type = "Petrol/CNG";
        v1.mileage = 19.3;
        v1.color = "Red";
        v1.price = 700000;

        v1.display();
        System.out.println("Price : "+ v1.price);
        System.out.println("color : "+ v1.color);

        
    }
}
