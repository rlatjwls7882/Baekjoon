#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    int last; cin >> last;
    int maxDist=last;
    while(M-->1) {
        int cur; cin >> cur;
        maxDist = max(maxDist, (cur-last+1)/2);
        last=cur;
    }
    maxDist = max(maxDist, N-last);
    cout << maxDist;
}