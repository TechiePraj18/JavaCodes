//  Interface is used to achieve abstraction and multiple inheritance in java.Can have abstract methods and variables, It cannot have method or body.
// you cannot make object of interface.
 
 
 interface Car{
// Method (in interface u have to just declare method)
        public void start();
    }

        class ElectricCar implements Car{

            // implements interface so it is necessary to provide body to implemented method
            public void start(){
                System.out.println("Electric car Starts");
            }
        }

        class DieselCar implements Car{
            public void start(){
                System.out.println("Diesel car Starts");
            }
        }

       public class InterfaceDemo{
            public static void main(String[] args) {
                // to make object of interface this syntax is used
                // Interfacename anyname = new classname;
                
                Car Tesla = new ElectricCar();
                Car Scorpio = new DieselCar();

                Tesla.start();
                Scorpio.start();
            }
        }

    

