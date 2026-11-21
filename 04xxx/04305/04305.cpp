#include<bits/stdc++.h>
#define MAX 27

using namespace std;

int N, idx=1;
int parent[MAX] = {0, };
bool visited[MAX] = {false, };
vector<set<int>> connect;
vector<set<int>> SCCs;
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
        SCCs.push_back(set<int>());
        while(true) {
            int top = stk.top(); stk.pop();
            visited[top]=true;
            parent[top]=remember;
            SCCs.back().insert(top);
            if(top==cur) {
                break;
            }
        }
    }
    return remember;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        int N; cin >> N;
        if(N==0) {
            break;
        }

        idx=1;
        SCCs = vector<set<int>>();
        connect = vector<set<int>>(MAX+1);
        fill(parent, parent+MAX, 0);
        fill(visited, visited+MAX, false);
        stk = {};

        bool usedAlphabet[MAX+1] = {false, };
        while(N-->0) {
            char chars[5];
            for(int i=0;i<5;i++) {
                cin >> chars[i];
                usedAlphabet[chars[i]-'A'+1]=true;
            }
            char check; cin >> check;
            for(int i=0;i<5;i++) {
                if(check!=chars[i]) {
                    connect[check-'A'+1].insert(chars[i]-'A'+1);
                }
            }
        }

        for(int i=1;i<=26;i++) {
            if(!visited[i] && usedAlphabet[i]) {
                dfs(i);
            }
        }

        sort(SCCs.begin(), SCCs.end());
        for(auto SCC:SCCs) {
            for(int val:SCC) {
                cout << char(val+'A'-1) << " ";
            }
            cout << endl;
        }
        cout << endl;
    }
}