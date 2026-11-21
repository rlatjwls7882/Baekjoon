#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'001;
const int MOD = 1e9+7;

int arr[10][MAX];

void update(int d, int i, int val) {
    while(i<MAX) {
        arr[d][i]=(arr[d][i]+val)%MOD;
        i+=i&-i;
    }
}

int query(int d, int i) {
    int ret=0;
    while(i) {
        ret=(ret+arr[d][i])%MOD;
        i-=i&-i;
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, k; cin >> n >> k;

    int res=0;
    while(n--) {
        int a; cin >> a;
        for(int i=k;i>0;i--) {
            int ret = query(i-1, a-1);
            if(i==1) ret=1;
            if(i==k) res = (res+ret)%MOD;
            else update(i, a, ret%MOD);
        }
    }
    cout << res;
}