#include<bits/stdc++.h>
using namespace std;

int arr[5][5];
int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};
set<string> s;

void dfs(string S, int x, int y) {
    if(S.length()==6) {
        s.insert(S);
        return;
    }

    for(int i=0;i<4;i++) {
        int nextX = x+moveX[i];
        int nextY = y+moveY[i];
        if(nextX<0 || nextX>=5 || nextY<0 || nextY>=5) continue;
        dfs(S+to_string(arr[nextX][nextY]), nextX, nextY);
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    for(int i=0;i<5;i++) {
        for(int j=0;j<5;j++) {
            cin >> arr[i][j];
        }
    }

    for(int i=0;i<5;i++) {
        for(int j=0;j<5;j++) {
            dfs("", i, j);
        }
    }
    cout << s.size();
}