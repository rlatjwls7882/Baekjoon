#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    vector<int> state(m+1);
    state[0]=1;

    for(int i=1;i<=m;i++) {
        long long x, y; cin >> x >> y;
        if(x==1) {
            state[i] = ((state[i-1]+y)%n+n-1)%n+1;
        } else if(x==2) {
            state[i] = ((state[i-1]-y)%n+n-1)%n+1;
        } else  {
            state[i] = state[y];
        }
    }
    cout << state[m];
}