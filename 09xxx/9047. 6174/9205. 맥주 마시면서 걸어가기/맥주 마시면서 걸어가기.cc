#include<bits/stdc++.h>
using namespace std;

int parent[102];
int _find(int x) {
    if(parent[x]==x) return x;
    else return parent[x] = _find(parent[x]);
}

void _union(int x, int y) {
    x = _find(x);
    y = _find(y);
    if(x<y) parent[y]=x;
    else parent[x]=y;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        int pos[n+2][2];
        for(int i=0;i<n+2;i++) {
            cin >> pos[i][0] >> pos[i][1];
        }

        for(int i=0;i<n+2;i++) {
            parent[i]=i;
        }

        for(int i=0;i<n+2;i++) {
            for(int j=i+1;j<n+2;j++) {
                if(abs(pos[i][0]-pos[j][0])+abs(pos[i][1]-pos[j][1])<=1000) {
                    _union(i, j);
                }
            }
        }
        if(_find(n+1)==0) cout << "happy\n";
        else cout << "sad\n";
    }
}