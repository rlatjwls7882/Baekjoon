#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int S, E;
vector<set<int>> connect = vector<set<int>>(10001);
bool visited[10001] = {false, };
int beforeVisit[10001];

int bfs(int x) {
    queue<P> q; q.push(P(x, 0));
    visited[x]=true;
    beforeVisit[x]=0;
    while(!q.empty()) {
        P cur = q.front(); q.pop();
        for(int next:connect[cur.first]) {
            if(!visited[next]) {
                visited[next]=true;
                beforeVisit[next] = cur.first;
                q.push(P(next, cur.second+1));
                if(next==S || next==E) return cur.second+1;
            }
        }
    }
    return -1;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    while(M-->0) {
        int A, B; cin >> A >> B;
        connect[A].insert(B);
        connect[B].insert(A);
    }
    cin >> S >> E;

    int cnt = bfs(S);
    fill(visited, visited+N+1, false);
    for(int i=beforeVisit[E];beforeVisit[i]!=0;i=beforeVisit[i]) {
        visited[i]=true;
    }
    cout << cnt + bfs(E);
}