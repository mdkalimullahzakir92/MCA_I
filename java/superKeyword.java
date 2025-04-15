class A{
    int a, b;
    A(int x){
        a= x;
    }
    void show(){
        System.out.println("value of a in super "+ a);
    }
}
class B extends A{
    int a;
    B(int var1, int var2){
        super(var1);
        a = var2;
    }
    void show(){
        super.show();
        System.out.println("value of a in sub "+ a);

    }
    void display(){
        super.a= 2;
        super.show();
    }

}

public class superKeyword {
    public static void main(String[] args) {
        System.out.println("Abdulah");
        A a =new A(90);
        B b = new B(10, 20);
        a.show();
        b.show();
        b.display();
    }
}
