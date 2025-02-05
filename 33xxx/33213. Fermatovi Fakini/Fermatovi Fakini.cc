#include<bits/stdc++.h>
using namespace std;

bool chk[1000001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int odd=0, even=0;
    while(n--) {
        int cur; cin >> cur;
        chk[cur]=true;
        if(cur%2) odd++;
        else even++;
    }

    int start;
    if(odd>even) start=1;
    else start=2;

    for(int i=start;;i+=2) {
        if(!chk[i]) {
            cout << i;
            return 0;
        }
    }
}