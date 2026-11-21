#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int d, e; cin >> d >> e;
    while(e--) {
        char ch; int q; cin >> ch >> q;
        if(ch=='+') d+=q;
        else d-=q;
    }
    cout << d;
}