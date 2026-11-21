#include<bits/stdc++.h>
using namespace std;

int gcd(int a, int b) {
    while(b!=0) {
        int tmp=a%b;
        a=b;
        b=tmp;
    }
    return a;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int cnt=1;
    while(N-->2) {
        int tmp; cin >> tmp;
        int gcdVal = gcd(cnt, tmp);
        cnt *= tmp/gcdVal;
    }
    cout << cnt;
}