#include<bits/stdc++.h>
using namespace std;

int cnt[1002];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, t; cin >> n >> t;
    while(n--) {
        int k; cin >> k;
        while(k--) {
            int s, e; cin >> s >> e;
            cnt[s]++;
            cnt[e]--;
        }
    }

    for(int i=1;i<=1000;i++) cnt[i] += cnt[i-1];

    int res=0, a, b, sum=0, l=0, r=0;
    while(r<1000) {
        sum += cnt[r++];
        if(r-l>t) sum -= cnt[l++];
        if(res<sum) {
            res=sum;
            a=l;
            b=r;
        }
    }
    cout << a << ' ' << b;
}