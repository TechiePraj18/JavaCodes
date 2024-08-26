
//overriding have same function name, same parameter and same return type
// We have to make object of class name.


    class Bankoverride{
        public void RateofInterest(){
            System.out.println("Generally rate of interest is 6%");
        }
    }
    class SBI extends Bankoverride{
        @Override
        public void RateofInterest(){
            System.out.println("Generally rate of interest is 7.3%");

        }

    }
    class HDFC extends Bankoverride{
        @Override
        public void RateofInterest(){
            System.out.println("Generally rate of interest is 8%");
        }
    }

    //Main method must be in class named "Main"

    class main{

    public static void main(String[] args) {

        // classname objname = new classname (Syntax of object)
        Bankoverride obj1 = new Bankoverride();
        SBI obj2 = new SBI();
        HDFC obj3 = new HDFC();

        obj1.RateofInterest();
        obj2.RateofInterest();
        obj3.RateofInterest();

    }
}
    

