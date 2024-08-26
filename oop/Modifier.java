class Modifier {

    private String name;
    private int roll_no;
    private int age;

//we have to make constructor to access datamember, if we have made datamember private
    Modifier(String name, int roll_no, int age){

        this.name = name;
        this.roll_no =  roll_no;
        this.age=age;

    }
//Method or function
    void student(){
        System.out.println(name);
        System.out.println(roll_no);
        System.out.println(age);
    }

}
class main{
    public static void main(String[] args) {
        Modifier s1 = new Modifier("Prajwal",101,21);
        s1.student();
    }
}
