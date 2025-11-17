#include<bits/stdc++.h>
using namespace std;

int cnt[1'000'001], gcdVal[1'000'001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n--) {
        int cur; cin >> cur;
        cnt[cur]++;
    }

    for(int i=1;i<=1'000'000;i++) {
        gcdVal[i]=-1;
        if(!cnt[i]) continue;
        for(int j=1;j*j<=i;j++) {
            if(i%j==0) {
                if(j!=i) cnt[j] += cnt[i];
                if(gcdVal[j]==-1) gcdVal[j]=i;
                else gcdVal[j] = gcd(gcdVal[j], i);
                if(j!=i/j) {
                    if(j!=1) cnt[i/j] += cnt[i];
                    if(gcdVal[i/j]==-1) gcdVal[i/j]=i;
                    else gcdVal[i/j] = gcd(gcdVal[i/j], i);
                }
            }
        }
    }

    int q; cin >> q;
    while(q--) {
        int k; cin >> k;
        if(gcdVal[k]!=k) cout << "-1\n";
        else cout << cnt[k] << '\n';
    }
}