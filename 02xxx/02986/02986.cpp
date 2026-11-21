#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    if(N<=1) {
        cout << 0;
        return 0;
    }
    for(int i=2;i*i<=N;i++) {
        if(N%i==0) {
            cout << N-N/i;
            return 0;
        }
    }
    cout << N-1;
}