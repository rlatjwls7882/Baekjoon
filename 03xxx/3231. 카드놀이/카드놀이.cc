#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    bool chk[N+1] = {false, };
    int cnt=0;
    while(N-->0) {
        int cur; cin >> cur;
        if(cur!=1 && !chk[cur-1]) cnt++;
        chk[cur]=true;
    }
    cout << cnt;
}