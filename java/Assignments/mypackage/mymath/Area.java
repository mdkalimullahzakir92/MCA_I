package mypackage.mymath;

public class Area {
        private double a, b, c;

        public double circle(double radius) {
                return (Math.PI * radius * radius);
        }

        public double rectangle(double length, double breadth) {
                return (length * breadth);
        }

        private double findPerimeter() {
                return (a + b + c);
        }

        public double triangle(double side1, double side2, double side3) {
                a = side1;
                b = side2;
                c = side3;
                double s = findPerimeter() / 2.0;
                return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
}
