#include<bits/stdc++.h>
using namespace std;

void back(int depth, int size, int cur) {
    int nextSize = (size-(depth+2))/2;
    if(cur<=nextSize) {
        back(depth-1, nextSize, cur);
    } else if(cur>nextSize+depth+2) {
        back(depth-1, nextSize, cur-(nextSize+depth+2));
    } else {
        if(cur==nextSize+1) cout << 'm';
        else cout << 'o';
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    int depth=0, size=0;
    while(size<n) {
        depth++;
        size = size*2+depth+2;
    }
    back(depth, size, n);
}