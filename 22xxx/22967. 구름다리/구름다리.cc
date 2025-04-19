#include<bits/stdc++.h>
using namespace std;

bool canMove[300][300];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n-1;i++) {
        int a, b; cin >> a >> b;
        canMove[a-1][b-1]=canMove[b-1][a-1]=true;
    }

    vector<pair<int, int>> res;
    if(n<=4) {
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(!canMove[i][j]) res.push_back({i+1, j+1});
            }
        }
        cout << res.size() << "\n1\n";
    } else {
        for(int i=1;i<n;i++) {
            if(!canMove[0][i]) res.push_back({1, i+1});
        }
        cout << res.size() << "\n2\n";
    }
    for(auto e:res) cout << e.first << ' ' << e.second << '\n';
}