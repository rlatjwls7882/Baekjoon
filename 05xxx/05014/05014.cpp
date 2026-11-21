#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int F, S, G, U, D; cin >> F >> S >> G >> U >> D;
    
    bool visited[F+1] = {false, };
    queue<P> q; q.push(P(S, 0));
    visited[S]=true;
    while(!q.empty()) {
        P cur = q.front(); q.pop();
        if(cur.first==G) {
            cout << cur.second;
            return 0;
        }
        if(cur.first-D>=1 && !visited[cur.first-D]) {
            visited[cur.first-D]=true;
            q.push(P(cur.first-D, cur.second+1));
        }
        if(cur.first+U<=F && !visited[cur.first+U]) {
            visited[cur.first+U]=true;
            q.push(P(cur.first+U, cur.second+1));
        }
    }
    cout << "use the stairs";
}