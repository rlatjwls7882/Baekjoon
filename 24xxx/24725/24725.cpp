#include<bits/stdc++.h>
using namespace std;

string s[200];
string MBTI[] = {"IE", "NS", "TF", "PJ"};
int dx[] = {1, 1, 1, 0, 0, -1, -1, -1};
int dy[] = {-1, 0, 1, -1, 1, -1, 0, 1};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) cin >> s[i];

    int cnt=0;
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            for(int k=0;k<8;k++) {
                for(int l=0;l<4;l++) {
                    int nx = i+dx[k]*l;
                    int ny = j+dy[k]*l;
                    if(nx<0 || nx>=n || ny<0 || ny>=m || (s[nx][ny]!=MBTI[l][0] && s[nx][ny]!=MBTI[l][1])) break;
                    if(l==3) cnt++;
                }
            }
        }
    }
    cout << cnt;
}