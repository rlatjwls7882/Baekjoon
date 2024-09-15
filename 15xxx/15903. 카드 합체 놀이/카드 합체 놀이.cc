#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    priority_queue<ll, vector<ll>, greater<ll>> pq;
    while(n-->0) {
        ll tmp; cin >> tmp;
        pq.push(tmp);
    }

    while(m-->0) {
        ll n1 = pq.top(); pq.pop();
        ll n2 = pq.top(); pq.pop();
        pq.push(n1+n2); pq.push(n1+n2);
    }
    
    ll sum=0;
    while(!pq.empty()) {
        sum += pq.top(); pq.pop();
    }
    cout << sum;
}