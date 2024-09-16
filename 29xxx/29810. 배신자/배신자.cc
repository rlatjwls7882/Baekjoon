#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    vector<vector<int>> conn(n+1);
    while(m-->0) {
        int a, b; cin >> a >> b;
        conn[a].push_back(b);
        conn[b].push_back(a);
    }
    int x; cin >> x;

    int maxSize=1;
    bool visited[n+1] = {false, };
    for(int i=1;i<=n;i++) {
        if(!visited[i] && i!=x) {
            int size=1, meetXCnt=0;
            queue<int> q; q.push(i);
            visited[i]=true;
            while(!q.empty()) {
                int cur = q.front(); q.pop();
                for(int next:conn[cur]) {
                    if(next==x) meetXCnt++;
                    else if(!visited[next]) {
                        q.push(next);
                        visited[next]=true;
                        size++;
                    }
                }
            }
            if(meetXCnt==1) maxSize = max(maxSize, size+1);
            else maxSize = max(maxSize, size);
        }
    }
    cout << maxSize;
}