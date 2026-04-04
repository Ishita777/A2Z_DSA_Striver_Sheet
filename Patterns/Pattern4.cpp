#include<iostream>

using namespace std;

int main() {
    int n, k, sum;
    cin>>n;
    k = 2*n;
    int loops = n/2 + 1;
    for(int i = 0; i < n; ++i) {
        for(int j = 0; j < n; ++j) {
            sum = i+j;
            
            if (sum >= 6 && sum <= (k - 8))
                cout<<"1 ";
            else if (sum >= 4 && sum <= (k - 6) )
                cout<<"2 ";
            else if (sum >= 2 && sum <= (k - 4))
                cout<<"3 ";
            else if(sum >= 0 && sum <= (k - 2))
                cout<<"4 ";
        }
        cout<<endl;
    }
}