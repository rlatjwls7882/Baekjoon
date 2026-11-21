#include<bits/stdc++.h>
#define MAX 41

using namespace std;

int idx=1;
int parent[MAX] = {0, };
int visited[MAX] = {false, };
vector<vector<int>> SCCs;
vector<vector<int>> connect = vector<vector<int>>(MAX);
stack<int> stk;

int dfs(int cur) {
    stk.push(cur);
    parent[cur]=idx;
    int remember = idx++;
    
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
            visited[top]=true;
            SCCs.back().push_back(top);
            parent[top]=remember;
            if(top==cur) {
                break;
            }
        }
    }
    return remember;
}

int getOppo(int x) {
    return x%2==0?x-1:x+1;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    while(M-->0) {
        int a, b; cin >> a >> b;
        a = a<0?-a*2-1:a*2;
        b = b<0?-b*2-1:b*2;
        connect[getOppo(a)].push_back(b);
        connect[getOppo(b)].push_back(a);
    }
    
    for(int i=1;i<=N*2;i++) {
        if(!visited[i]) {
            dfs(i);
        }
    }
    
    for(int i=1;i<=N*2;i+=2) {
        if(parent[i]==parent[i+1]) {
            cout << 0;
            return 0;
        }
    }
    
    int chk[N+1]; fill(chk, chk+N+1, -1);
    for(int i=SCCs.size()-1;i>=0;i--) {
        for(int j:SCCs[i]) {
            if(chk[(j+1)/2]==-1) {
                chk[(j+1)/2] = j%2;
            }
        }
    }
    
    cout << "1\n";
    for(int i=1;i<=N;i++) {
        cout << chk[i] << " ";
    }
}