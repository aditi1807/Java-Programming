package oops;
class Shape{
    public void area(){
        System.out.println("the shape is triangle");
    }
}
class triangle extends Shape{
    public void area(int l,int h){
        System.out.println(l*h);
    }
}
    public class single_inheritence {
    public static void main(String[] args){
        triangle t1=new triangle();
        t1.area(3,7);
    }
}
