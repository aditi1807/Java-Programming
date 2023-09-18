class me{
    String name;
    int age;
    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(String name,int age){
        System.out.println(name);
        System.out.println(age);

    }
    public void printinfo(int age){
        System.out.println(age);
    }

}

class Poly{
        public static void main(String[] args) {
            me s2=new me();
            s2.name="Aditi";
            s2.age=20;
            s2.printinfo(s2.name);
        }
    }
