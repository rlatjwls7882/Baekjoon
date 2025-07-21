#include<bits/stdc++.h>
using namespace std;

int cnt[10'001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    vector<int> d(n+1);
    for(int i=1;i<=n;i++) cin >> d[i];

    memset(cnt, -1, sizeof cnt);
    cnt[0]=0;
    for(int i=1;i<=n;i++) {
        while(d[i]--) {
            int t; cin >> t;
            for(int j=m;j-t>=0;j--) {
                if(cnt[j-t]>=i-1) cnt[j]=i;
            }
        }
    }
    for(int i=m;i>0;i--) {
        if(cnt[i]==n) {
            cout << i;
            return 0;
        }
    }
    cout << -1;
}