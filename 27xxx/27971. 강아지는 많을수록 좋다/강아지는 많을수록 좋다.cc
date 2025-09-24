#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'001;
const int INF = 0x3f3f3f3f;

int minCnt[MAX], l[100], r[100];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, a, b; cin >> n >> m >> a >> b;
    for(int i=0;i<m;i++) cin >> l[i] >> r[i];

    fill(minCnt+1, minCnt+MAX, INF);
    for(int i=1;i<=n;i++) {
        bool chk=false;
        for(int j=0;j<m;j++) {
            if(l[j]<=i && i<=r[j]) {
                chk=true;
                break;
            }
        }
        if(chk) continue;

        if(i-a>=0 && minCnt[i-a]>=0) minCnt[i] = min(minCnt[i], minCnt[i-a]+1);
        if(i-b>=0 && minCnt[i-b]>=0) minCnt[i] = min(minCnt[i], minCnt[i-b]+1);
    }
    cout << (minCnt[n]==INF ? -1 : minCnt[n]);
}