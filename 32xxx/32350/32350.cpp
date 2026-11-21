#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, d, p; cin >> n >> d >> p;

    queue<int> q;
    while(n--) {
        int a; cin >> a;
        q.push(a);
    }

    int turn=0;
    while(!q.empty()) {
        int cur = q.front(); q.pop();
        if(cur<=0) continue;

        turn += (cur+d-1)/d;
        int h = (d-cur%d)%d;
        if(q.size()) q.front() -= h*p/100;
    }
    cout << turn;
}