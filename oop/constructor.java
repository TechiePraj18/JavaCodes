
//make class then constructor and object
public class constructor {
    int id;
    String name; 

    //Parametrized constructor

    constructor(int id, String name){

        //this is known as reference variable refer to current object in method or constructor
        this.id =id;
       this. name = name;
    }

    public static void main(String[]args){

        constructor c1 = new constructor(1, "Prajwal");
        System.out.println("Rollno: "+ c1.id +" "+  "Name: "+ c1.name);
    }


    
    
}
