#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    while(N-->0) {
        long long x; cin >> x;
        if(sqrtl(x)==(long long)(sqrt(x))) {
            cout << "1 ";
        } else {
            cout << "0 ";
        }
    }
}