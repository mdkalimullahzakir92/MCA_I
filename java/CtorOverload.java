import java.lang.Math;
class Circle{
        double r;
        Circle(){
                r = 0.0;
        }
        Circle(double x){
                r = x;
        }
        public double findArea(){
                return (Math.PI * r * r);
        }
}
public class CtorOverload {
        public static void main(String[] args) {
                Circle c1 = new Circle();
                Circle c2 = new Circle(7.0);
                System.out.println("Area of c1= "+ c1.findArea());
                System.out.println("Area of c2= "+ c2.findArea());
                
        }
        
}
