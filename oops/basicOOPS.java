package oops;
class Student{
    String name;
    int age;
    public void printing(){ // function or method
        System.out.println(this.name);// this is a keyword
        System.out.println(this.age); 
    }
    Student(String name, int age){ Parameterized Constructor
        this.name=name;
        this.age=age;
    }
}
    public class basicOOPS {
        public static void main(String[] args) {
            Student s1=new Student("Aditi",20); // object s1 student() is constructor 
            s1.printing();
        }
    }
    class Student{
    String name;
    int age;
    public void printing(){ // function or method
        System.out.println(this.name);// this is a keyword
        System.out.println(this.age); 
    }
}
    public class basicOOPS {
        public static void main(String[] args) {
            Student s1=new Student(); // object s1 student() is constructor 
            s1.name="Aditi";
            s1.age=20;
            s1.printing();
        }
    }
    class Student{
    String name;
    int age;
    public void printing(){ // function or method
        System.out.println(this.name);// this is a keyword
        System.out.println(this.age); 
    }
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    Student(){

    }
}
    public class basicOOPS {
        public static void main(String[] args) {
            Student s2=new Student();
            s2.name="Aditi";
            s2.age=20;
            Student s1=new Student(s2); //Copy Constructor
            
            s1.printing();
        }
    }
    
// Java does't need destructor becouse it has garbage collector

