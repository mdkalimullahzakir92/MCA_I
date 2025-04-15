class Hi extends Thread
{
    public void  run(){
        for(int i=0; i<5;i++){
            System.out.println("hi");
            try{Thread.sleep(500);}catch (Exception e){}
        }
    }
}
class  Hello extends Thread
{
    public void run(){
        for(int i=0; i<5;i++){
            System.out.println("Hello");
            try{Thread.sleep(500);}catch (Exception e){}
        }
    }
}

public class MulthreadingDemo {
    public static void main(String[] args) {
        System.out.println("Abdullah");
        Hi h = new Hi();
        Hello he = new Hello();
        h.start();
        try{Thread.sleep(50);}catch(Exception e){}
        he.start();




    }
}
