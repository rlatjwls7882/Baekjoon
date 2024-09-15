#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

ll sum[1000001] = {0, };

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;
    
    while(N-->0) {
        ll g, x; cin >> g >> x;
        sum[x] += g;
    }

    for(int i=1;i<=1000000;i++) {
        sum[i] += sum[i-1];
    }

    ll _max=sum[min(K*2, 1000000)];
    for(int i=K*2+1;i<=1000000;i++) {
        ll cnt = sum[i];
        if(i-1-K*2>=0) cnt-=sum[i-1-K*2];
        _max = max(_max, cnt);
    }
    cout << _max;
}