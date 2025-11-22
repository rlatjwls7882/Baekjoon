#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int last, left=-1e9, right=1e9;
    for(int i=0;i<n;i++) {
        int cur; cin >> cur;
        if(i) {
            int nextL = last*2-right;
            int nextR = last*2-left;
            left = nextL;
            right = nextR;
        }
        right = min(right, cur);
        if(left>right) {
            cout << 0;
            return 0;
        }
        last = cur;
    }
    cout << right-left+1;
}