#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, k; cin >> n >> m >> k;

    int cnt=0;
    for(int i=1;i<=n*m;i++) {
        int cur = n*m-i;

        bool chk=false;
        for(int j=1;j*j<=cur;j++) {
            if(cur%j==0 && abs(j-cur/j)<=k) {
                chk=true;
                break;
            }
        }
        if(!chk) break;
        cnt++;
    }
    cout << cnt;
}