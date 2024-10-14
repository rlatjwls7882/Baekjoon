#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int cnt[51] = {0, };
    for(int i=0;i<n*50;i++) {
        int x; cin >> x;
        cnt[x]++;
    }

    bool chk=false;
    for(int i=1;i<=50;i++) {
        if(cnt[i]>2*n) {
            cout << i << ' ';
            chk=true;
        }
    }
    if(!chk) cout << -1;
}