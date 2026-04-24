#include<bits/stdc++.h>
using namespace std;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;

    vector<int> res(n);
    priority_queue<int> pq;
    cin >> res[0];
    pq.push(res[0]);
    for(int i=1;i<n;i++) {
        int a; cin >> a;
        a-=i;
        pq.push(a); pq.push(a);
        res[i]=pq.top()+i;
        pq.pop();
    }
    for(int i=n-2;i>=0;i--) res[i]=min(res[i], res[i+1]-1);
    for(auto e:res) cout << e << '\n';
}