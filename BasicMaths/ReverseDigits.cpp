#include<iostream>
using namespace std;

int reverseNumber(int num) {
    int reverseNum = 0;
    while(num > 0) {
        reverseNum = (reverseNum * 10) + (num % 10);
        num /= 10;
    }
}

int main() {
    int num;
    cin>>num;

    cout<<reverseNumber(num);
}