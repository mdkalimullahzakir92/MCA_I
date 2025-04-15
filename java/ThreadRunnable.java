class hiii implements Runnable
{
    public void  run(){
        for(int i=0; i<5;i++){
            System.out.println("hi "+ Thread.currentThread().getPriority());
            try{Thread.sleep(500);}catch (Exception e){}
        }
    }
}
class hellooo implements Runnable
{
    public void run(){
        for(int i=0; i<5;i++){
            System.out.println("Hello");
            try{Thread.sleep(500);}catch (Exception e){}
        }
    }
}

public class ThreadRunnable {
    public static void main(String[] args) throws Exception {
        System.out.println("Abdullah");
        Runnable h = new hiii();
        Runnable he = new hellooo();
        Thread t1 = new Thread(h);
        Thread t2 = new Thread(he);
       t1.setName("Hi thread");
        t2.setName("Hello thread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        try{Thread.sleep(50);}catch(Exception e){}
        t2.start();


        t1.join();
        t2.join();

        System.out.println(t1.isAlive());
        System.out.println("go");




    }
}
