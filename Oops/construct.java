class Student{
    int id;
    int age;



// Parameterized constructor of student is created.
// this keyword is used to assign value to variable.
    Student(int id,int age){
        this.id = id;
        this.age = age;
        System.out.println("Parameterized Constructor");

    }
    // Default constructor
    Student(){
        System.out.println("Default constructor");

    }
}


public class construct{
    public static void main(String args[]){
        // Student object is created
         Student s1 = new Student(2,26);
        // Student s2 = new Student();
        System.out.println(s1.id);
    }

}