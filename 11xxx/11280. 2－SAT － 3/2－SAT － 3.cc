#include<bits/stdc++.h>
#define MAX 20001

using namespace std;

int idx=1;
int parent[MAX] = {0, };
bool visited[MAX] = {false, };
vector<vector<int>> connect = vector<vector<int>>(MAX);
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

    if(parent[cur]==remember) {
        SCCs.push_back(vector<int>());
        while(true) {
            int top = stk.top(); stk.pop();
            SCCs.back().push_back(top);
            visited[top]=true;
            parent[top]=remember;
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
    int N, M; cin >> N >> M;
    while(M-->0) {
        int x, y; cin >> x >> y;
        x = x<0 ? -x*2-1:x*2;
        y = y<0 ? -y*2-1:y*2;
        connect[oppo(x)].push_back(y);
        connect[oppo(y)].push_back(x);
    }

    for(int i=1;i<=N*2;i++) {
        if(!visited[i]) {
            dfs(i);
        }
    }

    bool chk=true;
    for(int i=1;i<=N*2;i+=2) {
        if(parent[i]==parent[i+1]) {
            chk=false;
            break;
        }
    }

    if(chk) {
        cout << 1;
    } else {
        cout << 0;
    }
}