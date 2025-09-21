#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    while(true) {
        cout << "? 1\n" << flush;
        char input; cin >> input;
        if(input=='Y') {
            cout << "! 1\n" << flush;
            return 0;
        }
    }
}