// 1. abstratc keyword is used to implement abstract class.
// 2. We can make object of general class but we cannot make of abstract class
// 3. Abstract class also has its own abstract methods.
// 4. Cannot provide body to Abstract method, just declare and leave as it is. 
// 5. Abstract class is used when we want to inherit from another class.
//    also we can write normal method in abstract class
//    after extending car class it throws error so make class tata as abstract or implement fuel type method in another class



    abstract class car{

        // abstract method - 3
        // user will only see this method it will not able to see method implementation

       abstract public void fueltype();

    // normal method
       public void color(){

        System.out.println("Black colour");
       }
    }

    class tata extends car{

        public void fueltype(){

            System.out.println("Petrol");

        }

    }

     class main{

        public static void main(String[] args) {
            tata nexon = new tata();
            nexon.fueltype();
            nexon.color();
        }
    }










    

