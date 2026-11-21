#include<bits/stdc++.h>
using namespace std;

vector<vector<int>> child(2000);
int parent[2000], down[2000], up[2000], remember, parentOpenedCnt[2000], parentCnt[2000];
bool isOpened[2000];

void dfs(int cur, int cnt) {
    parentCnt[cur] = cnt;
    for(int next:child[cur]) {
        if(child[cur][0]==next) {
            down[cur] = next;
            up[next] = cur;
        } else {
            down[remember] = next;
            up[next] = remember;
        }
        dfs(next, cnt+1);
    }
    if(child[cur].empty()) remember = cur;
}

void dfsToggle(int cur, int val) {
    parentOpenedCnt[cur] += val;
    for(int next:child[cur]) {
        dfsToggle(next, val);
    }
}

void toggle(int cur) {
    for(int next:child[cur]) {
        isOpened[next] = !isOpened[next];
        dfsToggle(next, (isOpened[next]?1:-1));
    }
}

bool chk(int cur) {
    return isOpened[cur] && parentOpenedCnt[cur]==parentCnt[cur];
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, Q; cin >> N >> Q;
    for(int i=0;i<N;i++) {
        int cnt; cin >> cnt;
        while(cnt-->0) {
            int x; cin >> x;
            child[i].push_back(x-1);
            parent[x-1] = i;
        }
    }
    dfs(0, 0);
    toggle(0);

    int cur=child[0][0];
    while(Q-->0) {
        string s; cin >> s;
        if(s.compare("move")==0) {
            int k; cin >> k;
            int lastOpened = cur;
            while(k>0 && cur!=0) {
                cur = down[cur];
                if(chk(cur)) {
                    lastOpened=cur;
                    k--;
                }
            }
            while(k<0 && cur!=0) {
                cur = up[cur];
                if(chk(cur)) {
                    lastOpened=cur;
                    k++;
                }
            }
            cur = lastOpened;
            cout << cur+1 << '\n';
        } else {
            toggle(cur);
        }
    }
}