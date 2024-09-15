#include<bits/stdc++.h>
using namespace std;

int n, Amult=1, Bnum=INT_MAX;
int res[7], cur[7];

void dfs(int depth, int last, int num, int mult) {
    if(depth==n) {
        if(mult>Amult && num<Bnum) {
            Bnum=num;
            memcpy(&res, &cur, sizeof(res));
        }
        return;
    }
    for(int i=last;i<=9;i++) {
        cur[depth]=i;
        dfs(depth+1, i, num*10+i, mult*i);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> n;
    for(int i=0;i<n;i++) {
        int card; cin >> card;
        Amult *= card;
    }
    dfs(0, 1, 0, 1);

    if(Bnum==INT_MAX) cout << -1;
    else for(int i=0;i<n;i++) cout << res[i] << ' ';
}