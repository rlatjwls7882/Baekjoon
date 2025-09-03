#include<bits/stdc++.h>
using namespace std;

int n, m;
int cnt[50];
int maxSongCnt, maxDepth=-1;
bool chk[10][50], visited[10];

void back(int depth=0) {
    int cur=0;
    for(int i=0;i<m;i++) if(cnt[i]) cur++;

    if(maxSongCnt<cur) {
        maxSongCnt = cur;
        maxDepth = depth;
    } else if(maxSongCnt==cur) {
        maxDepth = min(maxDepth, depth);
    }

    for(int i=0;i<n;i++) {
        if(!visited[i]) {
            visited[i]=true;
            for(int j=0;j<m;j++) cnt[j] += chk[i][j];
            back(depth+1);
            for(int j=0;j<m;j++) cnt[j] -= chk[i][j];
            visited[i]=false;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    for(int i=0;i<n;i++) {
        string s; cin >> s >> s;
        for(int j=0;j<m;j++) {
            chk[i][j] = s[j]=='Y';
        }
    }
    back();
    cout << maxDepth;
}