#include<bits/stdc++.h>
#define MAX 2001

using namespace std;

int idx;
int parent[MAX];
bool visited[MAX];
vector<vector<int>> connect;
vector<vector<int>> SCCs;
stack<int> stk;

int dfs(int cur) {
    stk.push(cur);
    int remember=idx;
    parent[cur]=idx++;

    for(int next:connect[cur]) {
        if(parent[next]==0) {
            remember = min(remember, dfs(next));
        } else if(!visited[next]) {
            remember = min(remember, parent[next]);
        }
    }

    if(remember==parent[cur]) {
        SCCs.push_back(vector<int>());
        while(true) {
            int top = stk.top(); stk.pop();
            parent[top]=remember;
            visited[top]=true;
            SCCs.back().push_back(top);
            if(top==cur) {
                break;
            }
        }
    }
    return remember;
}

int oppo(int x) {
    return x%2==0?x-1:x+1;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        int N, M; cin >> N >> M;
        if(cin.fail()) break;

        idx=1;
        memset(parent, 0, sizeof(parent));
        memset(visited, false, sizeof(visited));
        connect = vector<vector<int>>(MAX);
        SCCs = vector<vector<int>>();
        stk = {};

        while(M-->0) {
            int x, y; cin >> x >> y;
            x = x<0?-x*2-1:x*2;
            y = y<0?-y*2-1:y*2;
            connect[oppo(x)].push_back(y);
            connect[oppo(y)].push_back(x);
        }

        for(int i=1;i<=2*N;i++) {
            if(!visited[i]) {
                dfs(i);
            }
        }

        bool chk=true;
        for(int i=1;i<=2*N;i+=2) {
            if(parent[i]==parent[i+1]) {
                chk=false;
                break;
            }
        }
        cout << (chk ? "1\n" : "0\n");
    }
}