#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    bool notSosu[10000] = {false, };
    for(int i=2;i*i<=9999;i++) {
        if(!notSosu[i]) {
            for(int j=i*i;j<=9999;j+=i) {
                notSosu[j]=true;
            }
        }
    }

    int T; cin >> T;
    while(T-->0) {
        int S, E; cin >> S >> E;
        queue<int> q; q.push(S);
        int visited[10000]; fill(visited, visited+10000, -1);
        visited[S]=0;
        while(!q.empty()) {
            int cur = q.front(); q.pop();
            if(visited[E]!=-1) break;
            for(int i=0;i<4;i++) {
                for(int j=0;j<=9;j++) {
                    if(i==0 && j==0) continue;
                    string s = to_string(cur);
                    s[i]='0'+j;
                    int next = stoi(s);
                    if(notSosu[next] || visited[next]!=-1) continue;
                    visited[next] = visited[cur]+1;
                    q.push(next);
                }
            }
        }
        if(visited[E]==-1) cout << "Impossible\n";
        else cout << visited[E] << '\n';
    }
}