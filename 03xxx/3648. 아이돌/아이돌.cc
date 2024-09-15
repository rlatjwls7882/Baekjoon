#include<bits/stdc++.h>
#define MAX 2001

using namespace std;

int idx=1;
int parent[MAX] = {0, };
bool visited[MAX] = {false, };
vector<vector<int>> connect = vector<vector<int>>(MAX);
vector<vector<int>> SCCs;
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

    if(remember==parent[cur]) {
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
    while(true) {
        int n, m; cin >> n >> m;
        if(cin.fail()) {
            break;
        }

        idx=1;
        fill(parent, parent+MAX, 0);
        fill(visited, visited+MAX, false);
        connect = vector<vector<int>>(MAX);
        SCCs = vector<vector<int>>();
        stk = {};

        while(m-->0) {
            int a, b; cin >> a >> b;
            a = a<0 ? -a*2-1:a*2;
            b = b<0 ? -b*2-1:b*2;
            connect[oppo(a)].push_back(b);
            connect[oppo(b)].push_back(a);
        }
        connect[oppo(2)].push_back(2); // 상근이가 뽑히지 않았다면 상근이가 뽑혀야함

        for(int i=1;i<=2*n;i++) {
            if(!visited[i]) {
                dfs(i);
            }
        }

        bool chk=true;
        for(int i=1;i<=2*n;i+=2) {
            if(parent[i]==parent[i+1]) {
                chk=false;
                cout << "no\n";
                break;
            }
        }
        if(chk) {
            cout << "yes\n";
        }
    }
}