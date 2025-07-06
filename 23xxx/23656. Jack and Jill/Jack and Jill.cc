#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);

    int left=1, right=1e9;
    for(int i=0;i<100 && left<=right;i++) {
        int x; cin >> x;
        if(x<left) {
            cout << ">\n" << flush;
        } else if(x>right) {
            cout << "<\n" << flush;
        } else if(left==right && left==x) {
            cout << "=\n" << flush;
            return 0;
        } else if(x-left>right-x) {
            right=x-1;
            cout << "<\n" << flush;
        } else {
            left=x+1;
            cout << ">\n" << flush;
        }
    }
}