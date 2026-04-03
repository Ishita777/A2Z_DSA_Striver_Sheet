#include <iostream>

using namespace std;

int main()
{
    int n;
    cin>>n;

    int N = n/2;
    
    for(int i = 0; i < N + 1; ++i) {
        cout<<i<<" ";
        
        for(int j = 0; j < n + 1; ++j) {
            
            if(j <= i|| j >= n - i) {
                cout<<j<<" ";
            } else {
                cout<<" ";
            }
        }
        cout<<endl;
    }

    for(int i  = N + 1; i < n; ++i) {
        cout<<i<<" ";
        
        for(int j = 0; j < n + 1; ++j) {
            
            if(j < n - i  || j > i) {
                cout<<j<<" ";
            } else {
                cout<<" ";
            }
        }
        cout<<endl;
    }
}



