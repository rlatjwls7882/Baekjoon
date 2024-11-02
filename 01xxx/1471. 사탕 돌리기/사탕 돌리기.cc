#include<bits/stdc++.h>
using namespace std;

const int MAX = 200000;

int conn[MAX], parent[MAX], idx, sccCnt, sccNum[MAX], maxDepth[MAX];
vector<vector<int>> SCCs;
vector<set<int>> sccConn(MAX);
bool visited[MAX];
stack<int> stk;

int makeScc(int cur) {
    stk.push(cur);
    int remember = idx;
    parent[cur] = idx++;

    int next = conn[cur];
    if(parent[next]==0) remember = min(remember, makeScc(next));
    else if(!visited[next]) remember = min(remember, parent[next]);

    if(remember == parent[cur]) {
        SCCs.push_back(vector<int>());
        while(true) {
            int top = stk.top(); stk.pop();
            SCCs.back().push_back(top);
            visited[top]=true;
            sccNum[top] = sccCnt;
            parent[top] = remember;
            if(top == cur) break;
        }
        sccCnt++;
    }
    return remember;
}

void dfs(int cur) {
    maxDepth[cur] = -1;
    if(sccConn[cur].empty()) maxDepth[cur] = SCCs[cur].size();
    for(int next:sccConn[cur]) {
        if(maxDepth[next]==0) dfs(next);
        maxDepth[cur] = max(maxDepth[cur], maxDepth[next] + (int)SCCs[cur].size());
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    for(int i=1;i<=N;i++) {
        int tmp=i, sum=0;
        while(tmp) {
            sum += tmp%10;
            tmp/=10;
        }
        conn[i-1]=(i-1+sum)%N;
    }
    for(int i=0;i<N;i++) if(!visited[i]) makeScc(i);

    // SCC
    for(int i=0;i<sccCnt;i++) {
        for(int n:SCCs[i]) {
            if(sccNum[n] != sccNum[conn[n]]) sccConn[i].insert(sccNum[conn[n]]);
        }
    }

    // SCC 만든 상태로 dfs
    int maxSize=0;
    for(int i=0;i<sccCnt;i++) {
        if(maxDepth[i]==0) { // 아직 방문 안한 정점들 아무렇게나 방문
            dfs(i);
            maxSize = max(maxSize, maxDepth[i]);
        }
    }
    cout << maxSize;
}