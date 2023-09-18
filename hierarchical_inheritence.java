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
class equitriangle extends Shape{
    public void area(int l,int s,int h){
        System.out.println(s*l*h);
    }
}
public class hierarchical_inheritence {
    public static void main(String[] args){
        equitriangle t1=new equitriangle();
        t1.area(3,7,4);
    }
}
