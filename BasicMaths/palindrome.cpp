#include<iostream>
#include<cmath>

using namespace std;

int main() {
    int num;
    cin>>num;

    int copyNum = num;

    int reverseNum = 0;
    while(copyNum > 0) {
        reverseNum = (reverseNum * 10) + (copyNum % 10);
        copyNum /= 10;
    }

    if(num == reverseNum) {
        cout<<num<<" is a palindrome.";
    } else {
        cout<<num<<" is not a palindrome.";   
    }

    return 0;
        
}