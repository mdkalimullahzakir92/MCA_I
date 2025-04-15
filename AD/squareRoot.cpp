// FINDING A SQUARE ROOT OF A NUMBER
/*
abs(intNum) calculates the absolute value of the integer intNum.

fabs(doubleNum) calculates the absolute value of the floating-point number doubleNum.
*/
#include<iostream>
#include<cmath>
using namespace std;

int main(){
        double n = 36;
        double err = 0.000001;
        double g2 = n/2, g1;
        do{
                g1 = g2;
                g2 = (g1 + n/g1)/2;
        }while(fabs(g1-g2)>err);
        cout<<"Square root of "<< n << " is " << g2;
        return 0;
}