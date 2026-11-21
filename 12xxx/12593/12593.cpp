#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    for(int tc=1;tc<=t;tc++) {
        int r, k, n; cin >> r >> k >> n;
        queue<int> q;
        while(n--) {
            int g; cin >> g;
            q.push(g);
        }

        int total=0;
        while(r--) {
            queue<int> tmp;
            int cur=0;
            while(!q.empty() && q.front()+cur<=k) cur += q.front(), tmp.push(q.front()), q.pop();
            while(!tmp.empty()) q.push(tmp.front()), tmp.pop();
            total += cur;
        }
        cout << "Case #" << tc << ": " << total << '\n';
    }
}