#include<bits/stdc++.h>
using namespace std;

int parent[51];

int _find(int x) {
    if(parent[x]==x) return x;
    return parent[x] = _find(parent[x]);
}

void _union(int x, int y) {
    x = _find(x);
    y = _find(y);
    if(x<y) parent[y]=x;
    else parent[x]=y;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    for(int i=0;i<=N;i++) {
        parent[i]=i;
    }

    int cnt; cin >> cnt;
    while(cnt-->0) {
        int x; cin >> x;
        parent[x]=0;
    }

    vector<vector<int>> party(M);
    for(int i=0;i<M;i++) {
        cin >> cnt;
        if(cnt) {
            int first; cin >> first;
            party[i].push_back(first);
            while(cnt-->1) {
                int next; cin >> next;
                party[i].push_back(next);
                _union(first, next);
            }
        }
    }

    cnt=0;
    for(int i=0;i<M;i++) {
        bool chk=true;
        for(int x:party[i]) {
            if(_find(x)==0) {
                chk=false;
                break;
            }
        }
        if(chk) cnt++;
    }
    cout << cnt;
}