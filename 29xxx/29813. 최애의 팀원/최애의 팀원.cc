#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    queue<pair<string, int>> q;
    for(int i=0;i<n;i++) {
        string a; int b; cin >> a >> b;
        q.push({a, b});
    }

    for(int i=0;i<n/2;i++) {
        int skip = q.front().second; q.pop();
        for(int j=0;j<skip-1;j++) {
            q.push(q.front()); q.pop();
        }
        q.pop();
    }
    cout << q.front().first;
}