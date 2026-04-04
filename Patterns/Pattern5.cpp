#include <iostream>
using namespace std;

int main () {
    int n;
    cin>>n;
    int top, left, bottom, right;
    int minDist = 100000;

    for(int i = 0; i < (2*n-2); ++i) {
        for(int j = 0; j < (2*n - 2); ++j) {
            top = i, left = j, bottom = (2 * n - 2) - i, right = (2 * n - 2) - j;
            minDist = min(min(top, bottom), min(left, right));
            cout<<n - minDist<<" ";
        }
        cout<<endl;
    }
}


/*
PATTERN:

5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4
5 4 3 3 3 3 3 4
5 4 3 2 2 2 3 4
5 4 3 2 1 2 3 4
5 4 3 2 2 2 3 4
5 4 3 3 3 3 3 4
5 4 4 4 4 4 4 4


*/

