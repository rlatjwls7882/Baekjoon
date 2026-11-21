#include<bits/stdc++.h>
using namespace std;

typedef long double ld;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int t=0;t<100;t++) {
        int cnt=0;
        for(int i=0;i<5000;i++) {
            ld in; cin >> in;
            if(in<=0.1) cnt++;
        }
        cout << (cnt*15>=5000 ? "A\n" : "B\n");
    }
}