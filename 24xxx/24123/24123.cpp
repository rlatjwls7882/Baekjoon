#include<bits/stdc++.h>
using namespace std;

int p[11], score[1001], incorrect[1001][11], open[1001][11];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, t, x, y; cin >> n >> m >> t >> x >> y;
    for(int i=1;i<=m;i++) cin >> p[i];

    while(y--) {
        int tk, nk, mk; string log; cin >> tk >> nk >> mk >> log;
        if(log[0]=='o') open[nk][mk]=tk;
        else if(log[0]=='i') incorrect[nk][mk]++;
        else score[nk] += max(p[mk] - (tk - open[nk][mk]) - 120*incorrect[nk][mk], x);
    }
    for(int i=1;i<=n;i++) cout << score[i] << '\n';
}