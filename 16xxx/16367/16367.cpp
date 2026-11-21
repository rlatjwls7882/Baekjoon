#include<bits/stdc++.h>
using namespace std;

const int MAX = 10'000;

bool visited[MAX];
int idx, parent[MAX], res[MAX];
vector<vector<int>> conn(MAX), SCCs;
stack<int> stk;

int dfs(int cur) {
    stk.push(cur);
    int rem = parent[cur] = ++idx;

    for(int next:conn[cur]) {
        if(!parent[next]) rem = min(rem, dfs(next));
        else if(!visited[next]) rem = min(rem, parent[next]);
    }

    if(rem == parent[cur]) {
        SCCs.push_back(vector<int>());
        while(true) {
            int top = stk.top(); stk.pop();
            SCCs.back().push_back(top);
            parent[top] = rem;
            visited[top] = true;
            if(top==cur) break;
        }
    }
    return rem;
}

int oppo(int x) {
    return x%2==0 ? x+1 : x-1;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int k, n; cin >> k >> n;
    while(n--) {
        // B : 짝수, R : 홀수
        int l1, l2, l3; char c1, c2, c3; cin >> l1 >> c1 >> l2 >> c2 >> l3 >> c3;
        l1 = c1=='B' ? l1*2-2 : l1*2-1;
        l2 = c2=='B' ? l2*2-2 : l2*2-1;
        l3 = c3=='B' ? l3*2-2 : l3*2-1;

        // !l1 -> l2, l3
        conn[oppo(l1)].push_back(l2);
        conn[oppo(l1)].push_back(l3);

        // !l2 -> l1, l3
        conn[oppo(l2)].push_back(l1);
        conn[oppo(l2)].push_back(l3);

        // !l3 -> l1, l2
        conn[oppo(l3)].push_back(l1);
        conn[oppo(l3)].push_back(l2);
    }

    for(int i=0;i<2*k;i++) {
        if(!visited[i]) {
            dfs(i);
        }
    }

    for(int i=0;i<2*k;i+=2) {
        if(parent[i]==parent[i+1]) {
            cout << -1;
            return 0;
        }
    }

    memset(res, -1, sizeof res);
    for(int i=SCCs.size()-1;i>=0;i--) {
        for(int e : SCCs[i]) {
            if(res[e/2]==-1) res[e/2] = e%2;
        }
    }
    for(int i=0;i<k;i++) {
        cout << (res[i] ? 'B' : 'R');
    }
}