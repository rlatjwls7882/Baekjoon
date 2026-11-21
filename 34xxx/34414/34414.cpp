#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n--) {
        int h; cin >> h;
        if(h<48) {
            cout << "False";
            return 0;
        }
    }
    cout << "True";
}