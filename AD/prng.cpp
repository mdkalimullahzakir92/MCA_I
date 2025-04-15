#include <iostream>
using namespace std;
void random(int &x)
{
        // Variables
        const int m = 4096; // modulus
        const int a = 109;  // multiplier
        const int b = 853;  // increment

        // Generate pseudo-random number
        for (int i = 0; i <= 10; i++)
        {
                x = (a * x + b) % m;
                cout << x << " ";
        }

        // Assertion: 0 <= x <= m-1
        if (x < 0)
        {
                x += m;
        }
}

int main()
{
        int x;
        std::cout << "Enter an initial value for x: ";
        std::cin >> x;

        random(x);

        std::cout << "The pseudo-random number is: " << x << std::endl;

        return 0;
}
