
//class ,then function ,then object ,then call function
public class function {

    int id;
    String name;

   //function
    public void dog(){
        System.out.println("id : "+ id +" "+"Name : "+ name + " is alive");
    }
    

public static void main(String[]args){
    function f1 = new function(); //object
    f1.id = 1;
    f1.name = "Tommy";
    f1.dog(); //function call


}
}
