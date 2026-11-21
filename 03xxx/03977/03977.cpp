#include<bits/stdc++.h>
#define MAX 100001

using namespace std;

int N, idx=1;
int parent[MAX];
int degree[MAX];
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
            SCCs.back().push_back(top);
            parent[top]=remember;
            visited[top]=true;
            if(top==cur) {
                break;
            }
        }
    }
    return remember;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    for(int cases=1;cases<=T;cases++) {
        int M; cin >> N >> M;
        
        idx=1;
        fill(parent, parent+N, 0);
        fill(degree, degree+N, 0);
        fill(visited, visited+N, false);
        connect = vector<vector<int>>(N);
        SCCs = vector<vector<int>>();
        stk = {};

        while(M-->0) {
            int A, B; cin >> A >> B;
            connect[A].push_back(B);
        }

        for(int i=0;i<N;i++) {
            if(!visited[i]) {
                dfs(i);
            }
        }

        for(int i=0;i<N;i++) {
            for(int next:connect[i]) {
                if(parent[i]!=parent[next]) {
                    degree[next]++;
                }
            }
        }

        int cnt=0;
        for(vector<int> SCC:SCCs) {
            bool chk=true;
            for(int next:SCC) {
                if(degree[next]>0) {
                    chk=false;
                    break;
                }
            }
            if(chk) {
                cnt++;
            }
        }

        if(cnt==1) {
            for(vector<int> SCC:SCCs) {
                bool chk=true;
                for(int next:SCC) {
                    if(degree[next]>0) {
                        chk=false;
                        break;
                    }
                }
                if(chk) {
                    sort(SCC.begin(), SCC.end());
                    for(int next:SCC) {
                        cout << next << endl;
                    }
                    break;
                }
            }
            cout << endl;
        } else {
            cout << "Confused\n\n";
        }
    }
}