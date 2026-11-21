#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll cnt[10];

void chk(int n, ll w) {
    while(n) {
        cnt[n%10] += w;
        n /= 10;
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    ll n; cin >> n;

    ll last=1;
    for(ll w=1;n;w*=10) {
        while(last%10!=0 && last<=n) {
            chk(last, w);
            last++;
        }
        while(n%10!=9 && last<=n) {
            chk(n, w);
            n--;
        }
        if(last>n) break;
        for(int i=0;i<10;i++) cnt[i] += (n/10 - last/10 + 1)*w;
        n /= 10;
        last /= 10;
    }
    for(int i=0;i<10;i++) cout << cnt[i] << ' ';
}