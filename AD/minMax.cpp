#include<iostream>
#define n 10
using namespace std;
int main(){
        int a[n] = {12,24,11,10,23,15,11,34,20,33};
        int min,max;
        min=max=a[0];
        for(int i=1; i<n;i++){
                if (max<a[i])
                        max=a[i];
                else if(min > a[i])
                        min= a[i];
        }
        cout<<"Minimum = "<< min<< " Maximum = "<< max;
        return 0;

}