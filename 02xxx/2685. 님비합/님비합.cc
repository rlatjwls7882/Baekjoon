#include<bits/stdc++.h>

using namespace std;

int NimSum(int B, int X, int Y) {
    int a[32] = {0, }; int size1=0;
    while(X!=0) {
        a[size1++]=X%B;
        X/=B;
    }
    
    int b[32] = {0, }; int size2=0;
    while(Y!=0) {
        b[size2++]=Y%B;
        Y/=B;
    }
    
    int sum=0;
    for(int i=0;i<=max(size1, size2);i++) {
        sum += (a[i]+b[i])%B*pow(B, i);
    }
    return sum;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    
    while(T-->0) {
        int B, X, Y; cin >> B >> X >> Y;
        cout << NimSum(B, X, Y) << '\n';
    }
}