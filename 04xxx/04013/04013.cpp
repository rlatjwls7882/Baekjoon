#include<bits/stdc++.h>
#define MAX 500001

using namespace std;

int N, idx=1, curSccNum=0;
int parent[MAX] = {0, };
int sccNum[MAX] = {0, };
bool visited[MAX] = {false, };
vector<vector<int>> SCCs;
vector<vector<int>> connect = vector<vector<int>>(MAX);
stack<int> stk;

int dfs(int cur) {
    stk.push(cur);
    parent[cur]=idx;
    int remember=idx++;

    for(int next:connect[cur]) {
        if(parent[next]==0) {
            remember = min(remember, dfs(next));
        } else if(!visited[next]) {
            remember = min(remember, parent[next]);
        }
    }

    if(parent[cur]==remember) {
        SCCs.push_back(vector<int>());
        while(true) {
            int top = stk.top(); stk.pop();
            SCCs.back().push_back(top);
            sccNum[top]=curSccNum;
            parent[top]=remember;
            visited[top]=true;
            if(top==cur) {
                break;
            }
        }
        curSccNum++;
    }
    return remember;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int M; cin >> N >> M;
    while(M-->0) {
        int a, b; cin >> a >> b;
        connect[a].push_back(b);
    }
    
    for(int i=1;i<=N;i++) {
        if(!visited[i]) {
            dfs(i);
        }
    }

    // SCC의 총 가치
    int sccCost[curSccNum] = {0, };
    for(int i=1;i<=N;i++) {
        int cost; cin >> cost;
        sccCost[sccNum[i]]+=cost;
    }

    // 레스토랑 정보
    int S, P; cin >> S >> P;
    int sccStart = sccNum[S];
    bool sccExistRest[curSccNum] = {false, };
    for(int i=0;i<P;i++) {
        int restIdx; cin >> restIdx;
        sccExistRest[sccNum[restIdx]]=true;
    }

    // SCC 위상정렬
    int inDegree[curSccNum] = {0, };
    vector<vector<int>> connectSCC = vector<vector<int>>(curSccNum);
    for(int i=0;i<curSccNum;i++) {
        for(int cur:SCCs[i]) {
            for(int next:connect[cur]) {
                if(sccNum[cur]!=sccNum[next]) {
                    connectSCC[sccNum[cur]].push_back(sccNum[next]);
                    inDegree[sccNum[next]]++;
                }
            }
        }
    }

    queue<int> q;
    int maxCost[curSccNum] = {0, };
    for(int i=0;i<curSccNum;i++) {
        maxCost[i]=sccCost[i];
        if(inDegree[i]==0) {
            q.push(i);
        }
    }

    bool canExistFromStart[curSccNum] = {false, };
    canExistFromStart[sccStart]=true;
    while(!q.empty()) {
        int cur = q.front(); q.pop();
        for(int next:connectSCC[cur]) {
            if(canExistFromStart[cur]) {
                maxCost[next] = max(maxCost[next], maxCost[cur]+sccCost[next]);
                canExistFromStart[next]=true;
            }
            if(--inDegree[next]==0) {
                q.push(next);
            }
        }
    }

    int _max=0;
    for(int i=0;i<curSccNum;i++) {
        if(sccExistRest[i] && canExistFromStart[i]) {
            _max = max(_max, maxCost[i]);
        }
    }
    cout << _max;
}