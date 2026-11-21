#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int q; cin >> q;
    while(q-->0) {
        int a, b; cin >> a >> b;
        if(b>a) {
            if(b-a > a-b+43) cout << "Outer circle line\n";
            else if(b-a < a-b+43) cout << "Inner circle line\n";
            else cout << "Same\n";
        } else {
            if(a-b > b-a+43) cout << "Inner circle line\n";
            else if(a-b < b-a+43) cout << "Outer circle line\n";
            else cout << "Same\n";
        }
    }
}