class Triangle{
        private double a, b, c;
        Triangle(){
                a=b=c=1.0;
        }
        Triangle(double side1, double side2, double side3){
                a= side1;
                b= side2;
                c= side3;
        }
        double findPerimeter(){
                return (a+b+c);
        }
        double findArea(){
                double s = findPerimeter() /2.0;
                return (Math.sqrt(s* (s-a) * (s-b) * (s-c)));
        }
        boolean isTrianglePossible(){
                if(a+b > c && b+c >a && c+a> b)
                        return true;
                else
                        return false;
        }
        boolean isRightTriangle(){
                if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c,2) || b*b + c*c == a*a || c*c + b*b == a*a)
                        return true;
                else    
                        return false;
        }
        boolean isEquilateral(){
                if (a==b && b==c && c==a)
                        return true;
                else    
                        return false;
        }
        boolean isIsoscelesTriangle(){
                if(a==b || b==c || c==a)
                        return true;
                else
                        return false;
        }
} 

public class TringleTest{
        public static void main(String[] args) {
                Triangle t1 = new Triangle();
                Triangle t2 = new Triangle(4.0, 4.0, 6.0);
                Triangle t3 = new Triangle(4.0, 4.0, 4.0);
                Triangle t4 = new Triangle(3.0, 4.0, 5.0);
                System.out.println("Perimeter of t1 = " + t1.findPerimeter());
                System.out.println("Area of t1 = "+ t1.findArea());
                System.out.println("Perimeter of t2 = " + t2.findPerimeter());
                System.out.println("Area of t2 = "+ t2.findArea());
                System.out.println("is triangle t2 possible? "+ t1.isTrianglePossible());
                System.out.println("is t3 right triangle: "+ t3.isRightTriangle());
                System.out.println("is t4 Equilateral triangle: "+ t3.isEquilateral());
                System.out.println("is t4 right triangle: "+ t4.isRightTriangle());
                System.out.println("is t2 Isosceles triangle: "+ t2.isIsoscelesTriangle());
                
                System.out.println("is triangle t1 possible? "+ t1.isTrianglePossible());
                System.out.println("is t1 right triangle: "+ t1.isRightTriangle());
                System.out.println("is t1 Equilateral triangle: "+ t1.isEquilateral());
                System.out.println("is t1 Isosceles triangle: "+ t1.isIsoscelesTriangle());
        }
}