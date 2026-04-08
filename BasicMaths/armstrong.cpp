#include<iostream>
#include<cmath>
using namespace std;

bool isArmstrong(int num) {

    int sum = 0, copyOfNum = num;
    int countOfDigits = int(log10(num)) + 1;
    while (copyOfNum > 0) {
        sum += round(pow((copyOfNum % 10), countOfDigits));;
        copyOfNum /= 10;
    }
    
    return sum == num ? true : false;

}

int main() {
    int num;
    cin>>num;
    cout<<" Is "<<num<<" an Armstrong number? -"<< isArmstrong(num);
}

//1 + 125 + 27 = 153
