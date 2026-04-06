#include<iostream>

using namespace std;

int gcd(int num1, int num2) {
    
    int divisor =  min(num1, num2), dividend = max(num1, num2);
    
    int rem, quot;
    while(1) {
        rem = dividend % divisor;
        quot = dividend / divisor;
        if(rem == 0) {
            cout<<divisor<<" is the GDC of "<<num1<<" and "<<num2;
            break;
        }

        dividend = quot;
        divisor = rem;
    }

}

int main() {
    int num1, num2;
    cin>>num1>>num2;

    if(num2 == 0 || num1 == 0) {
        cout<<"Please do no enter 0 values.";
    }

    else if(num2 == 1 || num1 == 1) {
        cout<<"The GCD of both the numbers is 1.";
    }

    else {
        cout<<gcd(num1, num2);
    }
        
    return 0;
}

/*

LOGIC:

num1 = 13, num2 = 3

--> num1 / num2 : remainder = 1, quotient = 4
--> num1 = quotient, num2 = remainder --> remainder = 0

*/