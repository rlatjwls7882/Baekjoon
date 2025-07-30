#include<bits/stdc++.h>
using namespace std;

long long getCnt(long long n) {
    long long ret=0, size=1, cur=1;
    while(size<=n) {
        n -= size;
        ret += cur;
        cur = cur*2 + size;
        size<<=1;
    }
    while(n) {
        if(size<=n) {
            n -= size;
            ret += cur;
            cur += size;
        }
        size>>=1;
        cur = cur-size >> 1;
    }
    return ret;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long a, b; cin >> a >> b;
    cout << getCnt(b) - getCnt(a-1);
}