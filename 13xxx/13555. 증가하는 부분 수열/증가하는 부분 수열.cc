#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'001;
const int MOD = 5'000'000;

int arr[51][MAX];

void update(int depth, int i, int val) {
    while(i<MAX) {
        arr[depth][i] = (arr[depth][i]+val)%MOD;
        i+=i&-i;
    }
}

int query(int depth, int i) {
    int ret=0;
    while(i) {
        ret+=arr[depth][i];
        i-=i&-i;
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, k; cin >> n >> k;

    int cnt=0;
    while(n--) {
        int a; cin >> a;
        for(int i=k;i>0;i--) {
            int ret = query(i-1, a-1);
            if(i==1) ret=1;
            if(ret) update(i, a, ret);
            if(i==k) cnt = (cnt+ret)%MOD;
        }
    }
    cout << cnt;
}