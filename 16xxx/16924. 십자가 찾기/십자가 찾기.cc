#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    string s[n];
    for(int i=0;i<n;i++) {
        cin >> s[i];
    }

    vector<tuple<int, int, int>> res;
    bool visited[n][m];
    memset(visited, false, sizeof(visited));
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            if(s[i][j]=='*') {
                for(int k=1;;k++) {
                    int cnt=0;
                    for(int l=0;l<4;l++) {
                        int nextX = i+moveX[l]*k;
                        int nextY = j+moveY[l]*k;
                        if(nextX<0 || nextX>=n || nextY<0 || nextY>=m || s[nextX][nextY]=='.') continue;
                        cnt++;
                    }
                    if(cnt==4) {
                        visited[i][j]=true;
                        for(int l=0;l<4;l++) {
                            int nextX = i+moveX[l]*k;
                            int nextY = j+moveY[l]*k;
                            visited[nextX][nextY]=true;
                        }
                    } else {
                        if(k!=1) res.push_back({i+1, j+1, k-1});
                        break;
                    }
                }
            }
        }
    }

    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            if(s[i][j]=='*' && !visited[i][j]) {
                cout << -1;
                return 0;
            }
        }
    }

    cout << res.size() << '\n';
    for(auto val:res) {
        cout << get<0>(val) << ' ' << get<1>(val) << ' ' << get<2>(val) << '\n';
    }
}