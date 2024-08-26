// multiple inheritance can be achieved using interface
// make object of class
// interface only contains method

interface Animal{
    // method
    public void run();
    
}
class tiger implements Animal{
    public void run(){
        System.out.println("Tiger runs");
    }
}

class lion implements Animal{
    public void run(){
        System.out.println("Lion runs");
    }
}

class main{
    public static void main(String[] args) {
        Animal tiger = new tiger();
        Animal lion = new lion();

    }
}
