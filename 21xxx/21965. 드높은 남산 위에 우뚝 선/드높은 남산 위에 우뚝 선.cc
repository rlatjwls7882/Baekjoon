#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int A[N];
    for(int i=0;i<N;i++) {
        cin >> A[i];
    }

    bool decrease=false;
    for(int i=1;i<N;i++) {
        if(A[i-1]>A[i]) decrease=true;
        if(decrease && A[i-1]<A[i] || A[i-1]==A[i]) {
            cout << "NO";
            return 0;
        }
    }
    cout << "YES";
}