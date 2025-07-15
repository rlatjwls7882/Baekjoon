#include<bits/stdc++.h>
using namespace std;

long long dp[200][200][100]; // dp[i][j][k] : (i, j)에서 해당 격자의 문자가 k번째로 오는 경우의 수
int dx[] = {1, 0, -1, 1, -1, 1, 0, -1};
int dy[] = {1, 1, 1, 0, 0, -1, -1, -1};
vector<string> grid(200);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int h, w, l; cin >> h >> w >> l;
    for(int i=0;i<h;i++) cin >> grid[i];
    string word; cin >> word;

    // 첫번째 문자 초기설정
    for(int i=0;i<h;i++) {
        for(int j=0;j<w;j++) {
            if(word[0]==grid[i][j]) {
                dp[i][j][0]=1;
            }
        }
    }

    for(int i=1;i<l;i++) {
        for(int j=0;j<h;j++) {
            for(int k=0;k<w;k++) {
                if(grid[j][k] == word[i]) { // 이전문자 -> 이번문자 연결
                    for(int n=0;n<8;n++) {
                        int nx = j+dx[n];
                        int ny = k+dy[n];
                        if(nx<0 || nx>=h || ny<0 || ny>=w || grid[nx][ny]!=word[i-1]) continue;
                        dp[j][k][i] += dp[nx][ny][i-1];
                    }
                }
            }
        }
    }

    long long total=0;
    for(int i=0;i<h;i++) {
        for(int j=0;j<w;j++) {
            total += dp[i][j][l-1];
        }
    }
    cout << total;
}