package Assignments;

import java.util.Scanner;

class Numbers{
    static boolean checkPrime(int n){
        if(n%2 == 0)
            return false;
        for(int i=3; i<=Math.sqrt(n); i+=2){
            if(n%i == 0)
                return false;
        }
        return true;
    }

    static public void generatePrimes(int n){
        int p=3;
        System.out.println(2+ "--prime--");
        for(int i=1; i<n; i++){
            if(checkPrime(p))
                System.out.println(p+ "--prime--");
            else
                i--;
            p+=2;
        }

    }
    static void generateFibonacci(int n) {
        int f1 = 0, f2 = 1, f3;
        System.out.println(f1 + "--fib--");
        System.out.println(f2 + "--fib--");
        for (int i = 2; i < n; i++) {
            f3 = f1 + f2;
            System.out.println(f3 + "--fib--");
            f1 = f2;
            f2 = f3;
        }
    }
}

class PrimeThread extends Thread{
    private final int n;
    PrimeThread(int n){
        this.n = n;
    }
    public void run(){
        Numbers.generatePrimes(n);
    }
}
class FibonacciThread implements Runnable{
    private final int n;

    FibonacciThread(int n){
        this.n = n;
    }
    public void run(){
        Numbers.generateFibonacci(n);
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("Abdullah");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        PrimeThread pt = new PrimeThread(n);
        FibonacciThread ft = new FibonacciThread(n);
        pt.start();
        Thread fibT = new Thread(ft);
        fibT.start();
        sc.close();
    }
}
/*
Enter the value of n:
50
2--prime--
3--prime--
5--prime--
0--fib--
7--prime--
11--prime--
13--prime--
17--prime--
19--prime--
23--prime--
29--prime--
1--fib--
31--prime--
37--prime--
41--prime--
43--prime--
47--prime--
53--prime--
1--fib--
2--fib--
3--fib--
5--fib--
8--fib--
13--fib--
21--fib--
34--fib--
55--fib--
89--fib--
144--fib--
59--prime--
61--prime--
233--fib--
377--fib--
610--fib--
987--fib--
67--prime--
71--prime--
73--prime--
79--prime--
83--prime--
1597--fib--
2584--fib--
4181--fib--
89--prime--
97--prime--
101--prime--
6765--fib--
10946--fib--
17711--fib--
28657--fib--
46368--fib--
75025--fib--
121393--fib--
196418--fib--
317811--fib--
514229--fib--
103--prime--
107--prime--
109--prime--
113--prime--
127--prime--
131--prime--
832040--fib--
1346269--fib--
2178309--fib--
3524578--fib--
5702887--fib--
9227465--fib--
14930352--fib--
24157817--fib--
39088169--fib--
137--prime--
139--prime--
149--prime--
151--prime--
157--prime--
163--prime--
63245986--fib--
102334155--fib--
165580141--fib--
267914296--fib--
433494437--fib--
701408733--fib--
1134903170--fib--
167--prime--
173--prime--
179--prime--
1836311903--fib--
-1323752223--fib--
512559680--fib--
-811192543--fib--
181--prime--
191--prime--
193--prime--
197--prime--
199--prime--
211--prime--
223--prime--
227--prime--
229--prime--

* */