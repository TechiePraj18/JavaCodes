
// Static keyword is used for memory management
// we can apply static keyword with variables, methods, blocks and nested classes
// static keyword belongs to class than an instance of the class

// 1. Static Vraiable - used to refer common property of all objects
// 2. Static Method - if you apply static keyword with any method , its is known as static method. 
                    //  this and super keyword cannot be used with static context


// static method can only refer to static method only.it does not refer to non static method. Example downside
public class statickey {

    // non static method
    // but if we add static to this method it become static and can be refered by another static method
    public static void printhello(){
        System.out.println("hello" );
    }

    // Static method
    public static void main(String[] args) { 
        printhello();
    }

    
}

