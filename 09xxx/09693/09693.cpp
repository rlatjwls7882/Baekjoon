#include<bits/stdc++.h>
using namespace std;

int cnt[1000001][2];

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    cnt[0][0]=cnt[0][1]=0;
    for(int i=1;i<=1000000;i++) {
        cnt[i][0]=cnt[i-1][0];
        cnt[i][1]=cnt[i-1][1];
        int tmp=i;
        while(tmp%2==0) {
            cnt[i][0]++;
            tmp/=2;
        }
        while(tmp%5==0) {
            cnt[i][1]++;
            tmp/=5;
        }
    }

    for(int i=1;;i++) {
        int n; cin >> n;
        if(n==0) break;
        cout << "Case #" << i << ": " << min(cnt[n][0], cnt[n][1]) << '\n';
    }
}