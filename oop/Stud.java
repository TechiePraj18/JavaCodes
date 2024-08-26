 
//  Encapsulation Code
 class Stud{

        private String name;
        private int rollno;
        private int age;


        public String getName(){
            return name;

        }

        public int getRollno(){
            return rollno;

        }
        public int getAge(){
            return age;

        }

        public void setName(String name){
            this.name = name;
        }

        public void setRollno(int rollno){
            this.rollno = rollno;
        }

        public void setAge(int age){
            this.age = age;

        }

        public class main{

            public static void main(String[] args) {
                
                Stud s1 = new Stud();
                s1.setName("Prajwal");
                s1.setAge(21);
                s1.setRollno(22);

                System.out.println(s1.getName());
                System.out.println(s1.getAge());
                System.out.println(s1.getRollno());
            }
        }

    }
    

