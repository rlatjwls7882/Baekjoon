#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll n, k, a[15], cnt;

void back(int depth=0, int start=0, ll val=1) {
    if(val>n) return;
    if(depth) {
        if(depth%2) cnt += n/val;
        else cnt -= n/val;
    }
    for(int i=start;i<k;i++) back(depth+1, i+1, lcm(val, a[i]));
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> k;
    for(int i=0;i<k;i++) cin >> a[i];
    back();
    cout << n-cnt;
}