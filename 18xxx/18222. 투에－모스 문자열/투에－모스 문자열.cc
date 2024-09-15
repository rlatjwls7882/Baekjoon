#include<bits/stdc++.h>
using namespace std;

void chk(long long _size, long long k, bool reversed) {
    if(_size==1) {
        if(reversed) cout << 1;
        else cout << 0;
        return;
    }

    if(k<=_size/2) chk(_size/2, k, reversed);
    else chk(_size/2, k-_size/2, !reversed);
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long k; cin >> k;

    long long _size=1;
    while(_size<k) {
        _size<<=1;
    }

    chk(_size, k, false);
}
