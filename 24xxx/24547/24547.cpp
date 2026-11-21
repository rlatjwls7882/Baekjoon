#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;

const int MAX = 200'001;
const int SZ = 300;

ll a[MAX], aSmall[SZ], bSmall[SZ], cnt[MAX], sum[MAX];

void update(int i, int val1) {
    ll val2=i;
    while(i<MAX) {
        cnt[i]+=val1;
        sum[i]+=val2*val1;
        i+=i&-i;
    }
}

int queryCnt(int i) {
    int ret=0;
    while(i) {
        ret+=cnt[i];
        i-=i&-i;
    }
    return ret;
}

ll querySum(int i) {
    ll ret=0;
    while(i) {
        ret+=sum[i];
        i-=i&-i;
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;

    ll sum=0;
    for(int i=1;i<=n;i++) {
        cin >> a[i];
        update(a[i], 1);
        sum+=a[i];
        for(int j=1;j<SZ;j++) aSmall[j]+=a[i]/j*j, bSmall[j]+=j/a[i]*a[i];
    }

    int q; cin >> q;
    while(q--) {
        ll op, x, y, cur=0; cin >> op >> x;
        if(op==1) {
            if(x<SZ) {
                cur=aSmall[x];
            } else {
                for(int i=1;x*(i+1)<MAX;i++) {
                    cur+=i*x*(queryCnt(x*(i+1)-1)-queryCnt(x*i-1));
                }
            }
            cout << sum-cur << '\n';
        } else if(op==2) {
            if(x<SZ) {
                cur=bSmall[x];
            } else {
                for(int l=1;l<=x;) {
                    int i=x/l, r=x/i;
                    cur+=i*(querySum(r)-querySum(l-1));
                    l=r+1;
                }
            }
            cout << x*n-cur << '\n';
        } else {
            cin >> y;
            sum+=y-a[x];
            for(int i=1;i<SZ;i++) aSmall[i]+=y/i*i-a[x]/i*i, bSmall[i]+=i/y*y-i/a[x]*a[x];
            update(a[x], -1);
            a[x]=y;
            update(a[x], 1);
        }
    }
}