#include<bits/stdc++.h>
using namespace std;

const int MAX = 4444;
typedef pair<int, int> P;
vector<vector<int>> conn(MAX);
int idx, parent[MAX], maxSize;
stack<P> stk;

int dfs(int cur, int prev=-1) {
    int remember = parent[cur] = ++idx;
    for(int next:conn[cur]) {
        if(prev==next) continue;
        if(parent[cur] > parent[next]) stk.push({cur, next});
        if(parent[next]) {
            remember = min(remember, parent[next]);
        } else {
            int tmp = dfs(next, cur);
            remember = min(remember, tmp);
            if(tmp>=parent[cur]) {
                vector<P> BCC;
                while(true) {
                    P top = stk.top(); stk.pop();
                    BCC.push_back(top);
                    if(top == P(cur, next)) break;
                }
                if(BCC.size()>1) maxSize = max(maxSize, (int)BCC.size());
            }
        }
    }
    return remember;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int N, M; cin >> N >> M;
        while(M-->0) {
            int a, b; cin >> a >> b;
            conn[a-1].push_back(b-1);
            conn[b-1].push_back(a-1);
        }
        for(int i=0;i<N;i++) if(!parent[i]) dfs(i);
        cout << maxSize << '\n';

        // clear
        idx=maxSize=0;
        for(int i=0;i<N;i++) {
            parent[i]=0;
            conn[i] = {};
        }
    }
}