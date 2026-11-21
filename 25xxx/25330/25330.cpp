#include<bits/stdc++.h>
using namespace std;

struct element {
    int a, p;
    bool operator<(const element e) const {
        return a < e.a;
    }
};

int n, k, maxCnt;
vector<element> v(20);

void dfs(int depth=0, int start=0, int cost=0, int totalCost=0, int cnt=0) {
    maxCnt = max(maxCnt, cnt);
    if(depth>=n) return;

    for(int i=start;i<n;i++) {
        if(totalCost+cost+v[i].a<=k) {
            dfs(depth+1, i+1, cost+v[i].a, totalCost+cost+v[i].a, cnt+v[i].p);
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> k;
    for(int i=0;i<n;i++) cin >> v[i].a;
    for(int i=0;i<n;i++) cin >> v[i].p;
    sort(v.begin(), v.begin()+n);
    dfs();
    cout << maxCnt;
}