#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int Q; cin >> Q;
    int remain=0;
    while(Q-->0) {
        int x, y; cin >> x >> y;
        if(x==1) {
            remain += y;
        } else {
            remain-=y;
            if(remain<0) {
                cout << "Adios";
                return 0;
            }
        }
    }
    cout << "See you next month";
}