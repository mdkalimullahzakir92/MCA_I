package out.production.gitFolder;

//import static java.lang.System.arraycopy;

//import static java.lang.Math.sqrt;

public class Test {
    static void fibonacci(int n){
        int f1=0, f2=1,f3;
        System.out.println(f1+ "--fib--");
        System.out.println(f2+ "--fib--");
        for(int i=2; i<n; i++){
            f3 =f1+f2;
            System.out.println(f3 + "--fib--");
            f1= f2;
            f2= f3;
        }
    }
    public static void main(String[] args) {
        System.out.println("Abdullah");
        int n=12;
    }
}
