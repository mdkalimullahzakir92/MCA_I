#include <iostream>
#include <cmath> // To use sqrt function

using namespace std;
void printPrimeFactors(int n) {
    // Print the number of 2s that divide n
    while (n % 2 == 0) {
        cout << 2 << " ";
        n /= 2;
    }
    // n must be odd at this point, so we can skip one element (i.e., i = i + 2)
    for (int i = 3; i <= sqrt(n); i += 2) {
        // While i divides n, print i and divide n
        while (n % i == 0) {
            cout << i << " ";
            n /= i;
        }
    }
    // This condition is to handle the case when n is a prime number
    // greater than 2
    if (n > 2) {
        cout << n;
    }
}
int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;
    cout << "Prime factors of " << n << " are: ";
    printPrimeFactors(n);
    cout << endl;
    return 0;
}
