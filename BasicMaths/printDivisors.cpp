#include<bits/stdc++.h>
using namespace std;

void printAllDivisors(int num) {

    vector<int> listOfDivisors;

    for(int i = 1; i <= sqrt(num); ++i) {
        if (num % i == 0) {
            listOfDivisors.push_back(i);
            if(i != num/i) {
                listOfDivisors.push_back(num/i);
            }
        }
    }

    for(int divisor : listOfDivisors) {
        cout<<divisor<<" ";
    }

}

int main() {
    int num;
    cin>>num;
    printAllDivisors(num);
}

/*
LOGIC : For every non-negative number N, if i is a divisor of N then N/i is also a divisor of N, 
so we just have to iterate till sqrt of N, and if i and N/i are distinct then add both of them in the list of divisors,
else just add i

T.C. = O(sqrt(n))
S.C. = O(sqrt(n)) if we want to store the list, if we just want to print the divisors then O(1)
*/