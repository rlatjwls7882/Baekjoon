#include<bits/stdc++.h>
using namespace std;

int curCnt[50], dp[50];
int parent[50], sccNum[50], sccCnt=0;
bool visited[50], canJumpToScc[50];
vector<vector<int>> conn(50), SCCs;
vector<set<int>> sccConn(50);
stack<int> stk;
int idx=1;

struct stair {
    int x, y, len, cnt;
    bool operator<(const stair s) const {
        if(this->y==s.y) return this->x < s.x;
        return this->y < s.y;
    }
};

// 두 계단 사이의 거리 계산
double getDist(stair a, stair b) {
    if(a.x<=b.x && b.x<=a.x+a.len || b.x<=a.x && a.x<=b.x+b.len) return abs(a.y-b.y);
    return sqrt(min(min(min(pow(a.x-b.x, 2), pow(a.x+a.len-b.x-b.len, 2)), pow(a.x+a.len-b.x, 2)), pow(a.x-b.x-b.len, 2)) + pow(a.y-b.y, 2));
}

// scc
int dfs(int cur) {
    int remember = parent[cur] = idx++;
    stk.push(cur);

    for(int next:conn[cur]) {
        if(parent[next]==0) remember = min(remember, dfs(next));
        else if(!visited[next]) remember = min(remember, parent[next]);
    }

    if(remember == parent[cur]) {
        SCCs.push_back(vector<int>());
        while(true) {
            int top = stk.top(); stk.pop();
            SCCs.back().push_back(top);
            parent[top]=remember;
            visited[top]=true;
            sccNum[top]=sccCnt;
            if(top==cur) break;
        }
        sccCnt++;
    }
    return remember;
}

// dp로 최대로 모을 수 있는 사탕 개수 계산
void dfs1(int cur) {
    dp[cur] = curCnt[cur];
    visited[cur]=true;
    for(int next:sccConn[cur]) {
        if(cur==next) continue;
        if(dp[next]==-1) dfs1(next);
        dp[cur] = max(dp[cur], dp[next]+curCnt[cur]);
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, k; cin >> n >> k;
    vector<stair> v;
    for(int i=0;i<n;i++) {
        int cnt, x, y, len; cin >> cnt >> x >> y >> len;
        v.push_back({x, y, len, cnt});
    }
    sort(v.begin(), v.end());

    // 서로 점프할 수 있는 계단 확인
    for(int i=0;i<n;i++) {
        for(int j=i+1;j<n;j++) {
            if(getDist(v[i], v[j])<=k) {
                conn[i].push_back(j);
                if(v[i].y==v[j].y) conn[j].push_back(i);
            }
        }
    }

    // SCC로 자유롭게 오갈수 있는 계단 확인
    for(int i=0;i<n;i++) {
        if(!visited[i]) dfs(i);
    }

    // 한 scc에서 모을 수 있는 사탕의 개수 확인
    for(auto scc:SCCs) {
        for(int e:scc) {
            for(int next:conn[e]) {
                sccConn[sccNum[e]].insert(sccNum[next]); // scc간의 간선
            }
            curCnt[sccNum[e]] += v[e].cnt;
            if(v[e].y<=k) canJumpToScc[sccNum[e]]=true; // 맨 처음에 점프해서 도달 할 수 있음
        }
    }

    // 점프 할 수있는 계단에서 시작해 최대 모을 수 있는 사탕의 개수 확인
    memset(dp, -1, sizeof(dp));
    int maxCnt=0;
    for(int i=0;i<sccCnt;i++) {
        if(dp[i]==-1) {
            dfs1(i);
            if(canJumpToScc[i]) maxCnt = max(maxCnt, dp[i]);
        }
    }
    cout << maxCnt;
}