#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, a, b; cin >> N >> a >> b;

    for(int i=1;;i++) {
        if(a==b) {
            cout << i-1;
            break;
        }
        a = (a+1)/2;
        b = (b+1)/2;
    }
}