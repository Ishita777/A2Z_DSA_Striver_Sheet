#include<iostream>
#include <cmath>
using namespace std;

//Optimal Approach:

/*
-> 10^(d-1) <= N < 10^d        ( d -> number of digits )
-> d-1 <= log10 N < d          (taking log)
-> log10 N is a decimal value so taking floor -> +1 to restore d

*/

int main() {
    int num, countOfDigits;
    cin>>num;

    countOfDigits = int(log10(num)) + 1;

    cout<<"The count of digits in num is " << countOfDigits;

}

/*Brute Force Approach:

int main() {
    int num, countOfDigits = 0;
    cin>>num;
    int copyOfNum = num;
    while(copyOfNum > 0) {
        countOfDigits++;
        copyOfNum /= 10;
    }
    cout<<"Number of Digits in "<< num << " is " << countOfDigits;
    return 0;
}


Time Complexity = O(N)
Space Complexity = O(1)
*/