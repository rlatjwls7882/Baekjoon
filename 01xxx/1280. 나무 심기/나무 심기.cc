#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const int MAX = 200'002;
const ll MOD = 1e9+7;

ll arr[MAX], cnt[MAX];

void update(int i) {
    int v=i;
    while(i<MAX) {
        arr[i]+=v;
        cnt[i]++;
        i+=i&-i;
    }
}

pair<ll, ll> query(int i) {
    ll ret=0, cur=0;
    while(i) {
        ret+=arr[i];
        cur+=cnt[i];
        i-=i&-i;
    }
    return {ret, cur};
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;

    ll res=1;
    for(int i=0;i<n;i++) {
        int a; cin >> a; a++;
        auto A=query(a-1), B=query(MAX-1), C=query(a);
        ll cur = (A.second*a-A.first+(B.first-C.first)-(B.second-C.second)*a)%MOD;
        if(i) res = (res*cur)%MOD;
        update(a);
    }
    cout << res;
}