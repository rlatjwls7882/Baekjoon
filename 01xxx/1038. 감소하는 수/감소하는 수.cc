#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    queue<ll> q;
    for(ll i=0;i<=9;i++) {
        q.push(i);
    }

    int cnt=0;
    while(!q.empty()) {
        ll cur = q.front(); q.pop();
        if(cnt++==N) {
            cout << cur;
            return 0;
        }

        for(ll i=0;i<cur%10;i++) {
            q.push(cur*10+i);
        }
    }
    cout << -1;
}