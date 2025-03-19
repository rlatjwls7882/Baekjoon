#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    ll n, k; cin >> n >> k;

    map<ll, ll> exist; // i번째 이전까지 등장한 부분합의 개수들
    ll cnt=0, preSum=0;
    for(int i=0;i<n;i++) {
        ll x; cin >> x;
        preSum += x; // 현재까지의 합

        if(preSum==k) cnt++; // 현재까지의 합이 k가 되면 cnt+1
    
        cnt += exist[preSum-k]; // 현재까지의 합에서 (preSum-k)를 빼면 k가 됨 -> exist[preSum-k]의 값만큼 cnt 증가
        exist[preSum]++; // map에서 preSum-k의 개수 1 증가
    }
    cout << cnt;
}