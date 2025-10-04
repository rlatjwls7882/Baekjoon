#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int d; cin >> d;

    for(int i=2;;i++) {
        if(i*d%360==0) {
            cout << i;
            return 0;
        }
    }
}