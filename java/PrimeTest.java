public class PrimeTest {
    static boolean checkPrime(int n){
        if(n%2 == 0)
            return false;
        for(int i=3; i<=Math.sqrt(n); i+=2){
            if(n%i == 0)
                return false;
        }
        return true;
    }

    static void generatePrimes(int n) {
        int p = 3;
        System.out.println(2 + " ");

        int count =1;
        while(count< n){
            if(checkPrime(p)) {
                System.out.println(p);
                count++;
            }
            p+=2;

        }
    }
        public static void main(String[] args) {
        int n=19;
        generatePrimes(n);
    }
}
