#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int h[n+2] = {0, };
    long long cnt=0;
    for(int i=1;i<=n;i++) {
        cin >> h[i];
        cnt += h[i];
    }
    cnt*=2;
    cnt += n*2;

    for(int i=1;i<=n;i++) {
        if(h[i]>h[i-1]) {
            cnt += h[i]-h[i-1];
        }
    }

    for(int i=n+1;i>1;i--) {
        if(h[i-1]>h[i]) {
            cnt += h[i-1]-h[i];
        }
    }
    cout << cnt;
}