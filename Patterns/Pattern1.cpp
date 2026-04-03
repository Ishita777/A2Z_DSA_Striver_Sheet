#include <iostream>

using namespace std;

int main()
{
    int n;
    cin>>n;

    int N = n/2;
    
    for(int i = 0; i < N; ++i) {
        cout<<i<<" ";
        
        for(int j = 0; j < 2*N - 1; ++j) {
            
            if(j <= N - 1 - i || j >= N + i - 1) {
                cout<<j<<" ";
            } else {
                cout<<" ";
            }
        }
        cout<<endl;
    }

    for(int i  = 0; i < N; ++i) {
        cout<<i+N<<" ";
        
        for(int j = 0; j < 2*N - 1; ++j) {
            
            if(j <= i || j >= 2*N - i - 2) {
                cout<<j<<" ";
            } else {
                cout<<" ";
            }
        }
        cout<<endl;
    }
}
/*
0 1 2 3 4 5 6 7 8 
0 1 2 3   5 6 7 8 
0 1 2       6 7 8 
0 1           7 8 
0               8 
0               8 
0 1           7 8 
0 1 2       6 7 8 
0 1 2 3   5 6 7 8 
0 1 2 3 4 5 6 7 8 
*/


//LOGIC :
// 1. We are given a number n, we need to print a pattern of numbers in the form of a diamond.
// 2. We can divide the pattern into two halves, the upper half and the lower half.
// 3. For the upper half, we need to print the numbers from 0 to N-1, where N is n/2. We also need to print the numbers from 0 to 2*N-1, but we need to skip the numbers that are between N-1-i and N+i-1.
// 4. For the lower half, we need to print the numbers from N to n-1. We also need to print the numbers from 0 to 2*N-1, but we need to skip the numbers that are between i and 2*N-i-2.
