#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, L; cin >> N >> L;

    int last=0, i=0;
    while(N-->0) {
        int cur, R, G; cin >> cur >> R >> G;
        i += cur-last;
        last=cur;

        while(true) {
            if(i%(R+G)>=R) break;
            i++;
        }
    }
    i += L-last;
    
    cout << i;
}