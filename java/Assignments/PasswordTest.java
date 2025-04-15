package Assignments;

import java.util.Random;
class PasswordTest {
        static String PasswordGenerator() {
                Random ran = new Random();
                int n = ran.nextInt(8, 15);
                char[] pwd = new char[n];

                char[] lowerCase = new char[26];
                char[] upperCase = new char[26];
                char[] digits = new char[10];
                char[] specialSymbols = { '~', '!', '@', '#', '$', '%', '^', '&', '*', '_', '-', '+', '=', '`', '|',
                                '\\', '(', ')', '{', '}', '[', ']', ':', ';', '"', '\'', '<', '>', ',', '.', '?', '/' };
                for (int i = 0; i < 10; i++) {
                        digits[i] = (char) ('0' + i); // add i to ascii value of '0' and then convert to char
                }
                for (int i = 0; i < 26; i++) {
                        upperCase[i] = (char) ('A' + i);
                        lowerCase[i] = (char) ('a' + i);
                }

                int x = ran.nextInt(26);
                pwd[0] = upperCase[x];
                x = ran.nextInt(26);
                pwd[1] = lowerCase[x];
                x = ran.nextInt(10);
                pwd[2] = digits[x];
                x = ran.nextInt(32);
                pwd[3] = specialSymbols[x];

                for (int i = 4; i < n; i++) {
                        int j = ran.nextInt(4), k;
                        if (j == 0) {
                                k = ran.nextInt(26);
                                pwd[i] = upperCase[k];
                        } else if (j == 1) {
                                k = ran.nextInt(26);
                                pwd[i] = lowerCase[k];

                        } else if (j == 2) {
                                k = ran.nextInt(10);
                                pwd[i] = digits[k];
                        } else {
                                k = ran.nextInt(32);
                                pwd[i] = specialSymbols[k];
                        }
                }
                pwd = shuffleArray(pwd);
                return String.valueOf(pwd);
        }
        static char[] shuffleArray(char [] arr){
                for(int i=arr.length-1; i>=0; i--){
                        Random r = new Random();
                        int j = r.nextInt(i+1);
                        char t = arr[i];
                        arr[i] = arr[j];
                        arr[j] = t;
                }
                return arr;
        }
        public static void main(String[] args) {
                for (int i = 0; i < 100; i++) {
                        System.out.println("Password "+ (i+1) + " :" + PasswordGenerator());
                }
        }
}