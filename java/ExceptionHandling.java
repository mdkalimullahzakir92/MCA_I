class InvalidDayException extends Exception{
    public String toString(){
        return "Invalid day";
    }
}

public class ExceptionHandling {
    static int divide(int a, int b) throws ArithmeticException{
        if(b==0)
            throw new ArithmeticException("Cannot divide by zero.");
        return a/b;
    }
    public static void main(String[] args) {
        System.out.println("Abdullah");
        int a= 90;
        try{
            if(a>30 || a<1)
                throw new InvalidDayException();
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            int res= divide(10, 0);
            System.out.println(res);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
